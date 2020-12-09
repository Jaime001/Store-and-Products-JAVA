import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Helper {

    public static String outputStringInput(String text){
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.next();
    }

    public static Integer outputIntegerInput(String text){
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        return scan.nextInt();
    }

    public static void informationStoreByProduct(ArrayList<Store> storesList){
        boolean flag = false;
        String productName = Helper.outputStringInput("Input product name: ");
        // capitalize first letter
        productName = productName.substring(0, 1).toUpperCase() + productName.substring(1).toLowerCase();
        for (Store store: storesList) {
            for (Product product: store.storeListOfProducts) {
                if (product.productName.equals(productName)){
                    System.out.println("Store ID: " + store.storeID + ", Store name: " + store.storeName + ", Location: " + store.location());
                    flag = true;
                }
            }
        }
        if (flag == false) System.out.println("The product doesn't exist!");
    }

    public static void locationStore(ArrayList<Store> storesList){
        String name = Helper.outputStringInput("Input store name: ");
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        String location = null;
        for (Store store: storesList) {
            if (name.equals(store.storeName())){
                location = store.location();
            }
        }
        if (location == null) System.out.println("The store doesn't exist!");
        else System.out.println(location);
    }

    public static void totalProduct(ArrayList<Store> storesList){
        double total = 0;
        String name = Helper.outputStringInput("Input store name: ");
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        for (Store store: storesList) {
            if (name.equals(store.storeName())){
                for (Product product: store.storeListOfProducts) {
                    System.out.println(product.productName + ": " + product.productCost);
                    total += product.productCost;
                }
                System.out.println("The total is: " + total);
            }
        }
        if (total ==  0) System.out.println("The store doesn't exist!");
    }

    public static void compareProducts(ArrayList<Store> storesList){
        boolean flag = false;
        String name = Helper.outputStringInput("Input product name: ");
        name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        for (Store store: storesList) {
            for (Product product: store.storeListOfProducts) {
                if (product.productName.equals(name)){
                    System.out.println(store.storeName + ":  " + product.productName + "(" + product.productCost + ")");
                    flag = true;
                }
            }
        }
        if (flag == false) System.out.println("The product doesn't exist!");
    }

    public static void welcome(){
        System.out.println("Welcome to this program, choose an option between 1 and 4: ");
        System.out.println("1) Display the store details with Store id, name and location for the given product name.");
        System.out.println("2) Display the location details to the user for the requested store name.");
        System.out.println("3) Display the Total products asset value of the store for the requested store name.");
        System.out.println("4) Compare the prices of the requested product name by the user in all the relevant stores in the\n" +
                "mall and display.");
    }
}
