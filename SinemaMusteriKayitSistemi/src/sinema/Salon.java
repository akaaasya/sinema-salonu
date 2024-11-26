package sinema;
import java.util.ArrayList;
import java.util.List;

public class Salon extends BaseEntity implements IKayit {
    private List<Musteri> musteriler;
    private Film film;

    public Salon(String id, String name) {
        super(id, name);
        this.musteriler = new ArrayList<>();
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public void kayitEkle(BaseEntity entity) {
        if (entity instanceof Musteri) {
            musteriler.add((Musteri) entity);
            System.out.println(entity.getName() + " salona kaydedildi.");
        }
    }

    @Override
    public void kayitListele() {
        System.out.println("Salon: " + getName() + " - Gösterimdeki Film: " + (film != null ? film.getFilmAdi() : "Yok"));
        System.out.println("Kayıtlı Müşteriler:");
        for (Musteri musteri : musteriler) {
            System.out.println("- " + musteri.getName());
        }
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Salon ID: " + getId() + ", Ad: " + getName());
    }
}
