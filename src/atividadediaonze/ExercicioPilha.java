package atividadediaonze;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Stack<String> pilha = new Stack<String>();
		Integer menu;
		String livro;

		do {
			System.out.println("*************Menu*****************");
			System.out.println("\n1 - Adicionar novo livro na pilha");
			System.out.println("2 - Listar todos os livros");
			System.out.println("3 - Retirar livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("\nEntre com a opção desejada:  ");
			menu = leia.nextInt();

			switch (menu) {
			case 1:
				System.out.println("\nDigite o título do livro: ");
				livro = leia.next();
				pilha.push(livro);
				System.out.println(pilha + "Livro " + livro + "adcionado a pilha");
				break;
			case 2:
				System.out.println("Livros adicionados na pilha" + pilha);
				break;
			case 3:
				pilha.pop(livro);
				System.out.println("Livro removido da pilha" + pilha);
				break;
			case 4:
				System.out.println("\nFim");
			}
		} while (menu != 0);

	}

}
