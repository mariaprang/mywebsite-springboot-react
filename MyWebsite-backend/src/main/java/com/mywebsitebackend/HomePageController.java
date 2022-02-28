package com.mywebsitebackend;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomePageController {

    @GetMapping("/about")
    public ResponseEntity getAboutPage(){
        return ResponseEntity.ok("Hello World");
    }




}
