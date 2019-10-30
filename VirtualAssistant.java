import java.util.Scanner;
/**
 * @author dchtk
 * Description: Basic Virtual Assistant. The assistant will take commands from the users and respond appropriately.
 * Basic commands to be established: calculations and time/ date.
 */
public class VirtualAssistant {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello! I will be your personal virtual assistant. "
				+ "\n Please start by providing your name for a more personal experience.");
		System.out.println();
		String userName = scan.nextLine().trim();
		System.out.println("Welcome, " + userName + "! How may I be of assistance today?");
		AssistantCommand  personal_Assistant = new AssistantCommand();
		String command = scan.nextLine();

		System.out.println("Command:" + command);
		personal_Assistant.executeCommand(command);
		 
		do {
			 System.out.println("Is there something else you need?");
			 command = scan.nextLine();
			 personal_Assistant.executeCommand(command);
		} while(command == "yes");
}
}
