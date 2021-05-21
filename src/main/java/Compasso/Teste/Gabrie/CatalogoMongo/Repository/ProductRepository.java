package Compasso.Teste.Gabrie.CatalogoMongo.Repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import Compasso.Teste.Gabrie.CatalogoMongo.Model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

	@Query("{ $and : [ { price : { $gte : ?0 , $lte : ?1 } } , { $or : [ { name : /?2/ } , { description : /?2/ } ] } ] }")
	List<Product> search(double min, double max, String q);

}
