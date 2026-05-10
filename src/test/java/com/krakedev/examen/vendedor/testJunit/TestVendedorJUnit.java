package com.krakedev.examen.vendedor.testJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.entidades.Vendedor;

public class TestVendedorJUnit {
	@Test
	public void testCalcularSueldo() {

		Vendedor vendedor = new Vendedor("111111111", "V");
		vendedor.setSueldoFijo(850.50);

		double resultado = vendedor.calcularSueldo();

		assertEquals(850.50, resultado);
	}
}
