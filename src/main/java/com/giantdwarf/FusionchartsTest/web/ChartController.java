package com.giantdwarf.FusionchartsTest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class ChartController {
	@GetMapping("/")
    public String main() {
        return "main";
    }
	@GetMapping("/chart")
    public String chart() {
        return "mixedChart";
    }

}
