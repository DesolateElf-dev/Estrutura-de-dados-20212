package view;

import javax.swing.JOptionPane;

import controller.InverteTexto;

public class Principal {

	public static void main(String[] args) {
			
		String texto = JOptionPane.showInputDialog("Digite o texto a ser invertido: ");
		
		InverteTexto vc = new InverteTexto();
		
		int tamanho = texto.length();
		
		String otxet = vc.Inversor(texto, tamanho);
		
		System.out.println(otxet);

	}

}
