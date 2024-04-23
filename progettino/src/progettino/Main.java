package progettino;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblio = new Biblioteca();
		try {
			biblio.caricaLibro("libri.txt");
			biblio.aggiungiLibro("001", "1984", "George Orwell");
			biblio.aggiungiLibro("002", "Metamorfosi", "Franz Kafka");
			biblio.aggiungiLibro("003", "Giro del mondo in 80 giorni", "Jules Verne");
			biblio.aggiungiLibro("004", "Don Quichotte", "Cervantes");
            biblio.aggiungiAudioBook("00001", "Hannibal Lecter", "Thomas Harris", 300);
			biblio.rimuoviLibri("005");
			biblio.rimuoviLibri("002");
			biblio.salvaLibro("biblioteca.txt");
			}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
			

		}

	}


