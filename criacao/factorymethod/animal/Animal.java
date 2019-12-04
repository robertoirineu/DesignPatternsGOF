import enums.TipoFilo;
import enums.TipoClasse;
import enums.TipoAlimentacao;

public abstract class Animal{
	private TipoFilo filo;
	private TipoAlimentacao alimentacao;
	private TipoClasse classe;

	public Animal(TipoFilo filo, TipoAlimentacao alimentacao, TipoClasse classe){
		this.filo = filo;
		this.alimentacao = alimentacao;
		this.classe = classe;

	}

	public abstract void comunicacao(); 
	public abstract void reproducao();

	@Override
	public String toString(){
		return "\nClasse: " + this.classe + 
		       "\nFilo: " + this.filo +
		       "\nAlimentacao: " + this.alimentacao;
	}

	@Override
	public boolean equals(Object object){
		if(object instanceof Animal){
			Animal obj = (Animal) object;
			return obj.getClasse() == this.classe &&
			       obj.getFilo() == this.filo &&
			       obj.getAlimentacao() == this.alimentacao;
		}

		return false;
	}

	public TipoClasse getClasse(){
		return this.classe;
	}

	public TipoFilo getFilo(){
		return this.filo;
	}

	public TipoAlimentacao getAlimentacao(){
		return this.alimentacao;
	}

}
