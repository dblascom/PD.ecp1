package es.upm.miw.pd.visitor.figure;

import upm.jbb.IO;

public final class VisitorMain {
	
	private FiguresManager figuresManager = new FiguresManager();

	public VisitorMain() {
		figuresManager.add(new Triangulo(1,2));
		figuresManager.add(new Cuadrado(2));
		figuresManager.add(new Cuadrado(2));
		figuresManager.add(new Triangulo(1,2));
	
	}

	public void visitador() {
		IO.getIO().println("Numero de lados: " + figuresManager.totalNumberOfSides());
		IO.getIO().println("Area total: " + figuresManager.totalArea());
		
	}

	public static void main(String[] args) {
		IO.getIO().addView(new VisitorMain());
	}
}
