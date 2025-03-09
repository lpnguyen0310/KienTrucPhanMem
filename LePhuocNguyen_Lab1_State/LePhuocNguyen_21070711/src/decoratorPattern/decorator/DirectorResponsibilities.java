package decoratorPattern.decorator;

public class DirectorResponsibilities extends BaseResponsibilities {
	@Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Quản lý tổng thể công ty.");
        System.out.println("Ra quyết định chiến lược.");
    }
}
