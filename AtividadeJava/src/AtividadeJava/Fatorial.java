package AtividadeJava;
import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner entrada = new Scanner(System.in);
				int n;
				int minimo = 1;
				int f;
				
				System.out.println("Insira um numero:");
				n = entrada.nextInt();
				f = n;
				
				while(f>minimo) {
					n = n*minimo;
					minimo++;
					
				System.out.println(n);
				}

	}

}
