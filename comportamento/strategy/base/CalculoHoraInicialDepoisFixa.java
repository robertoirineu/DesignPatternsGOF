package comportamento.strategy.base;

public class CalculoHoraInicialDepoisFixa implements Calculo{
	private int valorHoraInicial;	
	private int limitHoraInicial;	
	private int valorHoraExcedente;	

	public CalculoHoraInicialDepoisFixa(int valorHoraInicial,int limitHoraInicial,int valorHoraExcedente){
		this.valorHoraInicial = valorHoraInicial;
		this.limitHoraInicial = limitHoraInicial;
		this.valorHoraExcedente = valorHoraExcedente;
	}

	@Override
	public int calcularTarifa(int qtdHoras){
		int valor = this.valorHoraInicial;
		
		if(qtdHoras > this.limitHoraInicial)
			valor += (qtdHoras - this.limitHoraInicial) * this.valorHoraExcedente;

		return 0;
	}
}
