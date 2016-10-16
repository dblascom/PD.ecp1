package es.upm.miw.pd.composite.expression;

public abstract class Operation extends Expression {

    private Expression firstExpression;
    
    private Expression secondExpression;
    
    public Operation(Expression firstExpression, Expression secondExpression){
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    public Expression getFirstExpression() {
        return firstExpression;
    }

    public Expression getSecondExpression() {
        return secondExpression;
    }
}
