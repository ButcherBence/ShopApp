package main.models.Wearable;

public class Wearable {
    protected Gender genderType;
    protected int price;
    protected ClothSize clothSize;

    public Wearable() {
    }

    public Wearable(Gender genderType, int price) {
        this.genderType = genderType;
        this.price = price;
    }

    public Wearable(Gender genderType, int price, ClothSize clothSize) {
        this.genderType = genderType;
        this.price = price;
        this.clothSize = clothSize;
    }

    public ClothSize getClothSize() {
        return clothSize;
    }

    public void setClothSize(ClothSize clothSize) {
        this.clothSize = clothSize;
    }

    public Gender getGenderType() {
        return genderType;
    }

    public void setGenderType(Gender genderType) {
        this.genderType = genderType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Wearable{" +
                "genderType=" + genderType +
                ", price=" + price +
                ", clothSize=" + clothSize +
                '}';
    }


}
