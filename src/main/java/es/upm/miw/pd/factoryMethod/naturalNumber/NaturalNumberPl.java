package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberPl extends NaturalNumber {
    private int value;

    private static final String[] textValue = {"zero", "jeden", "dwa", "trzy", "cztery", "pięć"};

    public NaturalNumberPl(int value) {
        super(value);
    }

    public String getTextValue() {
      
            return NaturalNumberPl.textValue[this.value];
     
    }
}