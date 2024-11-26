package sinema;
import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Film film1 = new Film("Matrix", 120, "Bilim Kurgu");
	        Film film2 = new Film("Titanic", 195, "Romantik");

	        Salon salon1 = new Salon("1", "Salon 1");
	        Salon salon2 = new Salon("2", "Salon 2");

	        salon1.setFilm(film1);
	        salon2.setFilm(film2);

	        film1.salonEkle(salon1);
	        film2.salonEkle(salon2);

	        Musteri musteri1 = new Musteri("101", "Ahmet");
	        Musteri musteri2 = new Musteri("102", "Ayşe");

	        salon1.kayitEkle(musteri1);
	        salon2.kayitEkle(musteri2);

	        System.out.println("\nFilmler:");
	        film1.bilgiGoster();
	        film2.bilgiGoster();

	        System.out.println("\nSalonlar ve Müşteriler:");
	        salon1.kayitListele();
	        salon2.kayitListele();

	        scanner.close();
	    }

}
