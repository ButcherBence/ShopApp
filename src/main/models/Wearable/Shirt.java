package main.models.Wearable;

public class Shirt extends Wearable{
    public Shirt() {
    }

    public Shirt(Gender genderType, int price, ClothSize clothSize) {
        super(genderType, price, clothSize);
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "genderType=" + genderType +
                ", price=" + price +
                ", clothSize=" + clothSize +
                '}';
    }
}
