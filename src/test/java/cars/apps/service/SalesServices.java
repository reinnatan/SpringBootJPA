package cars.apps.service;

import cars.apps.entity.Sales;
import cars.apps.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesServices {

    @Autowired
    private SalesRepository salesRepository;

    public Optional<Sales> getSalesCarSold(Long id){
        return salesRepository.findById(id);
    }

    public Optional<List<Sales>> findSalesByName(String name){
        return salesRepository.findSalesByName(name);
    }

}
