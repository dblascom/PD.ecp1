package es.upm.miw.pd.command.calculator.solution;

import upm.jbb.IO;

public class SubtractCommand extends Operar {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		int valor = IO.getIO().readInt();
		this.getCalculator().subtract(valor);
	}

	@Override
	public String name() {
		return "Resta";
	}

}
