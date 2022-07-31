package secao_15_Exceptions.exception;

//Estendendo Exception, � OBRIGATORIO tratar as exce�oes e usar a clausula "throws Nome_da_Classe" nos nomes dos metodos
//Estendendo RuntimeException N�O � OBRIGATORIO tratar as exce�oes, nem usar a clausula "throws" nos nomes dos metodos

public class DomainException extends Exception{		//Classe Exception � "seriable" e precisa declarar a vers�o.
	private static final long serialVersionUID = 1L;	//Vers�o default sugerida pelo proprio Eclipse quando se extend Exception
	
	public DomainException(String msg) {	//Construtor para receber a mensagem que iremos criar e passa-la para a superclasse
		super(msg);
	}
}
