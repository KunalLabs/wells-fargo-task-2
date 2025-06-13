package com.wellsfargo.counselor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home"; // this should match a `home.html` or `home.jsp` template
    }
}
