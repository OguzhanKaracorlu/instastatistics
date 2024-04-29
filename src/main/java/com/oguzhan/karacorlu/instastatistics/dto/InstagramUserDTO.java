package com.oguzhan.karacorlu.instastatistics.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


/**
 * @author oguzhan.karacorlu
 * @project instastatistics
 * @created 29.04.2024
 */

@Getter
@Setter
@NoArgsConstructor
@ToString
public class InstagramUserDTO {

    @NotBlank(message = "Username not null")
    private String username;
    @NotBlank(message = "Password not null")
    private String password;

}
