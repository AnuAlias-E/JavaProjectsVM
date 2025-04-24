package com.training.dp;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements Subject {
	
	private List<Observer> observers =new LinkedList<>();
	private String weather;
	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(weather);
		}
		
	}
	
	public void setWeather(String weather) {
		this.weather=weather;
		notifyObservers();
	}

}
