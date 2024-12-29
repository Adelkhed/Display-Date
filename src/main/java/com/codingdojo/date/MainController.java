package com.codingdojo.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class MainController {
	@RequestMapping("/")
	public String dashboard() {
		return "dashboard.jsp";
		
	}
	@RequestMapping("/date")
	public String date(Model model) {
		SimpleDateFormat formatDate = new SimpleDateFormat("EEEEEEEE, MMMMMMMM d, ''yy");
		String currentDate = formatDate.format(new Date());
		model.addAttribute("currentDate", currentDate);
		return "date.jsp";
	}
	@RequestMapping("/time")
	public String time(Model model) {
		SimpleDateFormat formatTime = new SimpleDateFormat("h:mm a");
		String currentTime = formatTime.format(new Date());
		model.addAttribute("currentTime",currentTime);
		return "time.jsp";
	}
	

}
