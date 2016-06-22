package Luna_1;

import java.util.Scanner;

public class Start_Program {

	public static void main(String[] args) {

		if (args.length < 0) {
			System.out.println("no argumets where given");
			System.exit(0);
		}//this if is to check if the main has any arguments or not.
		
		Scanner scan = new Scanner(System.in); //Scanner is used to scan entries from the console.

		while (!scan.hasNext("exit")) {  // if you type in  "exit" then  you program will close

			if (scan.hasNextInt()) { // if you type in an Integer then  you  will start the analize for the number  entered.
				int number = scan.nextInt();  //stores the number
				Numbers n = new Numbers(number);  //Instantiation of Numbers Constructor with an integer parameter defined in Numbers CLass.

				if (n.even()) { // If is true Then prin even else odd.
					System.out.println("The " + number + " is even");
				} else {
					if (n.Odd()) {
						System.out.println("The " + number + " is Odd");
					}
				}

			} else { // if you insert something else then integer. get warned that is not an integer.
				System.out.println("Warning!: Last Entry " + scan.findInLine(".[^0-9]*") + " Is not an Integer");
				scan.next();// allow to scan after warning
			}
		}

		System.out.println("Program is shutting down . . .");
		scan.close();//close the scanner.
		System.exit(0);//exit program.
	}
}
