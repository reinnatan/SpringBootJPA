package cars.apps.repomain;

import cars.apps.entity.Mobil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MobilRepositoryMain extends JpaRepository<Mobil, Long>, JpaSpecificationExecutor<Mobil> {

}