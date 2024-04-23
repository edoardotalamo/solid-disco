package progettino;

public class AudioBook extends Book{
	private int durata;
	public AudioBook(String id, String titolo, String autore, int durata) {
		super(id, titolo, autore);
		this.durata= durata;
	}
	@Override
	public String toString() {
		return super.toString() + ", durata audiolibro: " + durata;
	}
    public int getDurata() {
    	return durata;
    }
}
