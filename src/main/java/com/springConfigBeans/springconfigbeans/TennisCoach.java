package com.springConfigBeans.springconfigbeans;

public class TennisCoach implements Coach {
	
	//will do DI using setter injection
	private FortuneService theFortuneService;
	
	
	private String email;
	
	
	public void setEmail(String theemail) {
		email = theemail;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public void setFortuneService(FortuneService fortuneService) {
		theFortuneService = fortuneService ;
	}
	
	public void doMyStartupStuff() {
		System.out.println("some startup stuff");
	}

	public void destroy() {
		System.out.println("some clean up");
	}
	
	@Override
	public String getSchedule() {
		// TODO Auto-generated method stub
		return "10 hrs of Tennis";
	}

	@Override
	public String getServiceUsingDI() {
		// TODO Auto-generated method stub
		return theFortuneService.getService() + " from tennis hooray";
	}

}
