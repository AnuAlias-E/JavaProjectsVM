package com.training.ui;

import com.training.dp.NewsPaper;
import com.training.dp.NewsStation;
import com.training.dp.Observer;
import com.training.dp.TVChannel;
import com.training.dp.Youtube;

public class Main1 {
	public static void main(String[] args) {
		Observer observer1 = new NewsPaper();
		Observer observer2 = new TVChannel();
		Observer observer3 = new Youtube();

		NewsStation subject = new NewsStation();
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		System.out.println("After adding Two Observers");
		System.out.println("------------------------------");
		subject.setNews("India Won World Cup");
		System.out.println("------------------------------");
		System.out.println("After adding one more Observer");
		System.out.println("------------------------------");
		subject.addObserver(observer3);
		subject.setNews("Man of the Match : Virat Kohli");
		System.out.println("------------------------------");

		subject.removerObserver(observer2);
		System.out.println("After removing one observer");
		System.out.println("------------------------------");
		subject.setNews("US - stock market crashes");
		System.out.println("------------------------------");
	}
}
