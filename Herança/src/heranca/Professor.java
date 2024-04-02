package heranca;

public class Professor extends Pessoa {
	private int matricula;
	
		public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void lecionar() {
		System.out.println(getNome() + " está lecionando\n");
	}
	
	public Professor () {
		super("Celso", 40);
		System.out.println("Construindo professor...");
	}
}
