package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	public void static swap() {
	 		int a = x;
	 		int b = y;
	 		x = b;
	 		y = a;
		}
	
	public static void main(String[] args) {
		
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		N.swap();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		
		
	}

}
