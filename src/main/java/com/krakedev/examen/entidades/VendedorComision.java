package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision(String cedula) {
		super(cedula);
	}
	
	//Metodo calcular sueldo
	@Override
	public double calcularSueldo() {
		return getComisionPorVenta()*getNumeroVentas();
	}
}
