package com.example.day1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Helloworld {
	@RequestMapping("/")
	@ResponseBody
public String Data() {
	return"Hi Arjun";
}
}
