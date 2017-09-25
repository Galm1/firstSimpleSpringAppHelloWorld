package com.theironyard.sampleApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class helloworls {

    @RequestMapping(path ="/")
    public String index() {
        return "Hello World!";
    }

}
