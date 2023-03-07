package aplicacao;

public class Programa {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for (int i = 0; i<vect.length; i++) { //<---- for
			System.out.println(vect[i]);
		}
		System.out.println("----------------------------");
		
		for (String obj : vect) {    //<----"for each"
			System.out.println(obj);
		}

	}

}
