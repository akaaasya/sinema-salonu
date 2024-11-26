package sinema;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String filmAdi;
    private int sure;
    private String tur;
    private List<Salon> salonlar;

    public Film(String filmAdi, int sure, String tur) {
        this.filmAdi = filmAdi;
        this.sure = sure;
        this.tur = tur;
        this.salonlar = new ArrayList<>();
    }

    public String getFilmAdi() {
        return filmAdi;
    }

    public int getSure() {
        return sure;
    }

    public String getTur() {
        return tur;
    }

    public List<Salon> getSalonlar() {
        return salonlar;
    }

    public void salonEkle(Salon salon) {
        salonlar.add(salon);
    }

    public void bilgiGoster() {
        System.out.println("Film Adı: " + filmAdi + ", Süre: " + sure + " dakika, Tür: " + tur);
        System.out.println("Gösterildiği Salonlar:");
        for (Salon salon : salonlar) {
            System.out.println("- " + salon.getName());
        }
    }
}

