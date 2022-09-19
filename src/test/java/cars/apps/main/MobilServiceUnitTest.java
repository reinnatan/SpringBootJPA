package cars.apps.main;

import cars.apps.entity.Mobil;
import cars.apps.entity.Sales;
import cars.apps.entity.SalesSoldCar;
import cars.apps.service.SalesServices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import cars.apps.service.MobilServices;

import java.sql.SQLOutput;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class MobilServiceUnitTest {

    @Autowired
    private MobilServices mobilService;

    @Autowired
    private SalesServices salesServices;

    @Test
    public void testGetAllCars(){
        List<Mobil> cars = mobilService.listMobil();
        for(Mobil car:cars){
            System.out.println(car.getName());
        }
    }

    @Test
    public void findCars(){
        Optional<Mobil> carSelected =  mobilService.findMobil(2L);
        carSelected.ifPresent(mobil -> System.out.println("Nama Mobil: "+mobil.getName()));
    }

    @Test
    public void getSalesCar(){
        Optional<Sales> salesSelected = salesServices.getSalesCarSold(1L);
        salesSelected.ifPresent(sales -> {
            System.out.println("Total Car : "+sales.getCars().size());
        });
    }


    @Test
    public void getSalesByName(){
        Optional<List<Sales>> selected = salesServices.findSalesByName("Rein");
        selected.ifPresent(sales -> {
            System.out.println("=============================================================");
            for(Sales selectSales: sales){
                for(SalesSoldCar mobil: selectSales.getCars()){
                    System.out.println(mobil.getSales().getName()+"-"+mobil.getCar().getName());
                }
            }
            System.out.println("=============================================================");
        });


    }
}
