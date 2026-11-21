package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Rectangulo;

public class TestGraficar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graficador g1 = new Graficador();
		Figura f1 = new Figura("Figura", "Blanco");
		Cuadrado c1 = new Cuadrado("Cuadro", "Rojo", 12);
		Rectangulo r1 = new Rectangulo("Rectangulo", "Amarillo",12,24);
		
		g1.graficar(f1);
		g1.graficar(c1);
		g1.graficar(r1);
		
		

	}

}
