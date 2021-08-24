package view;

import javax.swing.JOptionPane;

import controller.*;

public class Principal {

	public static void main(String[] args) {
		
		while(true) {
			
			int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o programa a ser executado"
					+ "\n1: Ex 1.1- Calcula fatorial"
					+ "\n2: Ex 1.2- Inverte um texto"
					+ "\n3: Ex 2.1- Soma sequencia de números naturais"
					+ "\n4: Ex 2.2- Checa caracteres de um número"
					+ "\n0: Finalizar"));			
		
			switch (opc){
				case 1: CalcFatView();
					break;
				case 2: InverteTextoView();
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					System.exit(0);
				default: JOptionPane.showMessageDialog(null,"Inválido",
					      "Erro!", JOptionPane.ERROR_MESSAGE);
				
			}
		}
	}
	
		
		static void CalcFatView(){
			
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
			
			CalcFatorial f = new CalcFatorial();
			
			Double fatorial = f.CalcFat(n);
			
			System.out.println(fatorial);
		}
		
		static void InverteTextoView() {

			String texto = JOptionPane.showInputDialog("Digite o texto a ser invertido: ");
			
			InverteTexto vc = new InverteTexto();
			
			int tamanho = texto.length();
			
			String otxet = vc.Inversor(texto, tamanho);
			
			System.out.println(otxet);
		}
		
		static void SomaNaturaisView() {
			
		}
		
		static void ChecaCaracter() {
			int quantidade=0;
			
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
			int check = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
			
			ContaNumero contar = new ContaNumero();
					
			quantidade = contar.Contador(numero, check);
					
			System.out.println(quantidade);
		}




}
