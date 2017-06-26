package es.upm.miw.pd.command.calculator.solution;

public class ResetCommand extends Operar {

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	@Override
	public void execute() {
		this.getCalculator().reset();
	}

	@Override
	public String name() {
		return "Reset";
	}

}
