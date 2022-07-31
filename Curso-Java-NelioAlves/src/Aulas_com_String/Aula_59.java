package Aulas_com_String;

public class Aula_59 {

	public static void main(String[] args) {
		String original = "abcde FGHIJ ABC abc DEFG     "; 
		//A primeira posi��o de uma String come�a com 0
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);//pega os caracteres da String a partir da posi��o 2, que no caso � o C pois come�o com 0
		String s05 = original.substring(2, 9);//pega os caracteres de posi��o 2 at� uma posi��o antes da 9 (pos. 9 � o I)
		String s06 = original.replace('a','x');//troca o 'a' minusculo por 'x' minusculo
		String s07 = original.replace("abc","xy");
		int i = original.indexOf("bc");//posicao da primeira ocorrencia do 'bc'		
		int j = original.lastIndexOf("bc");//posicao da ultima ocorrencia do 'bc'		
		String s55 = original.substring(2).trim();
				
		System.out.println("Original: -" + original + "-");	//repare os espa�oes em branco no final
		System.out.println("Lower Case: -" + s01 + "-");
		System.out.println("Upper Case: -" + s02 + "-");
		System.out.println("Trim: -" + s03 + "-");			//repare que agora os espa�os no final(ou come�o) da string sumiram
		System.out.println("Substring(2): -" + s04 + "-");
		System.out.println("Substring(2,9): -" + s05 + "-");
		System.out.println("replace('a','x'): -" + s06 + "-");
		System.out.println("replace('abc','xy'): -" + s07 + "-");
		System.out.println("IndexOf('bc'): -" + i + "-");
		System.out.println("LastIndexOf('bc'): -" + j + "-");		
		System.out.println("Substring(2) com trim: -" + s55 + "-");
		System.out.println();
		
		String s = "potato apple lemon";
		String[] vect = s.split(" ");//split separa em um Vector com base em um Separador que no exemplo � o "espa�o"
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		
		String teste ="";
		for (i = 0;i < 3; i++) {
			teste = teste + vect[i] + " "; 
		}
		
		System.out.println(teste);
	}

}
