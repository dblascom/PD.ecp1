package es.upm.miw.pd.composite.expression;

public class Numero extends Expression {

    private int number;
    
    public Numero(int number){
        this.number = number;
    }
    
    @Override
    int operar() {
        return number;
    }

    @Override
    public String toString() {
        String cad1 = String.valueOf(number);
        System.out.println(cad1);
        return String.valueOf(number);
    }
}
