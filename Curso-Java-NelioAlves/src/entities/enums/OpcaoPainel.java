package entities.enums;

public enum OpcaoPainel {
	ERRO(-1),
    SAIR(0),
    NOME_DA_EMPRESA(1),
    CNPJ_DA_EMPRESA(2),
    EXIBIR_DADOS_DA_EMPRESA(3),
    ADICIONAR_DEPARTAMENTO(4),
    ADICIONAR_FUNCIONARIO(5),
    LISTAR_DEPARTAMENTOS(6),
    LISTAR_FUNCIONARIOS(7);

    private final int code;

    private OpcaoPainel(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OpcaoPainel getOption(int code) {			//Recebe o codigo da op�ao
        for (OpcaoPainel option : OpcaoPainel.values()) {	//Percorre todos as op�oes
            if (code == option.getCode()) {					//Se encontrar o c�digo retorna a op�ao correspondente
                return option;
            }
        }

        return ERRO;										//Se for passado um codigo que n�o existe, retorna ERRO
    }
}
