package strategyPattern.Strategy;

import strategyPattern.JobResponsibilities;

public class AccountantResponsibilities implements JobResponsibilities {

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		System.out.println("Quản lý sổ sách.");
        System.out.println("Kế toán và báo cáo tài chính.");
	}

}
