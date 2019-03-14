package toDoApp;


public class ToDoItem {

//	Member variables
	private int Id;
	private String Description;
	private boolean CompletedFlag;
	
	//constructor for the to do item
    public ToDoItem(int myId, String myDescription, boolean myCompletedFlag){
        this.Id = myId;
        this.Description = myDescription;
        this.CompletedFlag = myCompletedFlag;
    }

    /////////////////////////////////////////////
    ///getters and setters for the member variables////////
	public int getId() {
		return this.Id;
	}

	public void setId(int id) {
		Id = id;
	}


	public String getDescription() {
		return this.Description;
	}


	public void setDescription(String description) {
		Description = description;
	}


	public boolean isCompletedFlag() {
		return this.CompletedFlag;
	}


	public void setCompletedFlag(boolean completedFlag) {
		CompletedFlag = completedFlag;
	}
	
	///prints out the item
	public void printItem() {
		System.out.println("Id:" + this.Id + " description: "+ this.Description + " " + this.CompletedFlag);
	}
}
