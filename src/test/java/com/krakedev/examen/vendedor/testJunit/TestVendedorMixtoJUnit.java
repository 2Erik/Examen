package com.krakedev.examen.vendedor.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.VendedorMixto;

public class TestVendedorMixtoJUnit {

	@Test
	public void testCalcularSueldo() {

		VendedorMixto vendedor = new VendedorMixto("11111111", "V");
		vendedor.setSueldoFijo(1000.0);
		vendedor.setNumeroVentas(5);

		double resultado = vendedor.calcularSueldo();

		assertEquals(1050.0, resultado);
	}
}
