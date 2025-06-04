import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {

    //creating list of products
    List<Product> products = new ArrayList<>();

    //adding product
    public void addProduct(Product p) {
        products.add(p);
    }

    //getting all products
    public List<Product> getAllProducts() {
        return products;
    }

    //getproduct by name
    public Product getProduct(String name) {
        for(Product p: products){
           String Name = p.getName().toLowerCase();
            if(Name.equals(name.toLowerCase())){
                return p;
            }
        }
        return null;
    }

    //get product by place
    public List<Product> getProductByPlace(String place) {
        List<Product> pp = new ArrayList<>();
        for(Product p: products){
            if(p.getPlace().equals(place))
                pp.add(p);
        }
        return pp;
    }


    //Out Of warranty Products
    public List<Product> getProductsOutOfWarranty(int warranty) {
        List<Product> oow = new ArrayList<>();
        for(Product p: products){
            if(p.getWarranty()<warranty)
                oow.add(p);
        }
        return oow;
    }

    //Products that matches with particular text
    public List<Product> getProductByParticularText(String text) {
        String textnew = text.toLowerCase();//converting to lowercase b'coz black!=Black
        List<Product> particular_text = new ArrayList<>();
        for(Product p: products){
            if(p.getName().toLowerCase().contains(textnew) || p.getPlace().toLowerCase().contains(textnew) || p.getType().toLowerCase().contains(textnew))
                particular_text.add(p);
        }
        return particular_text;
    }

    //getting products by type using stream api
    public List<Product> getProductByType(String type) {
        String typenew = type.toLowerCase();
        List<Product> by_type  = products.stream().filter(p -> p.getType().toLowerCase().equals(typenew)).collect(Collectors.toList());
        return by_type;
    }
}
