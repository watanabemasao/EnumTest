package main.java.product;

import org.jetbrains.annotations.Nullable;

import static main.java.product.EnumProduct.*;

public class Product {
    drink drinkFind = drink.Cola;
    food foodFind = food.potato;

    private @Nullable drink drink() {
        switch (drinkFind) {
            case Cola -> System.out.println("コーラ");
            case GrapefruitJuice -> System.out.println("グレープフルーツジュース" );
            case OrangeJuice -> System.out.println("オレンジジュース");
        }
        return null;
    }
    public drink getDrinkFind() {
        return this.drink();
    }


    private @Nullable food food() {
            switch (foodFind) {
                case potato -> System.out.println("ポテト");
                case hotDog -> System.out.println("ホットドッグ");
                case sandwich -> System.out.println("サンドイッチ");
            }
            return null;
        }

    public food getFoodFind() {
        return this.food();
    }


}
