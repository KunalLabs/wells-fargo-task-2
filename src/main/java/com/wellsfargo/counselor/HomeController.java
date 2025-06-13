package com.wellsfargo.counselor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "✅ Spring Boot is Running! Welcome to the Wells Fargo App!";
    }
}
