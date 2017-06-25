package es.upm.miw.pd.text;

public abstract class Texto {
	
	public abstract void add(Texto componente);
    public abstract String dibujar(boolean mayusculas);
    public abstract boolean isCaracter();
}
