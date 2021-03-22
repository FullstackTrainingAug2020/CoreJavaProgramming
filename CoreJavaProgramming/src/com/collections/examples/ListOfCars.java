package com.collections.examples;

import java.util.ArrayList;

public class ListOfCars {

	public static void main(String[] args) {
		
		ArrayList<Car> carList = new ArrayList<Car>();
		
		Car swift = new Car();
		
		swift.setCarManufacturer("MARUTI");
		swift.setCarManufacturingYear(2018);
		swift.setCarModel("SWIFT");
		swift.setCarNumber("1234");
		
		Car i20 = new Car();
		
		i20.setCarManufacturer("HYUNDAI");
		i20.setCarManufacturingYear(2020);
		i20.setCarModel("I20");
		i20.setCarNumber("4312");
		
		Car baleno = new Car();
		
		baleno.setCarManufacturer("MARUTI");
		baleno.setCarManufacturingYear(2021);
		baleno.setCarModel("BALENO");
		baleno.setCarNumber("5478");
		
		Car thar = new Car();
		
		thar.setCarManufacturer("MAHINDRA");
		thar.setCarManufacturingYear(2021);
		thar.setCarModel("THAR");
		thar.setCarNumber("5984");
		
		carList.add(swift);
		carList.add(i20);
		carList.add(baleno);
		carList.add(thar);
		
		for(int cnt=0; cnt<carList.size(); cnt++)
		{
			if (carList.get(cnt).getCarManufacturingYear() == 2021)
			{
				System.out.println("CAR MANUFACTURED IN 2021: "+carList.get(cnt).getCarModel());
			}
			else
			{
				System.out.println("CAR NOT MANUFACTURED IN 2021: "+carList.get(cnt).getCarModel());
			}
		}


	}

}
