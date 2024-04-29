package com.oguzhan.karacorlu.instastatistics.service;

import com.oguzhan.karacorlu.instastatistics.dto.InstagramUserDTO;
import com.oguzhan.karacorlu.instastatistics.exceptions.UsernameOrPasswordWrongException;
import org.springframework.stereotype.Service;

/**
 * @author oguzhan.karacorlu
 * @project instastatistics
 * @created 29.04.2024
 */
@Service
public class LoginService {

    /**
     * Instagram User's login username and password.
     *
     * @param instagramUserDTO
     * @return
     */
    public boolean loginUser(InstagramUserDTO instagramUserDTO) {
        try {

        } catch (Exception e) {
            throw new UsernameOrPasswordWrongException("Username or Password is Wrong!");
        }
        return false;
    }
}
