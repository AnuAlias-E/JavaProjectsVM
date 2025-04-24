package com.training.dto.request;

import com.training.model.AppUser;

public class AppUserAuthenticateRequest {
	private AppUser appUser;

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

}
