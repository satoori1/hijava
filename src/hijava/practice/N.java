package hijava.practice;

public class N {
	int x = 10;
	int y = 20;
	public void swap() {
	 		int a = x;
	 		int b = y;
	 		x = b;
	 		y = a;
//	 		주석
		}
	
	public static void main(String[] args) {
		
		N n = new N();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		n.swap();
		System.out.println("x=" + n.x);
		System.out.println("y=" + n.y);
		
		
	}

}
