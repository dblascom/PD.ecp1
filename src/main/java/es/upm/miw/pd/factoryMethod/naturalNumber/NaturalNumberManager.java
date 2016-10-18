package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {

    private NaturalNumber NaturalNumber;

    private NumberCreator NumberCreator;

    public NumberCreator createNumber(){
        NumberCreator.createNumber();
        return NumberCreator;
    };
    
    public NaturalNumber NaturalNumber(){
        NaturalNumber.setValue(0);
        return NaturalNumber;
    };
}
