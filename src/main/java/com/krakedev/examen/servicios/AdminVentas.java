package com.krakedev.examen.servicios;

import java.util.ArrayList;

import com.krakedev.examen.entidades.Vendedor;

public class AdminVentas {
	
	private ArrayList<Vendedor> vendedores;

    // Constructor
    public AdminVentas() {
        vendedores = new ArrayList<Vendedor>();
    }

    // Getter and Setters
    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    
    //Metodo agregar
    public void agregar(Vendedor vendedor) {
    	vendedores.add(vendedor);
    }
    
    //Metodo calcular sueldo
    public Double calcularSueldo(String cedula) {
    	for (Vendedor v : vendedores) {
			if(v.getCedula().equals(cedula)) {
				return v.calcularSueldo();
			}
		}
    	return null;
    }
	
}
