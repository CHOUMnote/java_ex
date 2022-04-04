package week1;

public class PersonInfo {
	String name;
	int ID;
	
	public PersonInfo() {};
	public PersonInfo(String name, int ID){
		this.name = name;
		this.ID = ID;
	}
	
	public void printPersonInfo() {
		System.out.println("name : "+name+"\nID : "+ID);
	}
}