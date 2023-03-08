package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um caminho na pasta: ");
		String cdp = sc.nextLine();

		File path = new File(cdp);

		File[] pastas = path.listFiles(File::isDirectory);//fazer a busca dos arquivos no diretorio

		System.out.println("PASTAS: ");
		for (File pasta : pastas) {
			System.out.println(pasta);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("ARQUIVOS: ");
		for(File arquivo: files) {
			System.out.println(arquivo);
		}
		
		boolean success = new File(cdp + "\\subdir").mkdir();
		System.out.println("Diretorio criado com sucesso: " + success);

		sc.close();

	}

}
