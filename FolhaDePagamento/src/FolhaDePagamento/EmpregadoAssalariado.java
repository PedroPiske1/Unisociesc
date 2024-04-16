package FolhaDePagamento;

public class EmpregadoAssalariado extends Empregado {

	private double salario;
	
	public EmpregadoAssalariado(double salario) {
		this.salario = salario * 1500 + 500;
	}
	
	public double calculaSalario() {
		return this.salario;
		}
}
