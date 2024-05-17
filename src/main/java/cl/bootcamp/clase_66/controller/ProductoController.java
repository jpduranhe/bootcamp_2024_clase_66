package cl.bootcamp.clase_66.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.bootcamp.clase_66.model.Producto;
import cl.bootcamp.clase_66.service.ProductoService;

@Controller
@RequestMapping("/producto")
public class ProductoController {
	
	private final ProductoService productoService;
	

	
	public ProductoController(ProductoService productoService) {
		this.productoService = productoService;
	}

	@GetMapping("/form")
	public ModelAndView formGet() {
		
		return new ModelAndView("formulario-producto.jsp");
	}
	
	@PostMapping("/form")
	public ModelAndView formPost(@ModelAttribute Producto producto) {
		
		boolean resultado= productoService.nuevoProducto(producto);
		String view="formulario-exito.jsp";
		
		if(!resultado == false) {
			view="formulario-fallo.jsp";
		}
		return new ModelAndView(view);
	}
	
	@GetMapping("/id/{id}")
	public ModelAndView proIdGet(@PathVariable int id) {
		Producto producto=productoService.porId(id);
		ModelAndView modelAndView= new ModelAndView("muestra-producto.jsp");
		modelAndView.addObject("prod", producto);
		 return modelAndView;
	}
}
