package es.upm.miw.pd.text;

import java.util.HashMap;
import java.util.Map;

public class FactoriaCaracter {
	
	private Map<Character,Caracter> map;
	private static FactoriaCaracter factoriaCaracter;
	
	public FactoriaCaracter(){
		map = new HashMap<Character,Caracter>();
	}
	
	public static FactoriaCaracter getFactoriaCaracter(){
		if(factoriaCaracter == null){
			factoriaCaracter = new FactoriaCaracter(); 
		}
		return FactoriaCaracter.factoriaCaracter;
	}
	
	public Caracter get(char key){
        if (map.containsKey(key)){
            return map.get(key);
        }else{
            Caracter caracter = new Caracter(key);
            map.put(key, caracter);
            return caracter;
        }
    }
}
