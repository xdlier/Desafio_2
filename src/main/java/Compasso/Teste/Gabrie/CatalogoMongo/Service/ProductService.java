package Compasso.Teste.Gabrie.CatalogoMongo.Service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import Compasso.Teste.Gabrie.CatalogoMongo.Model.Product;

public interface ProductService {

	public Product create(Product product);

	public Product edit(String id, Product product);

	public List<Product> findAll();

	public Product findById(String id);

	List<Product> search(double min_price, double max_price, String q);

	public ResponseEntity<Product> deleteById(String id);

}
