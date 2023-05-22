package com.captcha_task.controller;

import com.captcha_task.annotation.RequiresCaptcha;
import com.captcha_task.dto.HelloDto;
import com.captcha_task.dto.HelloResponseDto;
import com.captcha_task.service.ValidateCaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//Spring annotations
@RestController
@RequestMapping("/api")
public class MainController {

    //injected to validate the captcha response coming in the request.
    @Autowired
    ValidateCaptcha service;

    //URL - http://localhost:9001/api/welcome
    @PostMapping("/welcome")
    @ResponseStatus(code = HttpStatus.OK)
    //custom annotation
    @RequiresCaptcha
    public HelloResponseDto welcome(@RequestBody final HelloDto dto) {
        return new HelloResponseDto("Greetings " + dto.getName());
    }
}
