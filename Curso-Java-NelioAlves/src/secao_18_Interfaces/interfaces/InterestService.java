package secao_18_Interfaces.interfaces;

public interface InterestService {
	
	//Este m�todo nao pode ser default pois "Interfaces" n�o podem conter vari�veis e nem serem instanciadas
	double getInterestRate();
	
	//Aqui chamamos o metodo acima (getInterestRate()) pois ele estar� implementado nas classes e pegar o valor da classe que o implementou
	default double payment(double amount, int month) {
		return amount * Math.pow(1 + (getInterestRate() / 100), month);
	}
	
}
