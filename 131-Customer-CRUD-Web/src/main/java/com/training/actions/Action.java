package com.training.actions;

public abstract class Action {
	public final void go() {
		init();
		execute();
		complete();
	}

	public abstract void init();

	public abstract void execute();

	public abstract void complete();

}
