package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Hexagono;
import com.krakedev.figuras.Rectangulo;
import com.krakedev.figuras.Triangulo;
import com.krakedev.figuras.TrianguloRectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== PRUEBA DE PERIMETROS ===\n");
		// CUADRADO
		Cuadrado c1 = new Cuadrado("Cuadrado", "Azul", 5);
		int perimetroCuadrado = c1.calcularPerimetro();
		System.out.println("Perimetro de cuadrado de lado: " + c1.getLado() + " es " + perimetroCuadrado);

		// RECTANGULO
		Rectangulo r1 = new Rectangulo("Rectangulo", "Rojo", 4, 6);
		int perimetroRectangulo = r1.calcularPerimetro();
		System.out.println("Perimetro de rectangulo de Altura: " + r1.getAltura() + " y Base: " + r1.getBase() + " es "
				+ perimetroRectangulo);

		// GRAFICANDO CON POLIMORFISMO
		System.out.println();
		System.out.println("=== PRUEBA DE PERIMETROS POLIMORFISMO  ===\n");
		Graficador graficador = new Graficador();
		graficador.graficar(c1);
		graficador.graficar(r1);

		// GRAFICANDO CON TRIANGULO RECTANGULO
		TrianguloRectangulo tr1 = new TrianguloRectangulo("TrianguloRectangulo", "Verde", 8, 12);
		System.out.println();
		System.out.println("=== PRUEBA DE TRIANGULO RECTANGULO  ===\n");		
		graficador.graficar(tr1);
		
		// POLIFORMISMO HEXAGONO
		System.out.println();
		System.out.println("=== PRUEBA DE PERIMETROS HEXAGONO  ===\n");
		 Figura f3 = new Hexagono("Hexágono", "Verde", 10);
		 graficador.graficar(f3); 
		
	}

}
