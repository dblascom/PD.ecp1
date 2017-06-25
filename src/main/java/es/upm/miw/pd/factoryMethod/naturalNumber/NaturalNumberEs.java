package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {
	
    public NaturalNumberEs(int value) {
		super(value);
		String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};
		this.setTextValue(textValue);
		
	}

}
