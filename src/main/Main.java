package main;

import main.models.Wearable.ClothSize;
import main.models.Wearable.Gender;
import main.models.Wearable.*;
import main.models.foods.Product;
import main.models.foods.*;

public class Main {

    public static void main(String[] args) {

        Product[] products = {
                null,
                new Sugar(),
                new Milk(),
                new Product()
        };

        Shoe shoe = new Shoe(Gender.MALE,12000, 48);
        Shirt shirt = new Shirt(Gender.FEMALE,25000,ClothSize.XS);
        System.out.println(shoe);
        System.out.println(shirt);
    }




    // DRY = DO NOT REPEAT YOURSELF!!!
    // kód leegyszerűsítése, könnyebb kezelhetősége

    // ---------------------

    /*
        élelmiszerek (ősosztály vagy anyaosztály vagy apaosztály):
            kenyér
            alma
            tej
            cukor
            sör
        vásárló:
            vásárló
                private Food[] cart;

     */

}
