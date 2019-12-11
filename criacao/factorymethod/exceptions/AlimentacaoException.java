package criacao.factorymethod.exceptions;

import criacao.factorymethod.animal.enums.TipoAlimentacao;

public class AlimentacaoException extends Exception{

	public AlimentacaoException(TipoAlimentacao alimentacao){
		super("O tipo alimentacao precisa ser: " + alimentacao.toString());
	}
}
