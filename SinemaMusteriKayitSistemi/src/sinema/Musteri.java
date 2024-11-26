package sinema;

public class Musteri extends BaseEntity {

    public Musteri(String id, String name) {
        super(id, name);
    }

    @Override
    public void bilgiGoster() {
        System.out.println("Müşteri ID: " + getId() + ", Ad: " + getName());
    }
}

