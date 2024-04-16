package FolhaDePagamento;

public class EmpregadoHorista extends Empregado {

	private double valorHora;
	private int numeroHoras;

	public EmpregadoHorista(double valorHora, int numeroHoras) {
		this.numeroHoras = numeroHoras * (101) + 60;
		this.valorHora = valorHora  * 20 + 30;
	}

	@Override
	public double calculaSalario() {
		return this.valorHora * this.numeroHoras;
	}
}
