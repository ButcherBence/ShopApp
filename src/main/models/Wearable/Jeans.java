package main.models.Wearable;

public class Jeans extends Wearable{

    public Jeans() {
    }

    public Jeans(Gender genderType, int price, ClothSize clothSize) {
        super(genderType, price, clothSize);
    }

    @Override
    public String toString() {
        return "Jeans{" +
                "genderType=" + genderType +
                ", price=" + price +
                ", clothSize=" + clothSize +
                '}';
    }
}
