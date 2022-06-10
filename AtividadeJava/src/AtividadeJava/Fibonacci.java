package AtividadeJava;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int var1 = 0;
		int var2 = 1;
		int var3 = 0;
		
		while(var3<100) {
			System.out.println(var3);
			var3 = var1 + var2;
			var1 = var2; 
			var2 = var3;
		}
		
		

	}

}
