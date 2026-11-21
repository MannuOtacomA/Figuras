package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Figura;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Figura f1 = new Figura("Cuadrado","Amarillo");
		Figura c1 = new Cuadrado("Cuadrado","Verde",12);
		Figura t1 = new Triangulo("Triangulo","Negra");
		
		//System.out.println(f1);
		System.out.println(c1);
		System.out.println(t1);

	}

}
