package sorting;

public class SortingContoller {

	public SortingContoller() {
		super();
	}
	
	public int[] mergeSort(int[] array, int start, int end){
		
		System.out.println("Vetor da posição "+start+" até "+end);
		
		if (start<end) {
			int middle = (start+end)/2;
			mergeSort(array, start, end); //Left
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
			if (left<middle) {
				array[count] = newArray[right];
				right++;
			} else if (right>end) {
				array[count] = newArray[left];
				left++;
			} else if (newArray[left]<newArray[right]) {
				array[count] = newArray[left];
				left++;
			} else {
				array[count] = newArray[right];
				right++;
			}
		}
		
	}

}
