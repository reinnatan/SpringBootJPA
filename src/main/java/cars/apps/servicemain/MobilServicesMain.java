package cars.apps.servicemain;

import cars.apps.entity.Mobil;
import cars.apps.repomain.MobilRepositoryMain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MobilServicesMain {

    @Autowired
    private MobilRepositoryMain mobilRepository;
    public List<Mobil> listMobil(){
        return mobilRepository.findAll();
    }


    public Optional<Mobil> findMobil(Long id){
        return mobilRepository.findById(id);
    }


}
