package project;

public class File  extends AEntry{
	
	public String content = "";
	

	/**
	 * Build a constructor here similar to Directory
	 * you will have to add also content in the function arguments
	 */
	public String getContent(){
		return content;
	}
	
	public void SetContent(String c){
		content = c;
	}
	

}