package com.training.ui;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.training.model.Employee;
import com.training.model.Payment;

public class Main16 {
	public static void main(String[] args) {
		List<Payment> payments = new LinkedList<>();

		payments.add(new Payment("JAN", 1000.00));
		payments.add(new Payment("JAN", 1500.00));
		payments.add(new Payment("JAN", 2000.00));

		payments.add(new Payment("FEB", 100.00));
		payments.add(new Payment("FEB", 200.00));
		payments.add(new Payment("FEB", 150.00));
		payments.add(new Payment("FEB", 300.00));

		payments.add(new Payment("MAR", 1000.00));
		payments.add(new Payment("MAR", 1500.00));

		Map<String, Long> map1;
		map1 = payments.stream().collect(Collectors.groupingBy(Payment::getMonth, Collectors.counting()));
		System.out.println(map1);
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
	
		Map<String, Double> map2;
		map2 = payments.stream()
				.collect(Collectors.groupingBy(Payment::getMonth, Collectors.summingDouble(Payment::getPaymentAmount)));
		System.out.println(map2);
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
	
		
		Map<String, List<Payment>> map3;
		map3 = payments.stream()
				.collect(Collectors.groupingBy(Payment::getMonth));
		for (Map.Entry<String, List<Payment>> entry : map3.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(
					"--------------------------------------------------------------------------------------------------");
			List<Payment> paymentList= entry.getValue();
			for (Payment p : paymentList) {
				System.out.println(p.toString());
			}
			System.out.println(
					"--------------------------------------------------------------------------------------------------");
		
		}
		

	}
}
