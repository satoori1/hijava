package hijava.practice;

public class ex3_3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			boolean isPrime = true;
			for(int j=2; j<=(i-1); j++) {
				
				if(isPrime) {
					
				}
				
				if(i%j==0) {
					isPrime=false;
					break;
					
					}
			
System.out.println(i);
			}
			
		}
	}

}
