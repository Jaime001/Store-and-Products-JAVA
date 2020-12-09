import java.util.Scanner;
import java.util.ArrayList;

public class PlazaSania {
    public  static void main(String[] args){

        ArrayList <Store> storesList = new ArrayList<Store>();
            storesList.add(new Store(2587, "Store1", "First Floor", "Electronics"));
            storesList.add(new Store(1259, "Store2", "Second Floor", "Tech"));
            storesList.add(new Store(1478, "Store3", "Third Floor", "Clothing"));
            storesList.add(new Store(1548, "Store4", "First Floor", "Wholesale store"));
            storesList.add(new Store(2587, "Store4", "Second Floor", "Supermarket"));
            storesList.add(new Store(7852, "Store5", "Second Floor", "Groceries"));

        Helper.welcome();
        int userInput = Helper.outputIntegerInput("Input the option: ");
        if (userInput > 0 && userInput < 5) {
            switch (userInput){
                case 1: Helper.informationStoreByProduct(storesList); break;
                case 2: Helper.locationStore(storesList); break;
                case 3: Helper.totalProduct(storesList); break;
                case 4: Helper.compareProducts(storesList); break;
            }
        } else {
            System.out.println("The option is not correct!");
        }
    }
}
