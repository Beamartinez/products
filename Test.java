public class Test
{
    public void test1()
    {
        StockManager stockManager = new StockManager();
        
        Product products1 = new Product(1,"a");
        Product products2 = new Product(2,"b");
        Product products3 = new Product(3,"c");
        Product products4 = new Product(4,"d");
        Product products5 = new Product(5,"e");
        Product products6 = new Product(6,"f");
        Product products7 = new Product(7,"g");
        
        stockManager.addProduct(products1);
        stockManager.addProduct(products2);
        stockManager.addProduct(products3);
        stockManager.addProduct(products4);
        stockManager.addProduct(products5);
        stockManager.addProduct(products6);
        stockManager.addProduct(products7);
        
        products.printProductDetails();
    } 
}
