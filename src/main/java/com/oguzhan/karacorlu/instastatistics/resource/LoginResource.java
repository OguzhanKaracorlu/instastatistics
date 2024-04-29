package com.oguzhan.karacorlu.instastatistics.resource;

import com.oguzhan.karacorlu.instastatistics.dto.InstagramUserDTO;
import com.oguzhan.karacorlu.instastatistics.service.LoginService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


/**
 * @author oguzhan.karacorlu
 * @project instastatistics
 * @created 29.04.2024
 */

@AllArgsConstructor
@Validated
@RestController
@RequestMapping("/instastatistics/api")
public class LoginResource {

    private final LoginService loginService;

    @PostMapping("/login")
    @ResponseStatus(code = HttpStatus.OK)
    public Mono<ResponseEntity<Boolean>> loginInstagramUser(@Valid @RequestBody InstagramUserDTO instagramUserDTO) {
        if (loginService.loginUser(instagramUserDTO))
            return Mono.just(ResponseEntity.ok(true));
        else
            return Mono.just(ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false));

    }
}
