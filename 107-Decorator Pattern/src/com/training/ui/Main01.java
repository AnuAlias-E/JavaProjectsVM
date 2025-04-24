package com.training.ui;

import com.training.dp.Box;
import com.training.dp.GiftPack;
import com.training.dp.Pen;

public class Main01 {

	public static void main(String[] args) {
		Pen pen = new Pen(null);
		Box box = new Box(pen);
		GiftPack giftPack = new GiftPack(box);
		System.out.println("Price: " + giftPack.getPrice());
		System.out.println("Discount: " + giftPack.getDiscount());
	}

}
