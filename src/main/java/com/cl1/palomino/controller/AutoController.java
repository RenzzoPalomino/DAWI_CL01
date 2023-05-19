package com.cl1.palomino.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cl1.palomino.Entity.Autos;
import com.cl1.palomino.Entity.Marca;
import com.cl1.palomino.service.AutosService;
import com.cl1.palomino.service.MarcaService;

@Controller
@RequestMapping("/appPalominoRegistro")
public class AutoController {
	@Autowired
	private MarcaService servicioMarca;
	@Autowired 
	private AutosService servicioAuto;
	
	@RequestMapping("/list")
	public String inicio(Model model) {
		model.addAttribute("autos",servicioAuto.listarTodo());
		model.addAttribute("marcas",servicioMarca.listarTodo());
		return "appPalominoRegistro";
	}
	
	
	@RequestMapping("/grabar")
	public String grabar(@RequestParam("nombre") String nom,@RequestParam("precio") double pre,@RequestParam("stock") int stock, 
			@RequestParam("marca") int codMarca, RedirectAttributes redirect) {
		
		try {
			Autos bean = new Autos();
			
			bean.setDescripcion(nom);
			bean.setPrecio(pre);
			bean.setStock(stock);
			Marca m = new Marca();
			m.setCodigo(codMarca);
			
			bean.setMarca(m);
			servicioAuto.registrar(bean);
			redirect.addFlashAttribute("MENSAJE", "Auto registrado");
			
		} catch (Exception e) {
			redirect.addFlashAttribute("MENSAJE", "Error en el registro");
			e.printStackTrace();
		}
		
		
		return "redirect:/appPalominoRegistro/list";
	}
	
	
}
