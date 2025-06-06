package pe.edu.cientifica.clase09.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import pe.edu.cientifica.clase09.serviceImp.CategoriaService;

@Controller
public class CategoriaController {
	
	@Autowired
	private CategoriaService categoriaService;
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("cats", categoriaService.readAll());
		return "index";
	}
}
