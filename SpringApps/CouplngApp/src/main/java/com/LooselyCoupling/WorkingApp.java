package com.LooselyCoupling;

public class WorkingApp {

	public static void main(String[] args) {
		Manager man = null;
		
		SmartWorker sw = new SmartWorker();
		man = new Manager(sw);
		man.ManageWorker();
		
		LazyWorker  lw = new LazyWorker();
		man = new Manager(lw);
		man.ManageWorker();
		
		ExtraSmartWorker  esw = new ExtraSmartWorker();
		man = new Manager(esw);
		man.ManageWorker();
	}

}
