package es.upm.miw.pd.factoryMethod.naturalNumber;

public class NaturalNumberManager {
	NaturalNumber naturalNumber;
	NaturalNumberCreator naturalNumberCreator;
	
	public NaturalNumber createNaturalNumber(int value){
		return naturalNumberCreator.createNaturalNumber(value);
	}
	
	public void setNaturalNumberCreator(NaturalNumberCreator naturalNumberCreator){
		this.naturalNumberCreator = naturalNumberCreator;
	}

}
