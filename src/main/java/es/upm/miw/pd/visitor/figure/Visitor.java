package es.upm.miw.pd.visitor.figure;

public abstract class Visitor {
	
	public abstract void visitCuadrado(Cuadrado cuadrado);
	public abstract void visitTriangulo(Triangulo triangulo);
	public abstract void visitCirculo(Circulo circulo);
	public abstract double getTotalArea();
	public abstract double getTotalSides();

}
