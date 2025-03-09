package strategyPattern.Strategy;

import strategyPattern.JobResponsibilities;

public class OfficeEmployeeResponsibilities implements JobResponsibilities {

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		System.out.println("Pha trà.");
        System.out.println("Phê duyệt tài liệu.");
	}

}
