package sorting;

public class SortingController {

	public SortingController() {
	}
	
	
	public int[] bubbleSort(int array[]) {
		int tamanho = array.length;
		
		for (int i=0;i<tamanho;i++) {
			for (int j=0;j<tamanho;j++) {
				if (array[j]>array[i]+1) {
					int aux = array[j];
					array[j] = array[i];
					array[i] = aux;
				}
			}
			for (int valor : array) {
				System.out.print(valor + " ");
			}
			System.out.println(" ==> Rodada #"+ (i+1));
		}
		return array;
	}
	
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
	
}