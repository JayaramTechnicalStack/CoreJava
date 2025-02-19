public class ProductTest{

private int prodId;
private String prodName;
private double productPrice;

public ProductTest(int prodId , String prodName,productPrice){
this.prodId = prodId;
this.prodName = prodName;
this.productPrice = productPrice;
}

public void display(){
System.out.println("display the product details");
}
public static void main(String [] agrs){
ProductTest p = new ProductTest();
p.display();
}
}