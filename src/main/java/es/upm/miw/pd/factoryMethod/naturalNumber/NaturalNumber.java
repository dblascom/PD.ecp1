package es.upm.miw.pd.factoryMethod.naturalNumber;

public abstract class NaturalNumber {
    private int value;

    private static String[] textValue = null;

    public NaturalNumber(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        assert value >= 0;
        this.value = value;
    }

    public void add(int value) {
        this.setValue(this.value + value);
    }
    
    public void setTextValue(String[] textValue){
    	NaturalNumber.textValue = textValue; 
    }

    public String getTextValue() {
        if (this.value < textValue.length) {
            return NaturalNumber.textValue[this.value];
        } else {
            return "???";
        }
    }

}
