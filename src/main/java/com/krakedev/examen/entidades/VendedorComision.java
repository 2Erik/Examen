package com.krakedev.examen.entidades;

public class VendedorComision extends Vendedor {

	public VendedorComision(String cedula, String tipo) {
		super(cedula, tipo);
	}
	
	//Metodo calcular sueldo
	@Override
	public double calcularSueldo() {
		return getComisionPorVenta()*getNumeroVentas();
	}
}
