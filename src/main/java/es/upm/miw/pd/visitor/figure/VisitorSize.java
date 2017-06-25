package es.upm.miw.pd.visitor.figure;

public class VisitorSize extends Visitor {
	
	private double totalSides;
	
	public VisitorSize(){
		totalSides = 0;
	}
	
	public double getTotalSides(){
		return totalSides;
	}
	
	public void addTotalSides(double partialSides){
		totalSides += partialSides;
	}

	@Override
	public void visitCuadrado(Cuadrado cuadrado) {
		addTotalSides(cuadrado.numberOfSides());
	}

	@Override
	public void visitTriangulo(Triangulo triangulo) {
		addTotalSides(triangulo.numberOfSides());
	}

	@Override
	public void visitCirculo(Circulo circulo) {
		addTotalSides (circulo.numberOfSides());
	}

	@Override
	public double getTotalArea() {
		// TODO Auto-generated method stub
		return 0;
	}



}
