package criacao.factorymethod.factory;

import criacao.factorymethod.animal.enums.TipoClasse;
import criacao.factorymethod.animal.enums.TipoAlimentacao;
import criacao.factorymethod.animal.enums.TipoFilo;

import criacao.factorymethod.animal.Animal;

public interface AnimalFactory{

	Animal getAnimal(TipoFilo filo, TipoAlimentacao alimentacao, TipoClasse classe, String comunicacao, String reproducao, String animal)throws Exception;

}
