package atividadediaonze;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioFila {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		Queue<String> fila = new LinkedList<String>();
		Integer menu;
		String nome;

		do {
			System.out.println("Menu");
			System.out.println("Digite: ");
			System.out.println("\n1 - Adicionar Cliente na fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar cliente da fila");
			System.out.println("0 - Sair");
			menu = leia.nextInt();

			switch (menu) {
			case 1:
				System.out.println("\nDigite o nome: ");
				nome = leia.next();
				fila.add(nome);
				System.out.println(fila + "Cliente listado");
				break;
			case 2:
				System.out.println("Clientes listados na fila" + fila);
				break;
			case 3:
				fila.remove();
				System.out.println("Cliente removido" + fila);
				break;
			case 4:
				System.out.println("\nFim");
			}
		} while (menu != 0);

	}

}
