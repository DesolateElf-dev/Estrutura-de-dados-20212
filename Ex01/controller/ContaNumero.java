package controller;

public class ContaNumero {

	public ContaNumero() {
		super();
	}	
	
	public int Verifica(int n, int check, int soma) {
		
		if (n==0) {
			return 0;
		} else {
			
			if ((n%10)%check == 0) {
				
				soma = soma + Verifica(n/10, check);
				return 1;
			} else {	
				soma = soma + Verifica(n/10, check);
				return 0;	
			}	
		}
	}
}
