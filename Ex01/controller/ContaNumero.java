package controller;

public class ContaNumero {

	public ContaNumero() {
		super();
	}	
	
	public int Contador(int n, int check) {
		
		if (n==0) {
			return 0;
		} else {
			
			int quantidade=0;
			quantidade = quantidade + Contador((n % 10), check);
			
			if (n%0 == check) {
				return 1;
			} else {
				return 0;
			}
		}
	}

}
