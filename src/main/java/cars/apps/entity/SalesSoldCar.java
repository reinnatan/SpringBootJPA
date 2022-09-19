package cars.apps.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sales_sold_car")
@Getter @Setter
public class SalesSoldCar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "car_id", referencedColumnName = "id")
    private Mobil car;

    @ManyToOne
    @JoinColumn(name = "sales_id", referencedColumnName = "id")
    private Sales sales;

}