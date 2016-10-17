package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberEs extends NaturalNumber {
    private int value;

    private static final String[] textValue = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

    public NaturalNumberEs(int value) {
        super(value);
    }

    public String getTextValue() {
      
            return NaturalNumberEs.textValue[this.value];
     
    }
}
