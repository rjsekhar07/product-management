import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ProductService service = new ProductService();

        //adding products
        service.addProduct(new Product("Type C", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Mac Studio", "Computer", "White Table", 2025));
        service.addProduct(new Product("Focusrite Mixer", "Audio System", "White Table", 2025));
        service.addProduct(new Product("Asus Vivobook", "Laptop", "Brown Drawer", 2021));
        service.addProduct(new Product("Asus Rog", "Laptop", "Black Table", 2021));
        service.addProduct(new Product("Macbook pro", "Laptop", "Brown Drawer", 2022));
        service.addProduct(new Product("Wacom Pad", "Writing Pad", "Black Drawer", 2020));
        service.addProduct(new Product("Apple Keyboard", "Keyboard", "White Table", 2022));
        service.addProduct(new Product("Logitech Keyboard", "Keyboard", "Black Table", 2024));
        service.addProduct(new Product("Hdmi cable", "Cable", "Black Drawer", 2024));
        service.addProduct(new Product("Java Black Book", "Cable", "Shelf", 2024));
        service.addProduct(new Product("Logi Mouse", "Mouse", "Black Table", 2022));
        service.addProduct(new Product("Apple Mouse", "Mouse", "White Table", 2022));
        service.addProduct(new Product("Lenovo Mouse", "Mouse", "Black Drawer", 2022));
        service.addProduct(new Product("BlackBeast", "Computer", "White Table", 2020));

//
//        List<Product> products = service.getAllProducts();
//        for(Product p: products) {
//            System.out.println(p);
//        }
//
//        System.out.println("-----------------------------------------------------------------------------------");
//        System.out.println("Printing a particular product");
//        Product p = service.getProduct("blackbeast");
//        System.out.println(p);
//
//        System.out.println("-----------------------------------------------------------------------------------");
//        System.out.println("Products at particular place");
//        List<Product> p1 = service.getProductByPlace("White Table");
//        for(Product p2: p1){
//            System.out.println(p2);
//        }
//
//        System.out.println("-----------------------------------------------------------------------------------");
//        System.out.println("Products that are out of warranty");
//        List<Product> oow = service.getProductsOutOfWarranty(2022);
//        for(Product p: oow) {
//            System.out.println(p);
//        }

//          System.out.println("-----------------------------------------------------------------------------------");
//          System.out.println("Products with particular text");
//          List<Product> particular_text = service.getProductByParticularText("black");
//          for(Product p: particular_text){
//              System.out.println(p);
//          }

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Products with particular type using stream api");
        List<Product> type = service.getProductByType("laptop");
        for(Product p: type){
            System.out.println(p);
        }
    }
}