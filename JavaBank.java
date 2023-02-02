
import java.io.*;
import java.util.Scanner;

public class minerBank {
	public static void main(String[] args)throws Exception {		
		File nameofFile=new File("C:/Users/CoolGuy/eclipse-workspace/minerBank/src/users.txt");
		Scanner fileScnr=new Scanner(nameofFile);
		Scanner scnr=new Scanner(System.in);
		String UserInput;
		//while(fileScnr.hasNext()) {
		String UserName=fileScnr.next();
		int UserPin=fileScnr.nextInt();
		int check=fileScnr.nextInt();
		int sav=fileScnr.nextInt();
		int pin;
		int withdrawal;
		int deposit;
		int transfer;
		int at=0;
		String menuv = "";
		System.out.println("Enter Username:");
		UserInput=scnr.nextLine();
		System.out.println("Enter Pin:");
		pin=scnr.nextInt();

		while(fileScnr.hasNextLine() && !UserInput.equals(UserName) && pin != UserPin) {
			UserName=fileScnr.next();
			UserPin=fileScnr.nextInt();
			check=fileScnr.nextInt();
			sav=fileScnr.nextInt();
			fileScnr.hasNextLine();
		}
		while((!UserName.equals(UserInput)||UserPin!=pin)&& at !=2) {
			nameofFile=new File("C:/Users/CoolGuy/eclipse-workspace/minerBank/src/users.txt");
			fileScnr=new Scanner(nameofFile);
			System.out.println("Enter Username:");
			UserInput=scnr.next();
			System.out.println("Enter Pin:");
			pin=scnr.nextInt();
			scnr.nextLine();
			while(fileScnr.hasNextLine() && !UserInput.equals(UserName) && pin != UserPin) {
				UserName=fileScnr.next();
				UserPin=fileScnr.nextInt();
				check=fileScnr.nextInt();
				sav=fileScnr.nextInt();
				fileScnr.hasNextLine();
			}
			if(!UserName.equals(UserInput)||UserPin!=pin) {
				at=at+1;
			}
		}
		if(at==2) {
			System.out.println("Invalid creditals");
		}
		while(UserName.equals(UserInput)&&UserPin== pin && !menuv.equals("5")){
			System.out.println("1. Check Balance");
			System.out.println("2. Withdraw Money"); 
			System.out.println("3. Deposit Money"); 
			System.out.println("4. Transfer Money");
			System.out.println("5. Exit");
			System.out.println("Welcome to Miner Bank! Enter the menu option you want (1-5)");
			menuv=scnr.next();
			if(menuv.equals("1")){//user picks option 1
				System.out.println("Select one of the following options:");
				System.out.println("1. Checking Account");
				System.out.println("2. Saving Account");
				String UserInput1=scnr.next();
				if(UserInput1.equals("1")){//user picks checking account
					System.out.println(check);
				}
				//prints # from file
				else{//user picks saving account
					System.out.println(sav);//prints # from file}
				}
			}
			else if(menuv.equals("2")){
				System.out.println("Withdraw from the following options:");
				System.out.println("1. Checking Account");
				System.out.println("2. Saving Account");
				String UserInput1=scnr.next();
				if(UserInput1.equals("1")){
					System.out.println("Enter a withdrawal amount:");
					withdrawal=scnr.nextInt();
					check=check-withdrawal;
					System.out.println(check);}
				else if(UserInput1.equals("2")){
					System.out.println("Enter a withdrawal amount:");
					withdrawal=scnr.nextInt();
					sav=sav-withdrawal;
					System.out.println(sav);}
			}
			else if(menuv.equals("3")){
				System.out.println("Deposit into the following options:");
				System.out.println("1. Checking Account");
				System.out.println("2. Saving Account");
				String UserInput1=scnr.next();
				if(UserInput1.equals("1")){
					System.out.println("Enter a deposit amount:");
					deposit=scnr.nextInt();
					check=check+deposit;
				}
				else if(UserInput1.equals("2")){
					System.out.println("Enter a deposit amount:");
					deposit=scnr.nextInt();
					sav=sav+deposit;
				}
			}
			else if(menuv.equals("4")){
				System.out.println("Enter a transfer amount no more than $200 from the following options:");
				System.out.println("1. Checking Account");
				System.out.println("2. Saving Account");
				String UserInput1=scnr.next();
				if(UserInput1.equals("1")){
					System.out.println("Enter a transfer amount:");
					transfer=scnr.nextInt();
					check=check-transfer;
					sav=sav+check;}
				else if(UserInput1.equals("2")){
					System.out.println("Enter a transfer amount:");
					transfer=scnr.nextInt();
					sav=sav-transfer;
					check=check+sav;}
			}
	

			}
		if(menuv.equals("5")){
			System.out.println("Thank you for using MinerBank");
		}
	}
}

