package week1;

public class TestPersonAndStudent {

	public static void main(String[] args) {
		PersonInfo person = new PersonInfo("김지호",20195141);
		StudentInfo student = new StudentInfo("대학생 김지호",20195141);
		
		person.printPersonInfo();
		student.printStudentInfo();
	}

}
