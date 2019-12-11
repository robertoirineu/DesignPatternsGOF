package criacao.factorymethod.factory;

import criacao.factorymethod.animal.enums.TipoFilo;
import criacao.factorymethod.animal.enums.TipoClasse;
import criacao.factorymethod.animal.enums.TipoAlimentacao;

import criacao.factorymethod.animal.Animal;
import criacao.factorymethod.animal.ConcretAnimal;

import criacao.factorymethod.exceptions.AlimentacaoException;

public class AnimalCarnivoro implements AnimalFactory{

	public Animal getAnimal(TipoFilo filo, TipoAlimentacao alimentacao, TipoClasse classe, String comunicacao, String reproducao, String animal)throws AlimentacaoException{

		if(alimentacao != TipoAlimentacao.CARNIVORO){
			throw new AlimentacaoException(TipoAlimentacao.CARNIVORO);
		}

		return new ConcretAnimal(filo, alimentacao, classe, comunicacao, reproducao, animal); 

	}

}
