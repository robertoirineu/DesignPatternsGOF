package criacao.factorymethod.animal.enums;

public enum TipoFilo{
	PORIFERO("Porífero"), ARTROPODE("Artrópode"), CORDATA("Cordate");

	private String filo;

	TipoFilo(String filo){
		this.filo = filo;
	}

	public String getFilo(){
		return this.filo;
	}

	@Override
	public String toString(){
		return this.filo;
	}

}
