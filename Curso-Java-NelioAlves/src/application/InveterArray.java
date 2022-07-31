package application;

import java.util.Scanner;

public class InveterArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];
		for (int i = 0; i <5 ;i++) {
			array[i] = sc.nextInt();	
		}
		
		int[] inverteArray = new int[array.length];
		
		for (int i = 0; i < inverteArray.length ;i++) {
			//No exemplo criamos um Array com tamanho 5, por�m um array come�a do 0 logo n�o existe posi��o 5, portanto precisamos 
			//acrescentar +1 ao "i" para n�o estourar o Array 
			inverteArray[i] = array[inverteArray.length - (i+1)];
		} 
		
		System.out.println("Array Invertido:");
		
		for (int i = 0; i < inverteArray.length ;i++) {
			System.out.println(inverteArray[i]);
		} 
		
		sc.close();

	}

}
