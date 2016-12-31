package com.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.dao.LanguageDao;

@Controller
@RequestMapping("/")
public class DemoController {

	private LanguageDao languageDao;

	@Autowired
	public DemoController(LanguageDao languageDao) {
		this.languageDao = languageDao;
	}

	@GetMapping
	public String demo(Model model) {
		model.addAttribute("languages", languageDao.list());
		return "index";
	}
}
