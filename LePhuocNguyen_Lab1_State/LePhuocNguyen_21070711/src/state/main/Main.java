package state.main;

import state.entity.Employee;
import state.statePattern.Accountant;
import state.statePattern.Director;
import state.statePattern.FactoryEmployee;
import state.statePattern.OfficeEmployee;
import state.statePattern.TeamLeader;

public class Main {
	public static void main(String[] args) {
		Employee teamLeader = new Employee("Nguyễn Văn A", new TeamLeader());
        Employee director = new Employee("Trần Minh B", new Director());
        Employee officeEmployee = new Employee("Lê Thị C", new OfficeEmployee());
        Employee factoryEmployee = new Employee("Hoàng Văn D", new FactoryEmployee());
        Employee accountant = new Employee("Ngô Minh E", new Accountant());

        teamLeader.performDuties();
        director.performDuties();
        officeEmployee.performDuties();
        factoryEmployee.performDuties();
        accountant.performDuties();
	}
}
