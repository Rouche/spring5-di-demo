package com.resolutech.constrollers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("Hello~!~");

        return "zomg";
    }
}
