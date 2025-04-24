package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.Payment;

public class Main11 {
public static void main(String[] args) {
	List<Payment> payments=new LinkedList<>();
	
	payments.add(new Payment("JAN",1000));
	payments.add(new Payment("FEB",2000));
	payments.add(new Payment("MAR",3000));
	payments.add(new Payment("APR",4000));
	System.out.println(payments);
	System.out.println(payments.contains(new Payment("DEC",1000)));
	payments.remove(new Payment("JUN",3000));
	System.out.println(payments);
	
}
}
