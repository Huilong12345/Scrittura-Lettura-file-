import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter ("Prodotto.csv");
			fw.write("pane;3.5;20\n");
			fw.write("pasta;1.6;45\n");
			fw.write("Biscotti;4.70;80\n");
			fw.write("Salame;35;37\n");
			fw.close();
			System.out.println("file creato");
			
		} catch (IOException e) {
			System.out.println("Si è verificato un errore");
			e.printStackTrace();
		}
		
		File f=new File("prodotto.csv");
		
		try {
			Scanner sc= new Scanner(f);
			String riga;
			String[] dati;
			while (sc.hasNextLine()) {
				riga=sc.nextLine();
				dati=riga.split(";");
				System.out.println("prodotto trovato:");
				System.out.println("Nome:"+dati[0]);
				System.out.println("Prezzo:"+dati[1]);
				System.out.println("Quantità:"+dati[2]);
				System.out.println("\n");
			}
			System.out.println("\n\n\n\nFile trovato");
			sc.close();
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
