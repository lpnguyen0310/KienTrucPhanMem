package strategyPattern.Strategy;

import strategyPattern.JobResponsibilities;

public class DirectorResponsibilities implements JobResponsibilities{

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		 System.out.println("Quản lý tổng thể công ty.");
	     System.out.println("Ra quyết định chiến lược.");
	}

}
