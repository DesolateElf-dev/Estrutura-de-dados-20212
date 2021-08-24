package controller;

public class ContaNumero {

	public ContaNumero() {
		super();
	}	
	
	public int Verifica(int n, int check, int soma) {
		
		if (n==0) {
			return soma;
		} else {
			
			if ((n%10)%check == 0) {
				
				soma++;
				
				soma = Verifica(n/10, check, soma);
				
				return soma;
			} else {	
				
				soma = Verifica(n/10, check, soma);
				
				return soma;	
			}	
		}
	}
}
