package com.krakedev.figuras;

public class Graficador {

	public void graficar(Figura figura) {
		// figura.calcularPerimetro();
		System.out.println("Graficando: " + figura.getNombre() + " de Color: " + figura.getColor()
				+ " con Perimetro: " + figura.calcularPerimetro()+" con Area: "+figura.calcularArea());
	}

}
