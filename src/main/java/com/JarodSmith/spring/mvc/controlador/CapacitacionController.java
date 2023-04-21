package com.JarodSmith.spring.mvc.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CapacitacionController {

	@RequestMapping("/newTraining")
	public String newTraining() {
		return "crearCapacitacion";
	}
	
	@RequestMapping("/ListTrainig")
	public String listTraining() {
		return "listarCapacitacion";
	}
}
