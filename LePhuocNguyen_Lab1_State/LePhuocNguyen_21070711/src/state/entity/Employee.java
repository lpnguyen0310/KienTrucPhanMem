package state.entity;

import state.JobState;

public class Employee {
	 private String name;
	    private JobState jobState;

	    public Employee(String name, JobState jobState) {
	        this.name = name;
	        this.jobState = jobState;
	    }

	    public void performDuties() {
	        System.out.println("Nhân viên: " + name);
	        jobState.performDuties();
	    }
}
