package FolhaDePagamento;

public class EmpregadoTarefeiro extends Empregado {

		private double valorTarefa;
		private int numeroTarefas;
		
		public EmpregadoTarefeiro(double valorTarefa,int numeroTarefas) {
					this.valorTarefa = valorTarefa  * 60 + 20;
					this.numeroTarefas = numeroTarefas * 1000+501;
		}
		@Override
		public double calculaSalario() {
					return this.valorTarefa * this.numeroTarefas;
					}
}
