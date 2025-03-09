package decoratorPattern.decorator;

import decoratorPattern.JobResponsibilities;

public class BaseResponsibilities implements JobResponsibilities {

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
        System.out.println("Nhân viên thực hiện các công việc cơ bản.");

	}

}
