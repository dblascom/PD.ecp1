package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class AddCommand extends Operar {
	
	public AddCommand(Calculator calculator){
		super(calculator);
	}

	@Override
	public void execute() {
		int valor = IO.getIO().readInt();
		this.getCalculator().add(valor);
	}

	@Override
	public String name() {
		return "Suma";
	}
	

}
