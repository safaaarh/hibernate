package ma.insert.control3;

import ma.insert.control3.entites.product;
import ma.insert.control3.repository.productRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Control3Application implements CommandLineRunner {
    @Autowired
    private productRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(Control3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new product(null,"computer",4300,3));
        productRepository.save(new product(null,"printer",1200,4));
        productRepository.save(new product(null,"start phone",3200,32));
        List<product> products= productRepository.findAll();
        products.forEach(p->{
            System.out.println(p.toString());
            List<product> productList =productRepository.findByNameContains("C");
            productList.forEach(P->{
                System.out.println(P);
            });
            List<product> productList2 =productRepository.search("%C%");
            productList2.forEach(P->{
                System.out.println(P);
            });
            List<product> productList3 =productRepository.findByPriceGreaterThan(3000);
            productList3.forEach(P->{
                System.out.println(P);
            });
        });

    }
}
