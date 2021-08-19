package view;

import javax.swing.JOptionPane;

import controller.CalcFatorial;

public class PrincipalFat {

	public static void main(String[] args) {
			
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
		
		CalcFatorial f = new CalcFatorial();
		
		Double fatorial = f.CalcFat(n);
		
		System.out.println(fatorial);

	}

}
