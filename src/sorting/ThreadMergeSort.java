package sorting;

public class ThreadMergeSort extends Thread{
	
	
	private int[] array;
	private int start;
	private int end;

	public ThreadMergeSort(int[] array, int start, int end) {
		this.array = array;
		this.start = start;
		this.end = end;
	}

}
