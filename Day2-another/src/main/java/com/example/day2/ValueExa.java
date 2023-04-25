package com.example.day2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ValueExa {
	@Value
	public String car;
	@GetMapping("mycar")
	@ResponseBody
	public String displayCar()
	{
		return "My fav car "+car;
	}
	

}
