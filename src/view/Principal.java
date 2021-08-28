package view;

import javax.swing.JOptionPane;

import controller.*;
import sorting.SortingController;

public class Principal {

	public static void main(String[] args) {
		
		while(true) {
			
			int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o programa a ser executado"
					+ "\n1- Ex 1.1: Calcula fatorial"
					+ "\n2- Ex 1.2: Inverte um texto"
					+ "\n3- Ex 2.1: Soma sequencia de números naturais"
					+ "\n4- Ex 2.2: Checa caracteres de um número"
					+ "\n5- Sorting: Algoritmos de Sorting"
					+ "\n0- Finalizar"));			
		
			switch (opc){
				case 1: CalcFatView();
					break;
				case 2: InverteTextoView();
					break;
				case 3: SomaNaturaisView();
					break;
				case 4: ChecaCaracter();
					break;
				case 5: sortingAlg();
					break;
				case 0: System.exit(0);
				
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
			
			int n = Integer.parseInt(JOptionPane.showInputDialog("Digite número: "));
			
			SomaNaturais soma = new SomaNaturais();
			
			int somatoria = soma.FazSoma(n);
			
			System.out.println(somatoria);
		}
		
		static void ChecaCaracter() {
			
			int numero, check;
			
			do {
				numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1º número: "));
			} while (numero <=10 || numero>=999999);
			
			do {
				check = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2º número: "));
			} while (check<=0 || check>=9);
			
			ContaNumero contar = new ContaNumero();
					
			int quantidade = contar.Verifica(numero, check, 0);
					
			System.out.println(quantidade);
		}

		static void sortingAlg() {
			int[] vetor = {2,0,1,3,7,8,5,4,9,6};
//			int[] vetor = {9,8,7,6,5,4,3,2,1,0};
			
			SortingController oCont = new SortingController();
//			vetor = oCont.bubbleSort(vetor);
			vetor = oCont.mergeSort(vetor, 0, vetor.length - 1);
			
			System.out.println("");
			System.out.println("=======================================");
			for (int valor : vetor) {
				System.out.print(valor+" ");
			}
			System.out.println("");
			System.out.println("=======================================");
		}
}
