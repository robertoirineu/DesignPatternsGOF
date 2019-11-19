package singleton;

public class SingletonExe{

	/**
	*@author Roberto Floro
	*Metodo que simula um exe do sistema que usa a classe Singleton 
	*/
	public void exeSingleton(){
		Singleton singleton = Singleton.getInstance();
		singleton.pack();
		singleton.setVisible(true);
		
		//Não abrirá outra janela pois a classe singleton só permite uma instacia
		Singleton singleton2 = Singleton.getInstance();
		singleton2.pack();
		singleton2.setVisible(true);

	}
}
