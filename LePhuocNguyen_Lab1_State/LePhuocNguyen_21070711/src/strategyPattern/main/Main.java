package strategyPattern.main;

import strategyPattern.Strategy.AccountantResponsibilities;
import strategyPattern.Strategy.DirectorResponsibilities;
import strategyPattern.Strategy.FactoryEmployeeResponsibilities;
import strategyPattern.Strategy.OfficeEmployeeResponsibilities;
import strategyPattern.Strategy.TeamLeaderResponsibilities;
import strategyPattern.entity.Employee;

public class Main {
	public static void main(String[] args) {
		Employee teamLeader = new Employee("Nguyễn Văn A", new TeamLeaderResponsibilities());
		Employee director = new Employee("Trần Minh B", new DirectorResponsibilities());
		Employee officeEmployee = new Employee("Lê Thị C", new OfficeEmployeeResponsibilities());
		Employee factoryEmployee = new Employee("Hoàng Văn D", new FactoryEmployeeResponsibilities());
		Employee accountant = new Employee("Ngô Minh E", new AccountantResponsibilities());

		teamLeader.performDuties();
		director.performDuties();
		officeEmployee.performDuties();
		factoryEmployee.performDuties();
		accountant.performDuties();
	}
}
