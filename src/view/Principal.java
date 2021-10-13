package view;

import javax.swing.JOptionPane;

import controller.*;
import sorting.SortingController;
import reivisaoN1.*;

public class Principal {

	public static void main(String[] args) {
		
		while(true) {
			
			int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha o programa a ser executado"
					+ "\n1- Ex 1.1: Calcula fatorial"
					+ "\n2- Ex 1.2: Inverte um texto"
					+ "\n3- Ex 2.1: Soma sequencia de números naturais"
					+ "\n4- Ex 2.2: Checa caracteres de um número"
					+ "\n5- Sorting: Algoritmos de Sorting"
					+ "\n6- Exercícios Revisão"
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
				case 6: revisao();
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

			int[] vetor = geraVetor(Integer.parseInt(JOptionPane.showInputDialog(null, "Tamanho do vetor: ")));
			
			SortingController oCont = new SortingController();
			
			exigeVetor(vetor);			
			
			while(true) {
				
				int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o método: "
						+ "\n1- BubbleSort"
						+ "\n2- MergeSort"
						+ "\n0- Voltar"));			
			
				switch (opc){
					case 1: {
						vetor = oCont.bubbleSort(vetor);
						exigeVetor(vetor);
						
					}
						break;
					case 2: {
						vetor = oCont.mergeSort(vetor, 0, vetor.length - 1);
						exigeVetor(vetor);
					}
						break;					
					case 0: return;			
					default: JOptionPane.showMessageDialog(null,"Inválido",
						      "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		
		static void exigeVetor(int vetor[]) {
			System.out.println("");
			System.out.println("=======================================");
			for (int valor : vetor) {
				System.out.print(valor+" ");
			}
			System.out.println("");
			System.out.println("=======================================");
		}
		
		static int[] geraVetor(int tamanho) {
			
			int vetor[] = new int[tamanho];
			
			for (int i=0;i<tamanho;i++) {
				vetor[i] = (int)((Math.random()*51)+0);
			}			
			return vetor;
		}
		
		static void revisao() {
			while(true) {
					
				int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o método: "
						+ "\nEx01- Multiplicação"
						+ "\nEx02- "
						+ "\n0- Voltar"));					
				switch (opc){
					case 1: {
						int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
						int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
						
						Ex01 m = new Ex01();
						
						int resultado = m.CalcMult(a, b);
						
						System.out.println(resultado);
					}
						break;
					case 2: ;
						break;					
					case 0: return;			
					default: JOptionPane.showMessageDialog(null,"Inválido",
						      "Erro!", JOptionPane.ERROR_MESSAGE);
				}
			}
	}
}
