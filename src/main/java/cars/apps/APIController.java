package cars.apps;


import cars.apps.entity.Mobil;
import cars.apps.servicemain.MobilServicesMain;
import cars.apps.servicemain.SalesServicesMain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class APIController {

    @Autowired
    private MobilServicesMain mobilService;

    @Autowired
    private SalesServicesMain salesServices;

    @GetMapping("/")
    public Mobil index(){
        Optional<Mobil> cars = mobilService.findMobil(100L);
        return cars.orElseGet(() -> null);
    }
}
