package sorting;

public class SortingController {

	public SortingController() {
		super();
	}
	
	
//Bubble Sort	
	
	public int[] bubbleSort(int array[]) {
		
		int tamanho = array.length;
		
		for (int i=0;i<tamanho;i++) {
			
			for (int j=0;j<tamanho-1;j++) {
				
				if (array[j]>array[j+1]){
					
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
			for (int valor : array) {
				System.out.print(valor + " ");
			}
			System.out.println(" ==> Rodada #"+ (i+1));
		}
		return array;
	}

	
//Merge Sort
	
	public int[] mergeSort(int[] array, int start, int end){
		
		System.out.println("Vetor da posição "+start+" até "+end);
		
		if (start < end) {
			int middle = (start + end)/2;
			
			mergeSort(array, start, middle); //Left
			mergeSort(array, middle+1, end); //Right
			
			merge(array, start, middle, end);		
		}
		return array;
		
	}

	private void merge(int[] array, int start, int middle, int end) {
		int newArray[] = new int[array.length];
		
		for (int i=start; i<=end;i++) {
			newArray[i]=array[i];
		}
		int left=start;
		int right=middle+1;
		
		for(int count=start;count<=end;count++) {
			if (left > middle) {
				array[count] = newArray[right];
				right++;
			} else if (right > end) {
				array[count] = newArray[left];
				left++;
			} else if (newArray[left] < newArray[right]) {
				array[count] = newArray[left];
				left++;
			} else {
				array[count] = newArray[right];
				right++;
			}
		}
		
	}


//Quick Sort
	
	public int[] quickSort(int [] vetor, int inicio, int fim) {
		
		//verifica se vetor.length > 1
		if (fim > inicio) {
			int posicaoPivoFixo = getPivo(vetor, inicio, fim);
			
			System.out.println("Posição pivô fixo: " + posicaoPivoFixo);
			//Esquerda
			quickSort(vetor, inicio, posicaoPivoFixo -1);
			//Direita
			quickSort(vetor, posicaoPivoFixo+1, fim);	
		}		
		return vetor;
	}	
	
	private int getPivo(int[] vetor, int inicio, int fim) {
		
		int pivoInicial = vetor[inicio];
		int ponteiroEsq = inicio +1;
		int ponteiroDir = fim;
		
		while (ponteiroEsq <= ponteiroDir) {
			while (ponteiroEsq <= ponteiroDir && vetor[ponteiroEsq] <= pivoInicial) {
				ponteiroEsq++;
			}
			while (ponteiroDir >= ponteiroEsq && vetor[ponteiroDir] > pivoInicial) {
				ponteiroDir--;
			}
			if (ponteiroEsq < ponteiroDir) {
				trocar(vetor, ponteiroEsq, ponteiroDir);
				ponteiroEsq++;
				ponteiroDir--;
			}
		}
		trocar(vetor, inicio, ponteiroDir);
		int posicaoPivoFixo = ponteiroDir;
		return posicaoPivoFixo;
	}	
	
	private void trocar(int [] vetor, int i, int j) {
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;		
		
	}		
}