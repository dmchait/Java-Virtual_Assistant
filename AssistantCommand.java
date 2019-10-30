import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AssistantCommand{
	boolean c_commandWords = false;
	public void executeCommand(String commandWords) {
		String c=commandWords.toLowerCase();
		if((c.indexOf("date") != -1)|| (c.indexOf("time") != -1)){
			getDate_Time();
			this.c_commandWords = true;
		} else if ((c.indexOf("calculate") != -1)){
			calculate();
			this.c_commandWords = true;
		} else if(!(this.c_commandWords)) {
			System.out.println("Invalid Command");
		} else if ((c.indexOf("no") != -1)){
			System.out.println("Virtual Assistant Logging out");
			System.out.println("Goodbye!");
			this.c_commandWords = true;
		}
	}
	public void getDate_Time() {
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		System.out.println("The current date and time is: " + date.toString());
	}
	
	public void calculate() {
		String A = getInput("Enter first number: ");
        String B = getInput("Enter second number: ");
        String operator = getInput("Enter an operator (+, -, *, /):");
        
        double result = 0;
        
        try {
            switch (operator) {
                case "+":
                    result = addition(A, B);
                    break;
                case "-":
                    result = subtraction(A, B);
                    break;
                case "*":
                    result = multiplication(A, B);
                    break;
                case "/":
                    result = division(A, B);
                    break;
                default:
                    System.out.println("There is NO such operation! Please choose between the 4!");
                    break;
            }
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
}
	static String getInput(String prompt) {//METHOD FOR GETTING THE INPUT FROM THE USER
        System.out.print(prompt);
        @SuppressWarnings("resource")
		Scanner console = new Scanner(System.in);
        return console.nextLine();
    }
	static double addition(String A, String B) {
		double d1 = Double.parseDouble(A);
        double d2 = Double.parseDouble(B);
        return d1 + d2;
	}
	static double multiplication(String A, String B) {
		double d1 = Double.parseDouble(A);
        double d2 = Double.parseDouble(B);
        return d1 * d2;
	}
	static double subtraction(String A, String B) {
		double d1 = Double.parseDouble(A);
        double d2 = Double.parseDouble(B);
        return d1 - d2;
	}
	static double division(String A, String B) {
		double d1 = Double.parseDouble(A);
        double d2 = Double.parseDouble(B);
        return d1 / d2;
	}
}