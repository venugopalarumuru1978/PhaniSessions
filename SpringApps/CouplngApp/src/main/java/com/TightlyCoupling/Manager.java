package com.TightlyCoupling;

public class Manager {

	SmartWorker  sw;
	LazyWorker lw;
	ExtraSmartWorker  esw;
	public Manager(SmartWorker sw, LazyWorker lw, ExtraSmartWorker  esw)
	{
		this.sw = sw;
		this.lw = lw;
		this.esw = esw;
	}
	
	
	public void ManageWorker()
	{
		sw.work();
		lw.work();
		esw.work();
	}
}
