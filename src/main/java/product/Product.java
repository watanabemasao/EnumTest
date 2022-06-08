package main.java.product;

public class Product {
    Drink drinkFind = Drink.COLA;
    Food foodFind = Food.POTATO;

    private void Drink() {
        switch (drinkFind) {
            case COLA -> System.out.println("コーラ");
            case ORANGE_JUICE -> System.out.println("グレープフルーツジュース" );
            case GRAPEFRUIT_JUICE -> System.out.println("オレンジジュース");
        }
    }

    public void getDrinkFind() {
        this.Drink();
    }

    private void Food() {
            switch (foodFind) {
                case POTATO -> System.out.println("ポテト");
                case HOT_DOG -> System.out.println("ホットドッグ");
                case SANDWICH -> System.out.println("サンドイッチ");
            }
        }

    public void getFoodFind() {
        this.Food();
    }

}
