package controller;

public class SomaNaturais {

	public SomaNaturais() {
		super();
	}
	
	public int FazSoma(int n) {
		
		
		//a condi��o de parada ser� quando n<=0 assim ele retornar� 0, englobando tamb�m a regra
		// de retornar 0 para n�meros negativos
		if (n<=0) {
			return 0;
		} else {
			
			return n + FazSoma(n-1);
		}
	}
}
