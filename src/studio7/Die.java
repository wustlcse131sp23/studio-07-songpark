package studio7;

public class Die {

	private int n;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Die(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	public int returnRandom(int n) {
		return (int)(Math.random()) * (n-1)+1;
	}
	
}
