package main.java.product;

public class ProductFind {
    Drink drinkFind = Drink.COLA;
    Food foodFind = Food.POTATO;

    public void drinkFind() {
        switch (drinkFind) {
            case COLA -> System.out.println("コーラ");
            case ORANGE_JUICE -> System.out.println("グレープフルーツジュース");
            case GRAPEFRUIT_JUICE -> System.out.println("オレンジジュース");
        }
    }
    public void foodFind() {
        switch (foodFind) {
            case POTATO -> System.out.println("ポテト");
            case HOT_DOG -> System.out.println("ホットドッグ");
            case SANDWICH -> System.out.println("サンドイッチ");
        }
    }
}
