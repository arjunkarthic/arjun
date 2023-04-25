package com.spring.snacks;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Demo2 {
	@RequestMapping("/")
	@ResponseBody
public String Data()
{
	return "hi arjun";
}
}
