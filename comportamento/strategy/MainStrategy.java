package comportamento.strategy;

import comportamento.strategy.base.CalculoHora;
import comportamento.strategy.base.CalculoDiaria;
import comportamento.strategy.base.TarifaEstacionamento;
import comportamento.strategy.base.CalculoHoraInicialDepoisFixa;

public class MainStrategy{
	
	public static void main(String[] args) {
		TarifaEstacionamento t = new TarifaEstacionamento(3, new CalculoHora(4));
		TarifaEstacionamento t2 = new TarifaEstacionamento(5, new CalculoHoraInicialDepoisFixa(5, 3, 2));
		TarifaEstacionamento t3 = new TarifaEstacionamento(10, new CalculoDiaria(20));
		
		System.out.println("Olá.");
		
	}

	public void calcularValorPorHora(TarifaEstacionamento t){
		int valor = t.getValorCalculado();
		System.out.println(valor == 12? "Tarifa por hora correta!":"Tarifa por hora incorreta");

	}

	public void calcularValorPorHoraInicialDepoisFixa(TarifaEstacionamento t){
		int valor = t.getValorCalculado();
		System.out.println(valor == 9? "Tarifa por hora depois fixa correta!":"Tarifa por hora depois fixa incorreta");

	}

	public void calcularValorDiario(TarifaEstacionamento t){
		int valor = t.getValorCalculado();
		System.out.println(valor == 20? "Tarifa por hora depois fixa correta!":"Tarifa por hora depois fixa incorreta");

	}
}
