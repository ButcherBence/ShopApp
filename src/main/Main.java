package main;

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
