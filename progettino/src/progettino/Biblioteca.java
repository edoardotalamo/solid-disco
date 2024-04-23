package progettino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Biblioteca {
	private Map<String, Book> libri = new HashMap<>();
	
	public void caricaLibro(String filePath) throws IOException{
		
		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))){
			String line;
			while( (line =reader.readLine()) != null) {
				
				String[] parti = line.split(",");
				if(parti.length==3) {
					Book libro = new Book(parti[0].trim(), parti[1].trim(), parti[2].trim());
					libri.put(libro.getId(), libro);
}                 else if(parti.length==4) {
	libri.put(parti[0].trim(), new AudioBook(parti[0].trim(), parti[1].trim(), parti[2].trim(), Integer.parseInt(parti[3].trim())));
}
			}
		}
		
	}
	public void aggiungiLibro(String id, String titolo, String autore) {
		if(!libri.containsKey(id)) {
			libri.put(id, new Book(id, titolo, autore));
		}
		else {
			System.out.println("Il libro con ID: "+ id + " già è presente nella libreria");
		}
	}
	public void aggiungiAudioBook(String id, String titolo, String autore, int durata) {
		if(!libri.containsKey(id)) {
			libri.put(id, new AudioBook(id, titolo, autore, durata));
		}else {
			System.out.println("l'audiolibro con ID: "+ id + " già è presente nella libreria");
		}
		
		
	}
    public void rimuoviLibri(String id) {
    	if(libri.remove(id)==null) {
    		System.out.println("Nessun libro trovato con Id "+ id );
    		
    	}	
    }
    public void salvaLibro(String filePath) throws IOException{
    	try(BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){
    		for (Book libro : libri.values()){
    			writer.write(libro.toString() + "\n");
    			
    		}
    	}
    	
    	
    }
    
}
