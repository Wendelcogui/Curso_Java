package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double BaseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), BaseSalary, new Department(departmentName));//instancia do trabalhador
		
		System.out.println("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		for (int i = 0; i< n ; i++ ) {
			System.out.println("Enter contract #" + (1 + i ) + " data:");
		    System.out.print("Date (DD/MM/YYYY) ");
		    Date contractDate = sdf.parse(sc.next());
		    System.out.print("Value per hour: ");
		    double valuePerHour = sc.nextDouble();
		    System.out.print("Duration (hours): ");
		    int hours = sc.nextInt();
		    HourContract contract = new HourContract(contractDate, valuePerHour, hours);//instanciando o contrato 
		    worker.addContract(contract); //para associar a instancia com (worker)trabalhador.
		}
		
		System.out.println();
		System.out.print("Enter month and year to calculate income (MM/YYYY):");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name: " + worker.getName());
		System.out.println("department: " + worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		sc.close();

	}

}
