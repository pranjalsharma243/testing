package com.test.mytest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {

    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a,@PathVariable int b) {
        return a + b;
    }
    @GetMapping("/subtract/{a}/{b}")
    public int subtract(@PathVariable int a, @PathVariable int b) {
        return a - b;
    }
}
