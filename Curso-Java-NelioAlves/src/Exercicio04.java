import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i =0 ; i <= n;i++) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if(y == 0) {
				System.out.println("Divis�o Imposs�vel");
			}
			else {
				double div =  x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		
		sc.close();

	}

}
