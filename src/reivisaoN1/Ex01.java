package reivisaoN1;

public class Ex01 {
	
	public Ex01() {
		super();
	}
	
	public int CalcMult(int a, int b) {
		if (a <= 1) {
			return a;
		} else {
			return a + CalcMult(a-1, b);
		}
	}
}
