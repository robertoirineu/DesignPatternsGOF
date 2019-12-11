package criacao.factorymethod.animal.enums;

public enum TipoAlimentacao{
	ONIVORO("Onívore"), CARNIVORO("Carnívoro"), ERBIVORO("Erbívoro");

	private String alimentacao;

	TipoAlimentacao(String alimentacao){
		this.alimentacao = alimentacao;
	}

	public String  getAlimentacao(){
		return this.alimentacao;
	}

	@Override
	public String toString(){
		return this.alimentacao;
	}
}
