public class ProductTest{

private int prodId;
private String prodName;
private double productPrice;

public void display(){
System.out.println("display the product details");
}
public static void main(String [] agrs){
ProductTest p = new ProductTest();
p.display();
}
}