package com.example.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class Stringx {
@Value("vanakam da maapla !")	
private String message;
	@RequestMapping("/h")
	@ResponseBody
	public String Dot() {
	return "vanam fulla megam en manusulasogam" + message;
}
}
