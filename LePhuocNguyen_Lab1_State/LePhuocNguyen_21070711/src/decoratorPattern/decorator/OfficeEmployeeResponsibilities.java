package decoratorPattern.decorator;

public class OfficeEmployeeResponsibilities extends BaseResponsibilities {
	@Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Pha trà.");
        System.out.println("Phê duyệt tài liệu.");
    }
}
