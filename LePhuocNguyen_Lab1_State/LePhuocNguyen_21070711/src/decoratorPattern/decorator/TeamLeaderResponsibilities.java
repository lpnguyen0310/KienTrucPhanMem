package decoratorPattern.decorator;

public class TeamLeaderResponsibilities extends BaseResponsibilities{
	@Override
    public void performDuties() {
        super.performDuties();
        System.out.println("Đi tuần.");
        System.out.println("Gán việc cho nhân viên.");
    }
}
