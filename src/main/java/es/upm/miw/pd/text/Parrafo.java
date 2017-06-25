package es.upm.miw.pd.text;

import java.util.ArrayList;

public class Parrafo extends TextoContenedor {
	
	private ArrayList<Texto> texto;
	
	public Parrafo(){
		this.texto = new ArrayList<Texto>();
	}
	
	@Override
	public void delete(Texto componente) {
		if(componente.isCaracter()){
			texto.remove(componente);
		}else{
			//Si se intenta borrar, debe ignorarse
		}
	}

	@Override
	public void add(Texto componente) {
		if(componente.isCaracter()){
			texto.add(componente);
		}else{
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String parrafo = "";
		for(Texto caracter : texto){
			parrafo += caracter.dibujar(mayusculas);
		}
		return parrafo + "\n";
	}

	@Override
	public boolean isCaracter() {
		return false;
	}
}