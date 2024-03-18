package com.example.interceptor02;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/months")
public class MonthController {
    @Autowired
    MonthInterceptor monthInterceptor;

    @GetMapping("/month")
    public Month getMonth(HttpServletRequest request) {
        return (Month) request.getAttribute("month");
    }
}

