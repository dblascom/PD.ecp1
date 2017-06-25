package es.upm.miw.pd.visitor.figure;

import es.upm.miw.pd.visitor.figure.Visitor;

public interface Figura {
	void accept(Visitor v);
	double numberOfSides();	

}
