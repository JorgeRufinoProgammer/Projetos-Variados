package entities;

import javax.swing.JOptionPane;

public class Util {
	public static String inputString(String texto) {
		String respostaUsuario = JOptionPane.showInputDialog(texto);
		System.out.print(texto + " "+ respostaUsuario);
		System.out.println();
		return respostaUsuario;
	}
	public static int inputInt(String texto) {
		String somenteNumero = JOptionPane.showInputDialog(texto);
		while(OnlyNumbers(somenteNumero)) {
			outputString("Digite apenas n�meros!", 1);
			somenteNumero = JOptionPane.showInputDialog(texto);
		}
		int i = Integer.parseInt(somenteNumero);
		System.out.print(texto + " "+ i);
		System.out.println();
		return i;
	}
	public static double inputDouble(String texto) {
		String somenteNumero = JOptionPane.showInputDialog(texto);
		while(OnlyNumbers(somenteNumero)) {
			outputString("Digite apenas n�meros!", 1);
			somenteNumero = JOptionPane.showInputDialog(texto);
		}
		double i = Double.parseDouble(somenteNumero);
		System.out.print(texto + " "+ i);
		System.out.println();
		return i;
	}
	
	public static void outputString (String texto, int opcao) {
		if (opcao == 1) {
			System.out.println(texto);
		}		
		JOptionPane.showMessageDialog(null, texto);
	}
	
	public static boolean OnlyText(String text) {
	    return ! text.matches("[^\\d]+"); //Passa para o m�todo matches a regex
	    //Se tiver n�mero na string ir� retornar "falso", por isso o uso de "!" para retornar "true"
	    //Note o uso de duas \\, uma sendo obrigat�ria para servir de caractere de escape
	}
	
	public static boolean OnlyNumbers(String text) {
	    return ! text.matches("[^a-zA-Z]+"); //Passa para o m�todo matches a regex
	    //Se tiver letras na string ir� retornar "falso", por isso o uso de "!" para retornar "true"
	    //Note o uso de duas \\, uma sendo obrigat�ria para servir de caractere de escape
	}
}