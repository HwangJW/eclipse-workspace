package staticex;

public class Student1 {

	public static int serialNum = 1000;	// Ŭ���� ����, static ����
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {	// Ŭ���� �޼ҵ�, static �޼ҵ�
		int i = 10;
		// studentName = "aaa";
		return serialNum;
	}
	
}
