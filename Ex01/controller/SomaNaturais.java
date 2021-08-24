package controller;

public class SomaNaturais {

	public SomaNaturais() {
		super();
	}
	
	public int FazSoma(int n) {
		
		if (n<=0) {
			return 0;
		} else {
			
			return n + FazSoma(n-1);
		}
	}
}
