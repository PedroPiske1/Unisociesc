package heranca;

public class Aluno extends Pessoa {
	private int ra;

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;		
	}
	
	public Aluno () {
		super("Maria", 19);
		System.out.println("Construindo Aluno...");
	}
}
