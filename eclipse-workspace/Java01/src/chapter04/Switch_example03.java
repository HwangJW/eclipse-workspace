package chapter04;

public class Switch_example03 {

	public static void main(String[] args) {
		String medal = "S";
		
		if ((medal == "Gold")||(medal == "g")||(medal == "G")) {
			System.out.println("�ݸ޴� �Դϴ�.");
		}
		else if ((medal == "Silver")||(medal == "S")||(medal == "s")) {
			System.out.println("���޴� �Դϴ�.");
		}
		else if ((medal == "Breonze")||(medal == "B")||(medal == "b")) {
			System.out.println("���޴� �Դϴ�.");
		}
		else {
			System.out.println("�޴��� �����ϴ�.");
		}
		
		/*switch (medal) {
		case "Gold" : case "G" : case "g" : case "Gol" :
			System.out.println("�ݸ޴� �Դϴ�.");
			break;
		case "Silver" : case "S" : case "s" : 
			System.out.println("���޴� �Դϴ�.");
			break;
		case "Bronze" : case "B" : case "b" : 
			System.out.println("���޴� �Դϴ�.");
			break;
		default :
			System.out.println("�޴��� �����ϴ�.");
			break;
		}*/
	}

}
