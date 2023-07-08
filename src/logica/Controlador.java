package logica;

import java.util.ArrayList;

import Vista.Producto;

public class Controlador {
	
	private String n;
	ArrayList<Producto> misCompras;

	public Controlador() {
		misCompras = new ArrayList<>();
		
	}
	
	public void agregarCompra(Producto e) {
		misCompras.add(e);
	}
	
	
	

}
