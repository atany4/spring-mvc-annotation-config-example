package com.mvc.spring.controllers;

import com.mvc.spring.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/", "/welcome"})
    public String welcome() {
        return "welcome";
    }

    private ProductService service;

    @Autowired
    public void setService(ProductService service) {
        this.service = service;
    }

    @GetMapping("/list")
    public String listProducts(Model model) {
        model.addAttribute("products", service.getProducts());
        return "product";
    }
}
