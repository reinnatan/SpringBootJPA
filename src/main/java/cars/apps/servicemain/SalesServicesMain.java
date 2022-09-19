package cars.apps.servicemain;

import cars.apps.entity.Sales;
import cars.apps.repomain.SalesRepositoryMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesServicesMain {

    @Autowired
    private SalesRepositoryMain salesRepository;

    public Optional<Sales> getSalesCarSold(Long id){
        return salesRepository.findById(id);
    }

    public Optional<List<Sales>> findSalesByName(String name){
        return salesRepository.findSalesByName(name);
    }

}
