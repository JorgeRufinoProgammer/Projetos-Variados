import java.util.Scanner;

public class ExemploMaiorMenorNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos numeros ser�o inseridos?");
		int n = sc.nextInt();
		int maior = 0, menor = 0;
		
		for(int i=0 ; i < n;i++) {
			System.out.println("Digite o n�mero:");
			int number = sc.nextInt();
			
			if (i == 0 )	// o primeiro numero sempre ser� o maior e o menor
			{
				maior = number;
				menor = number;
			}
			
			if (number > maior) {
				maior = number;
			}
			if (number < menor) {
				menor = number;
			}
		}
		
		System.out.println("O maior numero �: " + maior);
		System.out.println("O menor numero �: " + menor);
		sc.close();

	}

}
