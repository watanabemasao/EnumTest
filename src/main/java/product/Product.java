package main.java.product;

import org.jetbrains.annotations.Nullable;

import static main.java.product.EnumFood.*;
import static main.java.product.EnumDrink.*;
public class Product {
    Drink drinkFind = Drink.COLA;
    Food foodFind = Food.POTATO;

    private @Nullable EnumDrink.Drink drink() {
        switch (drinkFind) {
            case COLA -> System.out.println("コーラ");
            case ORANGE_JUICE -> System.out.println("グレープフルーツジュース" );
            case GRAPEFRUIT_JUICE -> System.out.println("オレンジジュース");
        }
        return null;
    }
    public Drink getDrinkFind() {
        return this.drink();
    }


    private @Nullable EnumFood.Food food() {
            switch (foodFind) {
                case POTATO -> System.out.println("ポテト");
                case HOT_DOG -> System.out.println("ホットドッグ");
                case SANDWICH -> System.out.println("サンドイッチ");
            }
            return null;
        }

    public Food getFoodFind() {
        return this.food();
    }

}
