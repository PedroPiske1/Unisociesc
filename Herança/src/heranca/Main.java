package heranca;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlunoDeGraduação aluno = new AlunoDeGraduação();
		aluno.setNome("José");
		aluno.setIdade(19);
		aluno.setRa(69696969);
		aluno.setNota1(10);
		aluno.setNota2(9);
		aluno.setNotaFinal(8);
		System.out.printf("nome: %s, idade: %d, nota final = %f\n\n", aluno.getNome(), aluno.getIdade(), aluno.getNotaFinal());
		
		ProfessorHorista profHori = new ProfessorHorista();
		ProfessorPesquisador profPesq = new ProfessorPesquisador();
		profHori.setNome("Jorge");
		profPesq.setNome("Celso");
		profHori.lecionar();
		profPesq.lecionar();
		}

}
