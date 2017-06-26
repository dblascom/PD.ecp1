package es.upm.miw.pd.command.calculator;

public class Operar implements Comando {
	
	private Calculator calculator;
	
	public Operar(Calculator calculator){
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub

	}

	@Override
	public String name() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Calculator getCalculator(){
		return this.calculator;
	}

}
