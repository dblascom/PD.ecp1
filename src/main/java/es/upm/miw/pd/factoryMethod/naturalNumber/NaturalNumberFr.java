package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberFr extends NaturalNumber {

    private int value;

    private static final String[] textValue = {"zéro", "un", "deux", "trois", "quatre", "cinq"};

    public NaturalNumberFr(int value) {
        super(value);
    }

    public String getTextValue() {
      
            return NaturalNumberFr.textValue[this.value];
     
    }
}
