package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller


public class HomeController {
    @GetMapping("/carsform")
    public String loadCarsForm(Model model) {
        model.addAttribute("cars", new Cars());
        return "carsform";
    }
    @PostMapping("/carsform")
    public String processCarsForm(@Valid Cars cars,
                                BindingResult result) {
        if (result.hasErrors()){
            return "carsform";
        }
        return "carsconfirm";
    }


}
