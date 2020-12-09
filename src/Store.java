import java.util.ArrayList;

public class Store {

    int storeID;
    String storeName;
    String storeLocation;
    ArrayList <Product> storeListOfProducts;


    public Store(int inputStoreID, String inputStoreName, String inputStoreLocation, String storeType){
        this.storeID = inputStoreID;
        this.storeName = inputStoreName;
        this.storeLocation = inputStoreLocation;
        this.storeListOfProducts = typesProducts(storeType);
    }

    public ArrayList <Product> typesProducts(String inputTypeProduct){
        ArrayList <Product> products = new ArrayList<>();
        switch (inputTypeProduct){
            case "Electronics": products.add(new Product(1455, "Tv", inputTypeProduct, 12, 50200));
                                products.add(new Product(8974, "Switch", inputTypeProduct, 3, 5000));
                                products.add(new Product(8527, "Cellphone", inputTypeProduct, 50, 1400)); break;
            case "Clothing": products.add(new Product(1459, "Jeans", inputTypeProduct, 25, 1200));
                             products.add(new Product(7897, "Jacket", inputTypeProduct, 5, 1500));
                             products.add(new Product(2358, "Skirt", inputTypeProduct, 12, 900)); break;
            case "Groceries": products.add(new Product(2587, "Milk", inputTypeProduct, 58, 50));
                              products.add(new Product(2154, "Eggs", inputTypeProduct, 100, 80));
                              products.add(new Product(1597, "Bread", inputTypeProduct, 20, 30)); break;
            case "Tech": products.add(new Product(1269, "Tv", inputTypeProduct, 5, 9500));
                         products.add(new Product(8974, "Switch", inputTypeProduct, 3, 5000));
                         products.add(new Product(1258, "Dron", inputTypeProduct, 5, 15000)); break;
            case "Wholesale store": products.add(new Product(1463, "Jeans", inputTypeProduct, 15, 1100));
                         products.add(new Product(9865, "Dron", inputTypeProduct, 8, 14000));
                         products.add(new Product(2541, "Cellphone", inputTypeProduct, 32, 11000)); break;
            case "Supermarket": products.add(new Product(1225, "Wine", inputTypeProduct, 89, 200));
                         products.add(new Product(9865, "Eggs", inputTypeProduct, 54, 100));
                         products.add(new Product(9865, "Milk", inputTypeProduct, 45, 40)); break;
        }
        return products;
    }

    public int id(){
        return storeID;
    }

    public String location(){
        return storeLocation;
    }

    public String storeName(){
        return storeName;
    }
}
