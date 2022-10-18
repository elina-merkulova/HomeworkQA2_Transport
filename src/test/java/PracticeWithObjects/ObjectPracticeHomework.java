package PracticeWithObjects;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class ObjectPracticeHomework {
    @Test

    public void workingWithObjects () {

        Book firstBook = new Book();
        firstBook.setAuthor("E. Hemingway");
        firstBook.setHeight(5.55);
        firstBook.setPageCount(856);
        firstBook.setLength(4.5);
        firstBook.setWidth(4.8);

        Book secondBook = new Book();
        secondBook.setWidth(4.22);
        secondBook.setLength(6.770);
        secondBook.setAuthor("M. Twain");
        secondBook.setHeight(3.95);
        secondBook.setPageCount(667);

        Car firstCar = new Car();
        firstCar.setColour("Green");
        firstCar.setMileage(9999.333f);
        firstCar.setGasUsagePer100km(2.7);
        firstCar.setWeight(2080);

        Car secondCar = new Car();
        secondCar.setColour("silver");
        secondCar.setMileage(0);
        secondCar.setUsed(false);
        secondCar.setGasUsagePer100km(1.5);
        secondCar.setWeight(1500);

        Dress firstDress = new Dress();

        firstDress.setColour("Pink");
        firstDress.setBrand("H&M");
        firstDress.setPrice(19.99);
        firstDress.setSize(38);


        Dress secondDress = new Dress();

        secondDress.setColour("White");
        secondDress.setBrand("Dior");
        secondDress.setPrice(99.89);
        secondDress.setSize(42);


        Glass firstGlass = new Glass();

        firstGlass.setColour("Blue");
        firstGlass.setWidth(4.3f);
        firstGlass.setDepth(12.8);
        firstGlass.setVolume(0.33);

        Glass secondGlass = new Glass();

        secondGlass.setColour("Red");
        secondGlass.setWidth(4.4f);
         secondGlass.setDepth(9.7);
        secondGlass.setVolume(0.25);

        House firstHouse = new House();

        firstHouse.setPrice(BigDecimal.valueOf(9888.55554));
        firstHouse.setAddress("Bultu str 10");
        firstHouse.setNumberOfRooms(6);
        firstHouse.setWallHeight(3.5f);

        House secondHouse = new House();

        secondHouse.setPrice(BigDecimal.valueOf(1000008.255));
        secondHouse.setAddress("Jomas str 10");
        secondHouse.setNumberOfRooms(10);
        secondHouse.setWallHeight(3.8f);

        Phone firstPhone = new Phone();

        firstPhone.setPrice(9.99);
        firstPhone.setWidth(7.2);
        firstPhone.setRamMemory(8);
        firstPhone.setSsdMemory(128);

        Phone secondPhone = new Phone();

        secondPhone.setPrice(1490.66);
        secondPhone.setWidth(12);
        secondPhone.setRamMemory(8);
        secondPhone.setSsdMemory(512);

        Plane firstPlane = new Plane();

        firstPlane.setBrand("Boeing");
        firstPlane.setGasUsagePer100km(2250.3);
        firstPlane.setTankVolume(24140);
        firstPlane.setMaxFlightHeight(8000.00);

        Plane secondPlane = new Plane();

        secondPlane.setBrand("Airbus");
        secondPlane.setGasUsagePer100km(2350.3);
        secondPlane.setTankVolume(24145);
        secondPlane.setMaxFlightHeight(8000.00);

        Pool firstPool = new Pool();

        firstPool.setAddress("Bergu iela 3");
        firstPool.setDepth(2.8);
        firstPool.setLength(100.2);
        firstPool.setVolume(300);

        Pool secondPool = new Pool();

        secondPool.setAddress("Brivibas gatve 356");
        secondPool.setDepth(2);
        secondPool.setLength(50.3);
        secondPool.setVolume(250);

        Train firstTrain = new Train();

        firstTrain.setCartLength(10.88);
        firstTrain.setGasUsagePer100km(160);
        firstTrain.setTankVolume(1100);
        firstTrain.setPassengerSeats(144);

        Train secondTrain = new Train();
        secondTrain.setCartLength(12.7);
        secondTrain.setGasUsagePer100km(110);
        secondTrain.setTankVolume(1020);
        secondTrain.setPassengerSeats(300);



        System.out.println("Hello user!");
        System.out.println("Book report");

        System.out.println("Book 1");
        System.out.println(firstBook.getAuthor());
        System.out.println(firstBook.getHeight());
        System.out.println(firstBook.getLength());
        System.out.println(firstBook.getPageCount());
        System.out.println(firstBook.getWidth());

        System.out.println("Book 2");
        System.out.println(secondBook.getAuthor());
        System.out.println(secondBook.getHeight());
        System.out.println(secondBook.getLength());
        System.out.println(secondBook.getPageCount());
        System.out.println(secondBook.getWidth());

        System.out.println("Car report");

        System.out.println("Car 1");
        System.out.println(firstCar.getColour());
        System.out.println(firstCar.getMileage());
        System.out.println(firstCar.getWeight());
        System.out.println(firstCar.getGasUsagePer100km());

        System.out.println("Car 2");
        System.out.println(secondCar.getColour());
        System.out.println(secondCar.getMileage());
        System.out.println(secondCar.getWeight());
        System.out.println(secondCar.getGasUsagePer100km());

        System.out.println("Dress report");

        System.out.println("Dress 1");
        System.out.println(firstDress.getColour());
        System.out.println(firstDress.getBrand());
        System.out.println(firstDress.getPrice());
        System.out.println(firstDress.getSize());

        System.out.println("Dress 2");
        System.out.println(secondDress.getColour());
        System.out.println(secondDress.getBrand());
        System.out.println(secondDress.getPrice());
        System.out.println(secondDress.getSize());

        System.out.println("Glass report");

        System.out.println("Glass 1");
        System.out.println(firstGlass.getColour());
        System.out.println(firstGlass.getWidth());
        System.out.println(firstGlass.getDepth());
        System.out.println(firstGlass.getVolume());

        System.out.println("Glass 2");
        System.out.println(secondGlass.getColour());
        System.out.println(secondGlass.getWidth());
        System.out.println(secondGlass.getDepth());
        System.out.println(secondGlass.getVolume());

        System.out.println("House report");

        System.out.println("House 1");
        System.out.println(firstHouse.getPrice());
        System.out.println(firstHouse.getAddress());
        System.out.println(firstHouse.getNumberOfRooms());
        System.out.println((firstHouse.getWallHeight()));

        System.out.println("House 2");
        System.out.println(secondHouse.getPrice());
        System.out.println(secondHouse.getAddress());
        System.out.println(secondHouse.getNumberOfRooms());
        System.out.println(secondHouse.getWallHeight());

        System.out.println("Phone report");

        System.out.println("Phone 1");
        System.out.println(firstPhone.getPrice());
        System.out.println(firstPhone.getWidth());
        System.out.println(firstPhone.getRamMemory());
        System.out.println(firstPhone.getSsdMemory());

        System.out.println("Phone 2");
        System.out.println(secondPhone.getPrice());
        System.out.println(secondPhone.getWidth());
        System.out.println(secondPhone.getRamMemory());
        System.out.println(secondPhone.getSsdMemory());

        System.out.println("Plane report");

        System.out.println("Plane 1");
        System.out.println(firstPlane.getBrand());
        System.out.println(firstPlane.getGasUsagePer100km());
        System.out.println(firstPlane.getMaxFlightHeight());
        System.out.println(firstPlane.getTankVolume());

        System.out.println("Plane 2");
        System.out.println(secondPlane.getBrand());
        System.out.println(secondPlane.getGasUsagePer100km());
        System.out.println(secondPlane.getMaxFlightHeight());
        System.out.println(secondPlane.getTankVolume());

        System.out.println("Pool report");

        System.out.println("Pool 1 ");
        System.out.println(firstPool.getAddress());
        System.out.println(firstPool.getDepth());
        System.out.println(firstPool.getLength());
        System.out.println(firstPool.getVolume());

        System.out.println("Pool 2 ");
        System.out.println(secondPool.getAddress());
        System.out.println(secondPool.getDepth());
        System.out.println(secondPool.getLength());
        System.out.println(secondPool.getVolume());

        System.out.println("Train report");

        System.out.println("Train 1");
        System.out.println(firstTrain.getCartLength());
        System.out.println(firstTrain.getGasUsagePer100km());
        System.out.println(firstTrain.getTankVolume());
        System.out.println(firstTrain.getPassengerSeats());

        System.out.println("Train 2");
        System.out.println(secondTrain.getCartLength());
        System.out.println(secondTrain.getGasUsagePer100km());
        System.out.println(secondTrain.getTankVolume());
        System.out.println(secondTrain.getPassengerSeats());

}



}
