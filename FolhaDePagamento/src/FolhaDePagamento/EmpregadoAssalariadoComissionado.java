package FolhaDePagamento;

public class EmpregadoAssalariadoComissionado extends Empregado {
	
	private double salario;
	private double comissao;
	
	public EmpregadoAssalariadoComissionado(double salario, double comissao) {
		this.salario =  salario * 1200 + 300;
		this.comissao = comissao;
	}

}
