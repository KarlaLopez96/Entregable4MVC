package com.uca.capas.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.entities.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView initMain() {
		ModelAndView mav = new ModelAndView();
		Producto producto = new Producto();
		mav.addObject("message","Bienvenido a MVC");
		mav.addObject("producto",producto);
		mav.setViewName("index");
		return mav;
	}
	
	@RequestMapping("/formData")
	public ModelAndView form(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		if (result.hasErrors()) {
			mav.addObject("message","Hubo problemas al agregar producto");
			mav.setViewName("index");
		}
		else {
			mav.addObject("message","Producto agregado con exito");
			mav.setViewName("form");
		}
		return mav;
	}
}
