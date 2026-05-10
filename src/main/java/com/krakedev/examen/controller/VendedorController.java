package com.krakedev.examen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
	
	private AdminVentas adminVentas;

	public VendedorController() {
		adminVentas = new AdminVentas();
	}
	
	//Metodo agregar vendedor
	@PostMapping
	public void agregarVendedor(@RequestBody Vendedor vendedor) {

		Vendedor nuevoVendedor = null;

		if (vendedor.getTipo().equals("V")) {
			nuevoVendedor = new Vendedor(vendedor.getCedula(), vendedor.getTipo());
		} else if (vendedor.getTipo().equals("C")) {
			nuevoVendedor = new VendedorComision(vendedor.getCedula(), vendedor.getTipo());
		} else if (vendedor.getTipo().equals("M")) {
			nuevoVendedor = new VendedorMixto(vendedor.getCedula(), vendedor.getTipo());
		}

		nuevoVendedor.setNumeroVentas(vendedor.getNumeroVentas());
		nuevoVendedor.setSueldoFijo(vendedor.getSueldoFijo());
		nuevoVendedor.setComisionPorVenta(vendedor.getComisionPorVenta());

		adminVentas.agregar(nuevoVendedor);
	}
	
	//Metodo calcular sueldo vendedor
	@GetMapping("/{cedula}")
	public Double calcularSueldoVendedor(@PathVariable String cedula) {
	    return adminVentas.calcularSueldo(cedula);
	}
}
