package sistema;

/**
 * Classe de testes para as outras classes criadas (ContaLaboratorio,
 * ContaCantina, Disciplina, Saude e Aluno).
 * 
 * @author Matheus Gusmão Lemos - 117210399
 */

public class Coisa {

	public static void main(String[] args) {

		/**
		 * Testes para a parte obrigatória do projeto.
		 */
		ContaLaboratorio contaLCC2 = new ContaLaboratorio("LCC2");
		contaLCC2.consomeEspaco(1999);
		System.out.println(contaLCC2.atingiuCota());
		contaLCC2.consomeEspaco(2);
		System.out.println(contaLCC2.atingiuCota());
		contaLCC2.liberaEspaco(1);
		System.out.println(contaLCC2.atingiuCota());
		contaLCC2.liberaEspaco(1);
		System.out.println(contaLCC2.atingiuCota());
		System.out.println(contaLCC2.toString());

		Disciplina prog2 = new Disciplina("PROGRAMACAO 2");
		prog2.cadastraHoras(4);
		prog2.cadastraNota(1, 5.0);
		prog2.cadastraNota(2, 6.0);
		prog2.cadastraNota(3, 7.0);
		System.out.println(prog2.aprovado());
		prog2.cadastraNota(4, 10.0);
		System.out.println(prog2.aprovado());
		System.out.println(prog2.toString());

		ContaCantina mulherDoBolo = new ContaCantina("Mulher do Bolo");
		mulherDoBolo.cadastrarLanche(2, 500, "Bolinho Gostoso");
		mulherDoBolo.cadastrarLanche(1, 500, "Tapioca de Frango");
		mulherDoBolo.cadastrarLanche(3, 1000, "Cachorro Quente");
		mulherDoBolo.pagaConta(200);
		System.out.println(mulherDoBolo.toString());
		mulherDoBolo.listarDetalhes();

		Saude saude = new Saude();
		saude.definirEmoji(":)");
		System.out.println(saude.getStatusGeral());
		saude.defineSaudeMental("boa");
		saude.defineSaudeFisica("boa");
		System.out.println(saude.getStatusGeral());
		saude.defineSaudeMental("fraca");
		saude.defineSaudeFisica("fraca");
		System.out.println(saude.getStatusGeral());
		saude.defineSaudeMental("boa");
		saude.defineSaudeFisica("fraca");
		System.out.println(saude.getStatusGeral());

		System.out.println("\n*****BÔNUS*****\n");

		/**
		 * Testes para o bônus do projeto
		 */
		int arrayPesos[] = { 2, 3, 4, 5, 7 };
		Disciplina prog3 = new Disciplina("PROGRAMACAO 3", 5, arrayPesos);
		prog3.cadastraNota(1, 5.0);
		prog3.cadastraNota(2, 3.0);
		prog3.cadastraNota(3, 6.0);
		prog3.cadastraNota(4, 8.0);
		prog3.cadastraNota(5, 9.0);
		System.out.println(prog3.aprovado());
		System.out.println(prog3.toString());

		Aluno matheus = new Aluno();
		matheus.cadastraLaboratorio("LCC 2", 2000);
		matheus.cadastraLaboratorio("LCC 3", 3000);
		matheus.consomeEspaco("LCC 2", 2500);
		matheus.consomeEspaco("LCC 3", 2500);
		System.out.println(matheus.atingiuCota("LCC 2"));
		System.out.println(matheus.laboratoriosToString("LCC 2"));
		System.out.println(matheus.laboratoriosToString("LCC 3"));

		int pesos[] = { 8, 2, 3, 4, 5, 6 };
		matheus.cadastraDisciplina("ESTRUTURAS DE DADOS", 6, pesos);
		matheus.cadastraDisciplina("PROJETO DE SOFTWARE", 4, pesos);
		matheus.cadastraHoras("ESTRUTURAS DE DADOS", 4);
		matheus.cadastraNota("ESTRUTURAS DE DADOS", 1, 9.0);
		matheus.cadastraNota("ESTRUTURAS DE DADOS", 2, 9.0);
		matheus.cadastraNota("ESTRUTURAS DE DADOS", 3, 9.0);
		matheus.cadastraNota("ESTRUTURAS DE DADOS", 4, 9.0);
		matheus.cadastraNota("ESTRUTURAS DE DADOS", 5, 9.0);
		matheus.cadastraNota("ESTRUTURAS DE DADOS", 6, 9.0);
		System.out.println(matheus.disciplinaToString("ESTRUTURAS DE DADOS"));
		System.out.println(matheus.disciplinaToString("PROJETO DE SOFTWARE"));
		System.out.println("Aprovado? " + matheus.aprovado("ESTRUTURAS DE DADOS"));

		matheus.cadastraCantina("Lanchonete do Seu Olavo");
		matheus.cadastraLanche("Lanchonete do Seu Olavo", 8, 100);
		matheus.cadastraLanche("Lanchonete do Seu Olavo", 10, 39);
		matheus.pagarConta("Lanchonete do Seu Olavo", 20);
		matheus.cadastraCantina("Lanchonete do Veí");
		System.out.println(matheus.cantinaToString("Lanchonete do Seu Olavo"));
		System.out.println(matheus.cantinaToString("Lanchonete do Veí"));

		Aluno davidson = new Aluno();
		davidson.cadastraCantina("Lanchonete do veí");
		davidson.cadastraLanche("Lanchonete do veí", 3, 100);
		System.out.println(davidson.cantinaToString("Lanchonete do veí"));

		matheus.defineSaudeFisica("boa");
		matheus.defineSaudeFisica("boa");
		System.out.println(matheus.getStatusGeral());

		davidson.defineSaudeFisica("fraca");
		davidson.defineSaudeMental("fraca");
		System.out.println(davidson.getStatusGeral());
	}

}
