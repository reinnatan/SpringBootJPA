package cars.apps.service;

import cars.apps.entity.Mobil;
import cars.apps.entity.Sales;
import cars.apps.repository.MobilRepository;
import cars.apps.repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobilServices {

    @Autowired
    private MobilRepository mobilRepository;

    public List<Mobil> listMobil(){
        return mobilRepository.findAll();
    }

    public Optional<Mobil> findMobil(Long id){
        return mobilRepository.findById(id);
    }


}
