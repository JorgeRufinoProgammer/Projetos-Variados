package secao_15_Exceptions.application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExFinally {

	public static void main(String[] args) {
		File file = new File("C:\\temp\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error opening file: " + e.getMessage());
		} finally {				//Bloco "finally" � executado independentemente de ter erro/exce��o ou n�o
			if (sc != null) {
				sc.close();
			}
			System.out.println("Bloco Finally executado!");
		}
	}

}
