package enumateNumbers;

public class Number implements Comparable<Number>{
	int a, b;
	double val;
	Number(int a, int b) {
		this.a = a;
		this.b = b;
		calculateValue();
	}
	private void calculateValue() {
		// TODO Auto-generated method stub
		this.val = (double)a + b*Math.sqrt(2);
	}
	@Override
	public int compareTo(Number other) {
		return Double.compare(val, other.val);
	}
}
