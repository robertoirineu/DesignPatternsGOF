package comportamento.strategy.base;

public class TarifaEstacionamento{
	private int qtdHora;
	private Calculo calculo;

	public TarifaEstacionamento(int qtdHora, Calculo calculo){
		this.qtdHora = qtdHora;
		this.calculo = calculo;
	}

	public int getValorCalculado(){
		return calculo.calcularTarifa(this.qtdHora);
	}
}
