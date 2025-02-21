package com.ai.gt.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationService {
    public boolean validateName(String name) {

        char[] chars = name.toCharArray();
        for(Character c : chars) {
            if(!Character.isLetter(c)) {
                return false;
            }
        }
        System.out.println("Validation successful");
        return true;
    }
}
