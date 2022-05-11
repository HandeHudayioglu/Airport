package com.bileadam.airport;

import com.bileadam.model.airport.Airport;

public class AirportManager {
	
	private Airport airport;

	public static void main (String [] args) {
		
		System.out.println("Havaalani Yonetim Uygulamasi");
		
		AirportManager manager = new AirportManager();
		manager.airport = new Airport ("Istanbul Airport", "Istanbul");
		System.out.println(manager.airport);
		System.out.println("Havaalani Yonetim Uygulamasini kullandiginiz icin tesekkurler");
	}

}
