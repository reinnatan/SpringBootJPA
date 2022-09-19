package cars.apps.repository;


import cars.apps.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


@Repository
public interface SalesRepository extends JpaRepository<Sales, Long>, JpaSpecificationExecutor<Sales> {

    @Query(value = "SELECT s FROM Sales s WHERE s.name = :name")
    Optional<List<Sales>> findSalesByName(@Param("name") String name);
}