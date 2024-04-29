package com.oguzhan.karacorlu.instastatistics.exceptions;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * @author oguzhan.karacorlu
 * @project instastatistics
 * @created 29.04.2024
 */

@Getter
@Setter
public class ErrorDetails {

    private HttpStatus code;

    private List<String> message;

}
