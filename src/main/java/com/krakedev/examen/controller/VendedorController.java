package com.krakedev.examen.controller;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

public class VendedorController {
	
	private AdminVentas adminVentas;

	public VendedorController() {
		adminVentas = new AdminVentas();
	}

	public void agregarVendedor(Vendedor vendedor) {

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
}
