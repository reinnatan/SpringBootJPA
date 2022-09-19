package cars.apps.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "sales")
public class Sales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "phone", length = 100)
    private String phone;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "sales_id", referencedColumnName = "id")
    private List<SalesSoldCar> cars;

}