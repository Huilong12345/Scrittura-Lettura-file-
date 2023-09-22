import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter fw = new FileWriter ("Prodotto.txt");
			fw.write("pane\n");
			fw.close();
			System.out.println("file creato");
			
		} catch (IOException e) {
			System.out.println("Si è verificato un errore");
			e.printStackTrace();
		}
		
		File f=new File("prodotto.txt");
		
		try {
			Scanner sc= new Scanner(f);
			String riga;
			while (sc.hasNextLine()) {
				riga=sc.nextLine();
				System.out.println("file trovato:"+riga);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
