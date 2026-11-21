package com.krakedev.figuras;

public class TrianguloRectangulo extends Figura {

	private int catetoA;
	private int catetoB;
	private int hipotenusa;

	public TrianguloRectangulo(String nombre, String color, int catetoA, int catetoB) {
		super(nombre, color);
		this.catetoA = catetoA;
		this.catetoB = catetoB;
		this.hipotenusa = calcularHipotenusa();
	}

	public int getCatetoA() {
		return catetoA;
	}

	public void setCatetoA(int catetoA) {
		this.catetoA = catetoA;
	}

	public int getCatetoB() {
		return catetoB;
	}

	public void setCatetoB(int catetoB) {
		this.catetoB = catetoB;
	}

	public int getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(int hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	public int calcularHipotenusa() { // RAIZ a2+b2
		return (int) (Math.sqrt(Math.pow(catetoA, 2) + Math.pow(catetoB, 2)));
	}

	@Override
	public int calcularPerimetro() {// P=a+b+
		return (int) (catetoA + catetoB + hipotenusa);
	}

	@Override
	public double calcularArea() {
		return (catetoA * catetoB) / 2;
	}

}
