package com.TightlyCoupling;

public class WorkerApp {

	public static void main(String[] args) {
		SmartWorker sw = new SmartWorker();
		LazyWorker lw = new LazyWorker();
		ExtraSmartWorker  esw = new ExtraSmartWorker();
		Manager man = new Manager(sw,lw, esw);
		man.ManageWorker();
	}

}
