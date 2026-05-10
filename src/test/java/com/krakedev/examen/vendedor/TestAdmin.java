package com.krakedev.examen.vendedor;

import com.krakedev.examen.entidades.Vendedor;
import com.krakedev.examen.entidades.VendedorComision;
import com.krakedev.examen.entidades.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminVentas admin = new AdminVentas();

		Vendedor vendedor = new Vendedor("111", "V");
		vendedor.setSueldoFijo(800);

		VendedorComision vendedorComision = new VendedorComision("222", "C");
		vendedorComision.setNumeroVentas(10);
		vendedorComision.setComisionPorVenta(50);

		VendedorMixto vendedorMixto = new VendedorMixto("333", "M");
		vendedorMixto.setSueldoFijo(1000);
		vendedorMixto.setNumeroVentas(5);

		admin.agregar(vendedor);
		admin.agregar(vendedorComision);
		admin.agregar(vendedorMixto);

		System.out.println("Sueldo vendedor: " + admin.calcularSueldo("111"));
		System.out.println("Sueldo vendedor con comision: " + admin.calcularSueldo("222"));
		System.out.println("Sueldo vendedor mixto: " + admin.calcularSueldo("333"));

		System.out.println("No existe: " + admin.calcularSueldo("999"));
	}

}
