package com.training.ui;

import java.util.LinkedList;
import java.util.List;

import com.training.model.BillItem;

public class Main08 {
	public static void main(String[] args) {
		List<BillItem> billItems = new LinkedList<>();
		BillItem b1 = new BillItem("Redmi", 3, 14000.00);
		billItems.add(b1);
		billItems.add(new BillItem("Samsung", 2, 15000.00));
		billItems.add(new BillItem("OPPO", 4, 20000.00));
		billItems.add(new BillItem("IPhone", 4, 24000.00));
		
		
		System.out.println("SlNo\tItemName\tQuantity\tPrice\t\tValue");
		System.out.println("*********************************************************************");
		double totalBill=0.00;
		int slNo=0;
		for(int i=0;i<billItems.size();i++) {
			BillItem billItem = billItems.get(i);
			slNo++;
			String itemName= billItems.get(i).getItemName();
			int quantity= billItems.get(i).getQuantity();
			double price= billItems.get(i).getPrice();
			double itemValue=billItems.get(i).getItemValue();
			System.out.println(slNo+"\t"+itemName+"\t\t"+quantity+"\t\t"+price+"\t\t"+itemValue);
	
			totalBill+=billItem.getItemValue();
		}
		System.out.println("*********************************************************************");
		System.out.println("Total Number of Items : "+billItems.size()+"\t\tBill Amount: "+totalBill);
	}
}
