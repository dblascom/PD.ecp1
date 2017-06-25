package es.upm.miw.pd.visitor.figure;

public class VisitorArea extends Visitor {
	
	private double totalArea;
	
	public VisitorArea(){
		totalArea = 0;
	}
	
	public double getTotalArea(){
		return totalArea;
	}
	
	public void addTotalArea(double partialArea){
		totalArea += partialArea;
	}

	@Override
	public void visitCuadrado(Cuadrado cuadrado) {
		addTotalArea(cuadrado.getSide() * cuadrado.getSide());
	}

	@Override
	public void visitTriangulo(Triangulo triangulo) {
		addTotalArea(triangulo.getBase() * triangulo.getHeight() * 0.5);

	}

	@Override
	public void visitCirculo(Circulo circulo) {
		addTotalArea(Math.PI * circulo.getRadius() * circulo.getRadius());
	}

	@Override
	public double getTotalSides() {
		// TODO Auto-generated method stub
		return 0;
	}

}
