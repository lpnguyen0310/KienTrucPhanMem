package decoratorPattern.decorator;

public class AccountantResponsibilities extends BaseResponsibilities {
	 @Override
	    public void performDuties() {
	        super.performDuties();
	        System.out.println("Quản lý sổ sách.");
	        System.out.println("Kế toán và báo cáo tài chính.");
	    }
}
