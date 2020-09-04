package com.springConfigBeans.springconfigbeans;

public class BaseBallCoach implements Coach {
	
	
	private FortuneService theFortuneService;
		
	
	 public BaseBallCoach(FortuneService fortuneService) {
		theFortuneService = fortuneService;
	}

	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return "5 hrs of baseball today";
	}
	
    @Override
	public String getServiceUsingDI() {
		return theFortuneService.getService();
	}
}
