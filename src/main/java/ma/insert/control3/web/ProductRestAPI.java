package ma.insert.control3.web;

import ma.insert.control3.entites.product;
import ma.insert.control3.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductRestAPI {
    @Autowired
    private productRepository productRepository;
@GetMapping
    public List<product> products(){
        return productRepository.findAll();
    }

}
