package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o caminho do arquivo: ");
		String cda = sc.nextLine();
		
		File arquivo = new File(cda);
		
		System.out.println("getName: " + arquivo.getName()); // pega o arquivo despresando o caminho
		System.out.println("getParent: " + arquivo.getParent()); // caminho do arquivo
		System.out.println("getPath: " + arquivo.getPath()); // pegando todo o caminho
		
		
		sc.close();

	}

}
