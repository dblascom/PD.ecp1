package es.upm.miw.pd.visitor.figure;

public class Triangulo implements Figura {
	
	private double base;
	private double height;

	public Triangulo( double base, double height) {
		this.base = base;
	    this.height = height;
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}
	
	@Override
	public void accept(Visitor v) {
		v.visitTriangulo(this);
	}

	@Override
	public double numberOfSides() {
		return 3;
	}
	

}
