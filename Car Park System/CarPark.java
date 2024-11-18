package com.fdmgroup.carPark;


import java.time.Duration;
import java.time.LocalTime;
import java.util.HashMap;

public class CarPark {
	HashMap<Car, LocalTime> carEntries = new HashMap<Car, LocalTime>();
	HashMap<Car, LocalTime> carExits = new HashMap<Car, LocalTime>();
	int fee;
	int totalSpaces = 100;

	
	public HashMap<Car, LocalTime> getCarEntries() {
		return carEntries;
	}

	public void setCarEntries(HashMap<Car, LocalTime> carEntries) {
		this.carEntries = carEntries;
	}

	public HashMap<Car, LocalTime> getCarExits() {
		return carExits;
	}

	public void setCarExits(HashMap<Car, LocalTime> carExits) {
		this.carExits = carExits;
	}

	public void carParkEntry(Car car) {
		
		if(carEntries.containsKey(car)){
			carExits.put(car, LocalTime.now());
			LocalTime exitTime = carExits.get(car);
			LocalTime entryTime = carEntries.get(car);
			String carReg = car.getRegNum();
			Duration timeDiff = Duration.between(entryTime, exitTime);
			long duration = timeDiff.toHours();
				parkingFee(duration);
			carEntries.remove(car);	
			System.out.println("Car "+ carReg +" has exited the carpark at "+exitTime+".Please pay a fee of £"+fee);
		}else{
			carEntries.put(car, LocalTime.now());
			String carReg = car.getRegNum();
			LocalTime entryTime = carEntries.get(car);
			System.out.println("Car "+carReg+" has entered the carpark at "+entryTime);
		}
		
	}
	
	public void parkingFee(long duration) {
		if(duration <= 1) {
			fee = 10;
		}else if(duration <= 4) {
			fee = 20;
		}else if(duration <= 40) {
			fee = 30;
		}
		
	}
	
	public void getAvailableSpaces() {
		int occupiedSpaces = carEntries.size();
		System.out.println(occupiedSpaces);
		int availableSpaces = totalSpaces - occupiedSpaces;
		System.out.println("number of available parking spaces: "+availableSpaces);
	}

}
