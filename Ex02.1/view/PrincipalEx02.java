package view;

import javax.swing.JOptionPane;

import controller.ContaNumero;

public class PrincipalEx02 {

	public static void main(String[] args) {
		
		int quantidade=0;
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1� n�mero: "));
		int check = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2� n�mero: "));
		
		ContaNumero contar = new ContaNumero();
				
		quantidade = contar.Contador(numero, check);
				
		System.out.println(quantidade);

	}

}
