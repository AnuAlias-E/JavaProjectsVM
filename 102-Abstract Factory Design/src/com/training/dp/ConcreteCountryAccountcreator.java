package com.training.dp;

import com.training.model.china.ChineseAccountFactory;
import com.training.model.india.IndianAccountFactory;
import com.training.model.uk.UKAccountFactory;
import com.training.model.usa.USAAccountFactory;

public class ConcreteCountryAccountcreator implements CountryAccountCreator {

	@Override
	public AccountCreator create(String country) {
		AccountCreator accountCreator = null;
		if (country.equalsIgnoreCase("India")) {
			accountCreator = new IndianAccountFactory();
		}
		if (country.equalsIgnoreCase("USA")) {
			accountCreator = new USAAccountFactory();
		}
		if (country.equalsIgnoreCase("UK")) {
			accountCreator = new UKAccountFactory();
		}
		if (country.equalsIgnoreCase("China")) {
			accountCreator = new ChineseAccountFactory();
		}
		return accountCreator;
	}

}
