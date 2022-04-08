import java.util.Scanner; 

public class FindYourPhoneLamia {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Lamia's 'Mystery Lost and Found' game."); 
		System.out.println("Here, you'll have options to choose that make the MOST SENSE to you to continue on the next level.");
		System.out.println("Don't worry about picking the wrong option, you will still make it to the end!"); 
		System.out.println("Both ways can lead you to finding your missing item!"); 
		System.out.println("Be sure to type your answers with the first letter in caps (e.g 'There' 'Left' 'Yes', etc.)"); 
		System.out.println("Good luck!"); 
		System.out.println(""); 
		System.out.println("You have a backpack on you and have randomly lost your phone and your trying to locate it.");
		System.out.println("You were last in an unknown park. You are now at an unknown mall."); 
		System.out.println("There are steps to complete inorder to find your phone."); 
		
		Scanner keyboard = new Scanner(System.in); 
		
		String ans1; 
		String ans2; 
		String ans3; 
		String ans4;  
		
		System.out.println("Begin? (Answer 'Yes' please)"); 
		ans1 = keyboard.nextLine(); 
		
		if (ans1.equals("Yes")) {
			System.out.println("Should we go to the 'Left' or 'Right'?");
			ans2 = keyboard.nextLine(); 
			
			if (ans2.equals("Left")) {
				System.out.println("Going to the 1ST DOOR...");
				System.out.println("");
				System.out.println ("Should we go to the 'Back' or 'Front'?");
				ans3 = keyboard.nextLine(); 
				
				if (ans3.equals("Back")) {
					System.out.println("Going to the back into a TRAIL..."); 
					System.out.println("");  
					System.out.println("Should we walk through the top left pathway? Say 'Yes'.");  
					ans4 = keyboard.nextLine(); 
					
					if (ans4.equals("Yes")){
						System.out.println("*Phone buzzes*"); 
						System.out.println("IT WAS IN YOUR BAG THE WHOLE TIME!"); 
					}
					
				}
				if (ans3.equals("Front"))	{
					System.out.println("Going to the front into a WALKWAY..."); 
					System.out.println(""); 
					System.out.println("Should we walk through the top right pathway? Say 'Yes'.");  
					ans4 = keyboard.nextLine(); 
					
					if (ans4.equals("Yes")){
						System.out.println("*Person comes up to you and asks if it's your phone in their hand."); 
						System.out.println("YOU FOUND YOUR PHONE!");  
						}
				}
					
			}
			else if (ans2.equals("Right")) {
				System.out.println("Going to the 2ND DOOR...");
				System.out.println(""); 
				System.out.println ("Should we go to a person for help? Say 'Yes'?");
				ans3 = keyboard.nextLine(); 
				
				if (ans3.equals("Yes")) {
					System.out.println("Person says TO GO TO THE LEFT"); 
					System.out.println(""); 
					System.out.println("Should we walk through the bottom left pathway? Say 'Yes'.");  
					ans4 = keyboard.nextLine(); 
					
					if (ans4.equals("Yes")){
						System.out.println("*Phone buzzes*"); 
						System.out.println("IT WAS IN YOUR BAG THE WHOLE TIME!"); 
				
					}
				}
			}
		}
		else
		{
			System.out.println("It's supposed to be 'Yes', dummy! I don't want to play with dummies >:(");
		}
	}
}