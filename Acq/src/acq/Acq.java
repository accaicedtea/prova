package acq;
/*abdel aziz hasan*/
import java.util.Scanner;

public class Acq {
//double
	public static double inputDouble() {
		double l = 0;
		boolean errore = true;
		do {
			Scanner cheBello = new Scanner(System.in);
			try {
				l = Double.parseDouble(cheBello.nextLine());
			} catch (Exception e) {
				errore = false;
				System.err.println("Errore, inserire un numero: ");
			}
		} while (errore == false);
		return l;
	}

	public static double inputDouble(String s) {
		double l = 0;
		boolean errore = true;
		do {
			System.out.println(s);
			Scanner cheBello = new Scanner(System.in);
			try {
				l = Double.parseDouble(cheBello.nextLine());
			} catch (Exception e) {
				errore = false;
				System.err.println("Errore, inserire un numero: ");
			}
		} while (errore == false);
		return l;
	}

	public static double inputDoublen(String s) {
		double l = 0;
		boolean errore = true;
		do {
			do {
				System.out.println(s);
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Double.parseDouble(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, inserire valori negativi: ");
				}
			} while (errore == false);
		} while (l > 0);
		return l;
	}

	public static double inputDoublen() {
		double l = 0;
		boolean errore = true;
		do {
			do {
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Double.parseDouble(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, inserire volori negativi: ");
				}
			} while (errore == false);
		} while (l > 0);
		return l;
	}
	
	public static double inputDoublep(String s) {
		double l = 0;
		boolean errore = true;
		do {
			do {
				System.out.println(s);
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Double.parseDouble(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, scrivere numeri positivi: ");
				}
			} while (errore == false);
		} while (l < 0);
		return l;
	}

	public static double inputDoublep() {
		double l = 0;
		boolean errore = true;
		do {
			do {
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Double.parseDouble(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, inserire numeri posistivi: ");
				}
			} while (errore == false);
		} while (l < 0);
		return l;
	}
	public static int inputInt(String s) {
		
		int l = 0;
		boolean errore = true;
		do {
			System.out.println(s);
			Scanner cheBello = new Scanner(System.in);
			try {
				l = Integer.parseInt(cheBello.nextLine());
			} catch (Exception e) {
				errore = false;
				System.err.println("Errore, inserire inserire un numero: ");
			}
		} while (errore == false);
		return l;
	}
	
	public static int inputInt() {
		int l = 0;
		boolean errore = true;
		do {
			Scanner cheBello = new Scanner(System.in);
			try {
				l = Integer.parseInt(cheBello.nextLine());
			} catch (Exception e) {
				errore = false;
				System.err.println("Errore, inserire un numero: ");
			}
		} while (errore == false);
		return l;
	}
	
	public static int inputIntp(String s) {
		int l = 0;
		boolean errore = true;
		do {
			do {
				System.out.println(s);
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Integer.parseInt(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, inserire valori positivi: ");
				}
			} while (errore == false);
		} while (l < 0);
		return l;
	}

	public static int inputIntp() {
		int l = 0;
		boolean errore = true;
		do {
			do {
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Integer.parseInt(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, inserisci numeri positivi: ");
				}
			} while (errore == false);
		} while (l < 0);
		return l;
	}

	public static int inputIntn() {
		int l = 0;
		boolean errore = true;
		do {
			do {
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Integer.parseInt(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, inserire un valore negativo: ");
				}
			} while (errore == false);
		} while (l > 0);
		return l;
	}

	public static int inputIntn(String s) {
		int l = 0;
		boolean errore = true;
		do {
			do {
				System.out.println(s);
				Scanner cheBello = new Scanner(System.in);
				try {
					l = Integer.parseInt(cheBello.nextLine());
				} catch (Exception e) {
					errore = false;
					System.err.println("Errore, inserire un valore negativo:");
				}
			} while (errore == false);
		} while (l > 0);
		return l;
	}

	public static String inputString() {
		String l = " ";
		String controllo = "[a-zA-Z]+";
		do {
			Scanner cheBello = new Scanner(System.in);
			l = cheBello.nextLine();
			if (!l.matches(controllo)) {
				System.out.println("Errore, inserire delle lettere: ");
			}
		} while (!l.matches(controllo));
		l=l.toLowerCase();
		return l;
	}

	public static String inputString(String s) {
		String l = " ";
		String controllo = "[a-zA-Z]+";
		System.out.println(s);
		do {
			Scanner cheBello = new Scanner(System.in);
			l = cheBello.nextLine();
			if (!l.matches(controllo)) {
				System.out.println("Errore, inserire delle lettere: ");
			}
		} while (!l.matches(controllo));
		l=l.toLowerCase();
		return l;
	}

}
/*abdel aziz hasan*/