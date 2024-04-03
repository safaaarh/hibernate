package ma.insert.control3.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity

@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double name;
    private double price;
    private int quantity;

    public product(Long id, String computer, int price, int quantity) {
    }
}
