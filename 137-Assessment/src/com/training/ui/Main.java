package com.training.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int fendCount;
		int bendCount;

		fendCount = Integer.parseInt(br.readLine());
		bendCount = Integer.parseInt(br.readLine());

//	System.out.println(fendCount +" "+ bendCount);

		int[] fendCostArray = new int[fendCount + bendCount];
		String[] arr1 = br.readLine().trim().split(" ");

		for (int i = 0; i < arr1.length; i++) {
			fendCostArray[i] = Integer.parseInt(arr1[i]);
		}

		int[] bendCostArray = new int[fendCount + bendCount];
		String[] arr2 = br.readLine().trim().split(" ");

		for (int i = 0; i < arr2.length; i++) {
			bendCostArray[i] = Integer.parseInt(arr2[i]);
		}

//	System.out.println(Arrays.toString(fendCostArray));
//	System.out.println(Arrays.toString(bendCostArray));

		List<Integer> list1 = new LinkedList<>();
		for (int i = 0; i < arr1.length; i++) {
			list1.add(Integer.parseInt(arr1[i]));
		}

		List<Integer> list2 = new LinkedList<>();
		for (int i = 0; i < arr2.length; i++) {
			list2.add(Integer.parseInt(arr2[i]));
		}
		int totalCost = 0;
		int numberHired = 0;

		for (int i = 1; i <= fendCount; i++) {

			Integer fendmin = 0;
			if (list1.size() > 0) {

				fendmin = Collections.min(list1);
				totalCost += fendmin;
				numberHired++;
				System.out.println("Front end selection"+fendmin);
				System.out.println("Hired"+numberHired);
				int position = list1.indexOf(fendmin);
				list1.remove(Integer.valueOf(fendmin));
				list2.remove(position);
			}

		}
		

		for (int i = 1; i <= bendCount; i++) {

			Integer bendmin = 0;
			if (list2.size() > 0) {

				bendmin = Collections.min(list2);
				totalCost += bendmin;
				numberHired++;
				System.out.println("Back end selection"+bendmin);
				System.out.println("Hired"+numberHired);
				int position = list2.indexOf(bendmin);
				list2.remove(Integer.valueOf(bendmin));
				list1.remove(position);
			}

		}
		
		System.out.println(numberHired);
		
		System.out.println(totalCost);

	}
}
