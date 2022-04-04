package week1;

public class StudentInfo extends PersonInfo{
	String deptName;
	int stuID;
	
	public StudentInfo(String deptName, int stuID){
		name = "¿Ã∏ß";
		ID = 12345678;
		this.deptName = deptName;
		this.stuID = stuID;
	}
	
	public void printStudentInfo() {
		super.printPersonInfo();
		System.out.println("deptName : "+deptName+"\nstuID : "+stuID);
	}
}
