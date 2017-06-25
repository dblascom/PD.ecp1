package es.upm.miw.pd.visitor.figure;

public class Circulo implements Figura {
	private double radius;
	
	public Circulo (double radius){
		this.radius = radius;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitCirculo(this);
	}
	
	public double getRadius(){
		return this.radius;
	}

	@Override
	public double numberOfSides() {
		return Double.POSITIVE_INFINITY;
	}
}
