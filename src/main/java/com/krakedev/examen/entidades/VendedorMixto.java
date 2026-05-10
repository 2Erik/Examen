package com.krakedev.examen.entidades;

public class VendedorMixto extends Vendedor{

    public VendedorMixto(String cedula, String tipo) {
        super(cedula, tipo);
    }
    
    //Metodo calcular sueldo
    @Override
    public double calcularSueldo() {
    	double bono = getSueldoFijo()*0.01*getNumeroVentas();
    	return getSueldoFijo()+bono;
    }
}
