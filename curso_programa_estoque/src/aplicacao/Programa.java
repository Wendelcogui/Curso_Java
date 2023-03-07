package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Coloque os dados do PRODUTO: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preco: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Dados do produto: " + produto);
		
		System.out.println();
		System.out.println("Entre com um novo numero para adicionar ao estoque");
		int quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		System.out.println();
		System.out.println("Entre com um novo numero para retirar ao estoque");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);
		
		System.out.println();
		System.out.println("Dados atualizados: " + produto);
		
		
		sc.close();

	}

}
