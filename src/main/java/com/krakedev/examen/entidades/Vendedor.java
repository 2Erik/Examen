package com.krakedev.examen.entidades;

public class Vendedor {
	private String cedula;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVenta;
	
	//Constructor
	public Vendedor(String cedula) {
		super();
		this.cedula = cedula;
	}
	
	//Getters and Setters
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public double getComisionPorVenta() {
		return comisionPorVenta;
	}

	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}
	
	//Metodo toString
	@Override
	public String toString() {
		return "Vendedor [cedula=" + cedula + ", numeroVentas=" + numeroVentas + ", sueldoFijo=" + sueldoFijo
				+ ", comisionPorVenta=" + comisionPorVenta + "]";
	}
	
	//Metodo Calcular Sueldo
	public double calcularSueldo() {
		return sueldoFijo;
	}
	
}
