package comportamento.strategy.base;

public class CalculoDiaria implements Calculo{
	private int valorDiaria;

	public CalculoDiaria(int valorDiaria){
		this.valorDiaria = valorDiaria;
	}

	@Override
	public int calcularTarifa(int qtdHoras){
		return valorDiaria * (qtdHoras/24);
	}
}
