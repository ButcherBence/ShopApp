package main.models.Wearable;

public class Shoe extends Wearable{
    protected int shoeSize;

    public Shoe() {
    }

    public Shoe(Gender genderType, int price, int shoeSize) {
        super(genderType, price);
        this.shoeSize = shoeSize;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }

    @Override
    public String
    toString() {
        return "Shoe{" +
                "genderType=" + genderType +
                ", price=" + price +
                ", shoeSize=" + shoeSize +
                '}';
    }
}
