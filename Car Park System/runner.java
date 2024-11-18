package com.fdmgroup.carPark;

import java.time.LocalTime;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car1 = new Car("GV15TRS");
		Car car2 = new Car("CF21LBA");
		Car car3 = new Car("AS10ERT");
		Car car4 = new Car("JH17HBA");
		Car car5 = new Car("CB24LBU");
		
		CarPark carpark = new CarPark();
		
		//car had previously entered
		//LocalTime testTime = LocalTime.of(07,25,43);
		//carpark.carEntries.put(car1, testTime);
		
		//car just entered
		//carpark.carParkEntry(car1);
		
		//second car has entered
		//carpark.carParkEntry(car2);
		
		try {
            Thread.sleep(20000); // 2000 milliseconds = 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace(); // Handle the exception if the sleep is interrupted
        }
		
		//car has gone back through the entrance, meaning it has now exited
		carpark.carParkEntry(car1);
				
	}

}
