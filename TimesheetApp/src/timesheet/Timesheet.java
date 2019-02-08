package timesheet;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Timesheet {

	private List<TimesheetEntry> database;
	
	public Timesheet() {
		this.database = new ArrayList<TimesheetEntry>();
	}
	
	public void add(String project, String task) {
		TimesheetEntry t1 = new TimesheetEntry(project, task);
		this.database.add(t1);
	}
	public List<TimesheetEntry>list(boolean activeOnly){
		List<TimesheetEntry> entries = new ArrayList<TimesheetEntry>();
		Iterator<TimesheetEntry> iter = this.database.iterator();
		if (activeOnly == true) {
			while(iter.hasNext()) {
				TimesheetEntry t1 = iter.next();
				if (t1.getEndTime() == null) {
					entries.add(t1);
				}
			}
			return entries;
		}
		while(iter.hasNext()) {
			TimesheetEntry t1 = iter.next();
			entries.add(t1);
		}
		return entries;
	}
	public List<TimesheetEntry>list(String projectName){
		List<TimesheetEntry> entries = new ArrayList<TimesheetEntry>();
		Iterator<TimesheetEntry> iter = this.database.iterator();
		while(iter.hasNext()) {
			TimesheetEntry t1 = iter.next();
			if (t1.getProjectName().equals(projectName)) {
				entries.add(t1);
			}
		}
		return entries;
	}
	
	public List<TimesheetEntry>list(boolean activeOnly, String projectName){
		List<TimesheetEntry> entries = new ArrayList<TimesheetEntry>();
		Iterator<TimesheetEntry> iter = this.database.iterator();
		while(iter.hasNext()) {
			TimesheetEntry t1 = iter.next();
			if (t1.getProjectName().equals(projectName)) {
				entries.add(t1);
			}
		}

		return entries;
	}
	
	public TimesheetEntry get(int id){
		Iterator<TimesheetEntry> iter = this.database.iterator();
		while(iter.hasNext()) {
			TimesheetEntry t1 = iter.next();
			if(t1.getId() == id) {
				return t1;
			}
		}
		return null;
	}
	
	public void delete(TimesheetEntry entry) {
		if (this.database.contains(entry)){
			this.database.remove(entry);
		}
		else {
			System.out.println("[Sorry- that record does not exist]");
		}

		
	}
	
	public void stop(TimesheetEntry entry) throws Exception {
		entry.updateEndTime();
	}
	
}
