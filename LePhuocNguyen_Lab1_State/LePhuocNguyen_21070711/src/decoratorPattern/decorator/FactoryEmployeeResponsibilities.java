package decoratorPattern.decorator;

public class FactoryEmployeeResponsibilities extends BaseResponsibilities{
	 @Override
	    public void performDuties() {
	        super.performDuties();
	        System.out.println("Sản xuất và kiểm tra sản phẩm.");
	    }
}
