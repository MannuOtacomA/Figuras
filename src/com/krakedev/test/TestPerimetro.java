package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Rectangulo;

public class TestPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("=== PRUEBA DE PERIMETROS ===\n");
		//CUADRADO
		Cuadrado c1 = new Cuadrado("Cuadrado", "Azul", 5);
		int perimetroCuadrado = c1.calcularPerimetro();
		System.out.println("Perimetro de cuadrado de lado: "+c1.getLado()+" es "+perimetroCuadrado);
		
		//RECTANGULO
		Rectangulo r1 = new Rectangulo("Rectangulo", "Rojo", 4, 6);
		int perimetroRectangulo = r1.calcularPerimetro();
		System.out.println("Perimetro de rectangulo de Altura: "+r1.getAltura()+" y Base: "+r1.getBase()+" es "+perimetroRectangulo);
		

	}

}
