package com.ynz.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;


public class AbstractController {

    @GetMapping("/getAll")
    public List<String> getAll() {
        return Arrays.asList("desk1","desk2","desk3");
    }
}
