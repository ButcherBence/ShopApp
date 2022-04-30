package main.models.foods;

public class Drink extends Product {

    public Drink(double quantity, String unitType, int price) {
        this.quantity = quantity;
        this.unitType = unitType;
        this.price = price;
    }

    public Drink(double quantity, String unitType, boolean isLongLife, int price) {
        this(quantity, unitType, price);
        this.isLongLife = isLongLife;
    }

}