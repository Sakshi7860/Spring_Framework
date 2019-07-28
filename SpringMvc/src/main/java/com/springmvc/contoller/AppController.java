package com.springmvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
	@RequestMapping("/hello")
	public ModelAndView print()
	{
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}
	

}
