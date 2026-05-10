package com.krakedev.examen.vendedor.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorComision;

public class TestVendedorcomisionJUnit {

	@Test
	public void testCalcularSueldo() {

		VendedorComision vendedor = new VendedorComision("111111111", "V");
		vendedor.setNumeroVentas(10);
		vendedor.setComisionPorVenta(50.0);

		double resultado = vendedor.calcularSueldo();

		assertEquals(500.0, resultado);
	}
}
