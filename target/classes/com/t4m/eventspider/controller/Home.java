package com.t4m.eventspider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {

	@RequestMapping(value = "/")
	public String welcome() {
		return "/welcome";
	}

}
