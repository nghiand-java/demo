package jp.kks.backend.modules.product.repository;


import jp.kks.backend.modules.product.repository.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
