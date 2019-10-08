package com.example.demo.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReverseStringEndpoint {

    @GetMapping("/reverse/{stringToReverse}")
    public String getCurrentBalance(@PathVariable String stringToReverse) {

        return new StringBuilder(stringToReverse).reverse().toString();
    }

}
