package upcasting;

public class UpcastingEx{

	public static void main(String[] args) {
		
		Person p;
		Student s = new Student("이재문");
		p = s;		// 업캐스팅, p = (Person) s; <== 업캐스팅 할때는 Person 자료형을 
					// 명시 하지 않아도 묵시적으로 적용
		
		//Person p = new Student ("박장우");		// 업캐스팅
		
		System.out.println(p.name);
		
		//p.grade = "A";				// 컴파일 오류
		//p.department = "Com";		// 컴파일 오류
		p.name = "홍길동";
		p.id = "ID";
		
		s.grade = "A";					
		s.department = "Com";			
		s.name = "호혼";
		s.id = "Hr";
	}

}
