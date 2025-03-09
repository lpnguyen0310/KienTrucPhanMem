package decoratorPattern.entity;

import decoratorPattern.JobResponsibilities;

public class Employee {
	  private String name;
	    private JobResponsibilities jobResponsibilities;

	    public Employee(String name, JobResponsibilities jobResponsibilities) {
	        this.name = name;
	        this.jobResponsibilities = jobResponsibilities;
	    }

	    public void performDuties() {
	        System.out.println("Nhân viên: " + name);
	        jobResponsibilities.performDuties();
	    }
}
