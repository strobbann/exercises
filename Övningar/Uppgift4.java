import java.util.Scanner;
public class Uppgift4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String wantToContiue = "";
		do{
		System.out.println("ange två tal : ");
		int firstNumber = randomNumber();
		int secondNumber = randomNumber();
		char symbol = randomSymbol(new char[]{'+', '-', '/', '*'});
		whatToCalculate(firstNumber,secondNumber,in,symbol);
		in.nextLine();
		System.out.print("vill du fortsätta: ");
		wantToContiue = in.nextLine();
		}while(!wantToContiue.equals("NEJ"));
	}
	
	public static void addtion(int firstNumber, int secondNumber, Scanner in){
		System.out.println("vad blir " + firstNumber + " + " + secondNumber + "?");
		int answer = in.nextInt();
		int rightAnswer = firstNumber + secondNumber;
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
	}
	
	public static void difference(int firstNumber, int secondNumber, Scanner in){
		System.out.println("vad blir " + firstNumber + " - " + secondNumber + "?");
		int answer = in.nextInt();
		int rightAnswer = firstNumber - secondNumber;
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
	}
	
	public static void multiply(int firstNumber, int secondNumber,Scanner in) {
		System.out.println("vad blir " + firstNumber + " * " + secondNumber + "?");
		int answer = in.nextInt();
		int rightAnswer = firstNumber * secondNumber;
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
	}
	
	public static void divide(int firstNumber, int secondNumber, Scanner in){
		System.out.println("vad blir " + firstNumber + " / " + secondNumber + "?");
		int answer = in.nextInt();
		int rightAnswer = firstNumber / secondNumber;
		if((rightAnswer) == answer ){
			System.out.println("Rätt Svar");
		} else {
			System.out.println("Fel svar det rätta svaret är " + rightAnswer);
		}
	}
	
	public static void whatToCalculate(int firstNumber, int secondNumber, Scanner in,char symbol){
		switch(symbol){
			
			case '+' : {
				addtion(firstNumber, secondNumber,in);
				break;
			}
			case '-' : {
				difference(firstNumber, secondNumber,in);
				break;
			}
			case '*': {
				multiply(firstNumber, secondNumber, in);
				break;
			}
			case '/': {
				divide(firstNumber, secondNumber, in);
				break;
			}
			default: {
				System.out.println("invalid operation");
			}
		}
	}
	
	public static int randomNumber(){
		return (int) (Math.random() * 100);
	}
	
	public static char randomSymbol(char ... symbols) {
		int randomIndex = (int) (Math.random() * symbols.length);
		
		return symbols[randomIndex];
	}
}