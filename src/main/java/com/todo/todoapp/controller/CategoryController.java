package com.todo.todoapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {

    @GetMapping("/helloworld")
public String helloWorld(){
    return "Hello World";
}
}
