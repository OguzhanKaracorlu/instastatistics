package com.oguzhan.karacorlu.instastatistics.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author oguzhan.karacorlu
 * @project instastatistics
 * @created 29.04.2024
 */
@ControllerAdvice
public class InstaStaticsExceptionHandler extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders httpHeaders, HttpStatusCode httpStatusCode, WebRequest webRequest) {
        ErrorDetails error = new ErrorDetails();
        error.setCode(HttpStatus.BAD_REQUEST);

        List<String> collect = ex.getBindingResult().getFieldErrors().stream().filter(Objects::nonNull)
                .map(m -> (m.getField() + " " + m.getDefaultMessage())).toList();
        List<String> message = new ArrayList<String>(collect);
        error.setMessage(message);
        return new ResponseEntity<Object>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(UsernameOrPasswordWrongException.class)
    @ResponseBody
    public ResponseEntity<String> handleInstaStaticsException(UsernameOrPasswordWrongException usernameOrPasswordWrongException) {
        return ResponseEntity.status(HttpStatus.FORBIDDEN).body(usernameOrPasswordWrongException.getMessage());
    }
}

