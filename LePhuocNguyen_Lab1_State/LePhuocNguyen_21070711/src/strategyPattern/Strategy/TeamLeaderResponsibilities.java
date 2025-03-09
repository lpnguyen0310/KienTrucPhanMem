package strategyPattern.Strategy;

import strategyPattern.JobResponsibilities;

public class TeamLeaderResponsibilities implements JobResponsibilities{

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		 System.out.println("Đi tuần.");
	     System.out.println("Gán việc cho nhân viên.");
	}

}
