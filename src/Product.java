import java.awt.*;
import java.lang.reflect.Array;
import java.util.concurrent.Future;
import java.util.Scanner;
import java.util.Arrays;
public class Product {

    int productID;
    String productName;
    String productType;
    int productStock;
    double productCost;

    public Product(int inputProductId, String inputProductName, String inputProductType,
                   int inputProductStock, double inputProductCost){
        this.productID = inputProductId;
        this.productName = inputProductName;
        this.productType = inputProductType;
        this.productStock = inputProductStock;
        this.productCost = inputProductCost;
    }
}
