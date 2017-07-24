package com.relation2012.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kitagawa on 2017/07/24.
 * Api
 */
@RestController
public class ApiController {

    @GetMapping("/message")
    public String message() {
        throw new MessageNotFoundException("Message Not Found!!");
    }

    @GetMapping("/dream")
    public String dream() {
        throw new DreamNotFoundException("Dream Not Found!!");
    }
}
