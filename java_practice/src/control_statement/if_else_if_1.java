package control_statement;

public class if_else_if_1 {
	public static void main(String[] args) {
		int Temp=20;
		if(Temp>=40 && Temp<=100) {
			System.out.println("Very Hot");
		}
		else if(Temp>31 && Temp<40) {
			System.out.println("Hot");
		}
		else if(Temp>21 && Temp<=30) {
			System.out.println("Warm");
		}
		else if(Temp>11 && Temp<=20){
			System.out.println("Cool");
		}
		else if (Temp>=0 && Temp<=10){
			System.out.println("very cool");
		}
		else {
			System.out.println("Invalid Temp");
		}
	}
}
