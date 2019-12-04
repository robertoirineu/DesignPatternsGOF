import enums.TipoFilo;
import enums.TipoAlimentacao;
import enums.TipoClasse;

public class Raposa extends Animal{

	public Raposa(TipoFilo filo, TipoAlimentacao alimentacao, TipoClasse classe){
		super(filo, alimentacao, classe);
	}

	public void comunicacao(){
		System.out.println("A raposa regouga.");
	}

	public void reproducao(){
		System.out.println("A reprodução da raposa é sexuada");
	}

}
