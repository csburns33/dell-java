package timesheet;

import java.time.LocalDateTime;

public class TimesheetEntry {
	
	private String projectName;
	private String task;
	private int id;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	
	private static int NEXTID = 1;
	
	public TimesheetEntry(String myProject, String myTask) {
		this.projectName = myProject;
		this.task = myTask;
		this.startTime = LocalDateTime.now();
		this.id = NEXTID;
		NEXTID++;
	}
	
	public void updateEndTime() throws Exception {
		if (this.endTime == null) { 
			this.endTime = LocalDateTime.now();
		}
		else {
			throw new Exception("You cannot update this entry. It has already been completed.");			
		}
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

}
