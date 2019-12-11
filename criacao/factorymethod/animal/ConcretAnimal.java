package criacao.factorymethod.animal;

import criacao.factorymethod.animal.enums.TipoFilo;
import criacao.factorymethod.animal.enums.TipoClasse;
import criacao.factorymethod.animal.enums.TipoAlimentacao;

public class ConcretAnimal extends Animal{


	public ConcretAnimal(TipoFilo filo, TipoAlimentacao alimentacao, TipoClasse classe, String comunicacao, String reproducao, String animal){
		super(filo, alimentacao, classe);
		this.comunicacao = comunicacao;
		this.reproducao = reproducao;
		this.animal = animal;
	}

	public void reproducao(){
		System.out.println("A reprodução do(a) " + this.animal + " é " + this.reproducao );
	}

	public void comunicacao(){
		System.out.println("A(O) " + this.animal + " " + this.comunicacao);
	}
}
