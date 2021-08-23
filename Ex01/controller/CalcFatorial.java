package controller;

public class CalcFatorial {

	public CalcFatorial() {
		super();
	}
	
	public Double CalcFat(int n) {
		
		if (n <= 1) {
			return (double)1;
		} else {
			return n *CalcFat(n-1);
		}

	}

}
