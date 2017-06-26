package es.upm.miw.pd.text;

class Caracter extends Texto {
	
	private char caracter;
	
	public Caracter(char caracter) {
		 this.caracter = caracter;
	}

	@Override
	public void add(Texto componente) {
		//Si se intenta añadir, se debe ignorar
	}

	@Override
	public String dibujar(boolean mayusculas) {
		if(mayusculas){
			return String.valueOf(caracter).toUpperCase();
		}else{
			return String.valueOf(caracter);
		}
	}

	@Override
	public boolean isCaracter() {
		return true;
	}

}
