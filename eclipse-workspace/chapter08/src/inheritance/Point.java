package inheritance;

//public class Point extends Object{		//extends Object는 생략 됨
	
public class Point{
	private int x,y;		// 좌표를 나타내는 변수
							// protected : default 접근 제한자와 통일, 다른패기지의 상속된 클래스에 접근 허용
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
	
}
