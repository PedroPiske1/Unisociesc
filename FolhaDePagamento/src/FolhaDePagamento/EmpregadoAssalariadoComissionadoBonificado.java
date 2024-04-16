package FolhaDePagamento;

public class EmpregadoAssalariadoComissionadoBonificado extends Empregado {
	
	private double salario;
	private double comissao;
	private double bonus;

		public EmpregadoAssalariadoComissionadoBonificado(double salario, double comissao, double bonus) {
			this.salario =  salario * 1200 + 300;
			this.comissao = comissao;
			this.bonus = bonus * 500;
		}
}
