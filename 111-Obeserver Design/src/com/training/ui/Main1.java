package com.training.ui;


import com.training.dp.Observer;
import com.training.dp.PhoneDisplay;
import com.training.dp.TVDisplay;
import com.training.dp.WeatherStation;

public class Main1 {
public static void main(String[] args) {
	Observer observer1 = new PhoneDisplay();
	Observer observer2= new TVDisplay();
	
	WeatherStation subject = new WeatherStation();
	subject.addObserver(observer1);
	subject.addObserver(observer2);
	
	subject.setWeather("99.7 Deg");
	
	subject.setWeather("100 Deg");
	
	subject.removeObserver(observer2);
	
	subject.setWeather("80.0 deg");
	
}

}
