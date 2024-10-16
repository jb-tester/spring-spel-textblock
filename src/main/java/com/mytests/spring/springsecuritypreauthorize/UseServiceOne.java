package com.mytests.spring.springsecuritypreauthorize;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

@Service
public class UseServiceOne {

   @Value("""
          #{@one.method11}
          """)
   private boolean m11;

    @PreAuthorize("""
                  @one.method12()
                  """)
    public void useOneMethod12() {
        System.out.println("buzz");
    }
}
