package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEn extends NaturalNumber {
	
    public NaturalNumberEn(int value) {
		super(value);
		String[] textValue = {"zero", "one", "two", "three", "four", "five"};
		this.setTextValue(textValue);
		
	}

}
