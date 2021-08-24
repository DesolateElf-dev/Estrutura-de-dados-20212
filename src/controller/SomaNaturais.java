package controller;

public class SomaNaturais {

	public SomaNaturais() {
		super();
	}
	
	public int FazSoma(int n) {
		
		
		//a condição de parada será quando n<=0 assim ele retornará 0, englobando também a regra
		// de retornar 0 para números negativos
		if (n<=0) {
			return 0;
		} else {
			
			return n + FazSoma(n-1);
		}
	}
}
