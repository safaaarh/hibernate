package ma.insert.control3.repository;

import ma.insert.control3.entites.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface productRepository extends JpaRepository<product,Long> {
    List<product> findByNameContains(String mc);
    List<product> findByPriceGreaterThan(double price);


    //@Query("select p from product p where p.name like :x")
    List<product> search(@Param("x") String mc);
}
