package state.statePattern;

import state.JobState;

public class TeamLeader implements JobState {

	@Override
	public void performDuties() {
		// TODO Auto-generated method stub
		System.out.println("Đi tuần");
		System.out.println("Gán việc cho nhân viên");
	}

}
