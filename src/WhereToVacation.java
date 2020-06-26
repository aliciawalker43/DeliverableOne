import java.util.Scanner;

    

  public class WhereToVacation {

	
	public static void main(String[] args) {
		
	  //Add for user input
	  Scanner scnr = new Scanner(System.in);
	 
	  // What type of vacation question
	  System.out.println (" What type of vaction are you interested in musical, tropical or adventurous?");
					
	 //What type of vacation user input
	 String vacation =scnr.next();
	 
			 				
	 //How many travelers
	 System.out.println(" How many companions are travling with you?");
					
	 //User inputs  for group amount
	 int groupSize = scnr.nextInt();
	 
	
	 
	 
	 //what vacation type and group # yields travel result
	 if ((vacation.equalsIgnoreCase("musical")) && (groupSize<= 2)) { 
		 System.out.println("If you like " + vacation + " style vacations visit New Orleans. "
		 		+ "If you have " + groupSize + " companion(s), travel first class.");
		 
	 } else if ((vacation.equalsIgnoreCase("musical")) && (groupSize<= 5)) {
		 System.out.println ("If you like " + vacation + " style vacations visit New Orleans. "
		 		+ "If you have " + groupSize + " companion(s), travel by helicoptor."); 
		 
	 } else if ((vacation.equalsIgnoreCase("musical")) && (groupSize>= 6)) { 
		 System.out.println("If you like " + vacation + " style vacations visit New Orleans. "
		 		+ "If you have " + groupSize + " companion(s), travel by charter flight.");
		 
	 } else if ((vacation.equalsIgnoreCase("adventurous")) && (groupSize<= 2)) {
		 System.out.println ("If you like " + vacation + " style vacations. "
		 		+ "Go whitwater rafting in the Grand Canyon. If you have " + groupSize + " companion(s), travel first class.");  
		 
	 } else if ((vacation.equalsIgnoreCase ("adventurous")) && (groupSize<= 5)) { 
		 System.out.println("If you like " + vacation + " style vacations. "
		 		+ "Go whitwater rafting in the Grand Canyon. If you have " + groupSize + " companion(s), travel by by helicoptor.");
		 
	 } else if ((vacation.equalsIgnoreCase("adventurous")) && (groupSize>= 6)) {
		 System.out.println ("If you like " + vacation + " style vacations. "
		 		+ "Go whitwater rafting in the Grand Canyon. If you have " + groupSize + " companion(s), travel by charter flight.");  
		 
	 } else if ((vacation.equalsIgnoreCase ("tropical")) && (groupSize<= 2)) {
		 System.out.println ("If you like " + vacation + " style vacations. "
		 		+ "Take a beach vacation to Mexico. If you have " + groupSize + " companion(s), travel first class."); 
		 
	 } else if ((vacation.equalsIgnoreCase ( "tropical")) && (groupSize<= 5)) { 
		 System.out.println("If you like " + vacation + " style vacations. "
		 		+ "Take a beach vacation to Mexico. If you have " + groupSize + " companion(s), travel by by helicoptor.");
		 
	 } else if ((vacation.equalsIgnoreCase ("tropical")) && (groupSize>=6 )) {
		 System.out.println ("If you like " + vacation + " style vacations. "
		 		+ "Take a beach vacation to Mexico. If you have " + groupSize + " companion(s), travel by charter flight."); 
		 
	 } 
	 }
					
     //What type of transportation in conjunction with traveler amount
					
	 //Results: IF type of vacation, and amount of travelers, then transport option
		
	}
  


