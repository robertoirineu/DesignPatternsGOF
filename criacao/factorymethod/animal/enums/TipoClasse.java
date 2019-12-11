package criacao.factorymethod.animal.enums;

public enum TipoClasse{

	MAMIFERO("Mamífero"), AVE("Ave"), REPTIL("Réptil"), PEIXE("Peixe"), ANFIBIO("Anfíbio");

	private String classe;

	TipoClasse(String classe){
		this.classe = classe;
	}

	public String getClasse(){
		return this.classe;
	}

	@Override
	public String toString(){
		return this.classe;
	}

}
