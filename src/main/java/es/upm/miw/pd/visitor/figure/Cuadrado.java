package es.upm.miw.pd.visitor.figure;

public class Cuadrado implements Figura {
	private double side;
	
	public Cuadrado(double side){
		this.side = side;
	}
	@Override
	public void accept(Visitor v) {
		v.visitCuadrado(this);
	}
	
	public double numberOfSides() {
        return 4;
    }
	
	public double getSide(){
		return this.side;
	}

}
