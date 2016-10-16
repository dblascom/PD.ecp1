package es.upm.miw.pd.composite.expression;

public class Multiplicacion extends Operation {

    public Multiplicacion(Expression firstExpression, Expression secondExpression){
        super(firstExpression, secondExpression);
    }
    
    @Override
    int operar() {
        return super.getFirstExpression().operar() * super.getSecondExpression().operar();
    }

    @Override
    public String toString() {
        String cad = "(" + super.getFirstExpression().toString() + "*" + super.getSecondExpression().toString() + ")";
        System.out.println(cad);
        return "(" + super.getFirstExpression().toString() + "*" + super.getSecondExpression().toString() + ")";
    }
}
