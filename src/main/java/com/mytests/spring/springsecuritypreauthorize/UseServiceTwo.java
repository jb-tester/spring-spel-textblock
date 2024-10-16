package com.mytests.spring.springsecuritypreauthorize;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UseServiceTwo {

    @Value("#{@two.method21()}")
    boolean m21;

    @PreAuthorize("@two.method22()")
    public void useTwoMethod22() {
        System.out.println("bar");
    }
}
