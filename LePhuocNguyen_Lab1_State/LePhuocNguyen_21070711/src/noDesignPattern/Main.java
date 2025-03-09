package noDesignPattern;

public class Main {
	public static void main(String[] args) {
		Employee teamLeader = new Employee("Nguyễn Văn A", "Đội trưởng");
		Employee director = new Employee("Nguyễn Văn B", "Giám Đốc");
		Employee officeEmployee = new Employee("Nguyễn Văn C", "Nhân viên VP");
		Employee factoryEmployee = new Employee("Hoàng Văn D", "Nhân viên Xưởng");
        Employee accountant = new Employee("Ngô Minh E", "Kế Toán Trưởng");
        
        teamLeader.performDuties();
        director.performDuties();
        officeEmployee.performDuties();
        factoryEmployee.performDuties();
        accountant.performDuties();
        
        
	}
}
