// Lab03vst.java
// The Speeding Ticket Program
// This the student starting file for Lab03.

public class Lab03vst
{
	public static void main(String[] args)
	{
      System.out.println("Suzie Snodgrass & Seymour Schmittlap");
		System.out.println("Lab03, Student Starting Version\n");
      System.out.println("Speeding Ticket Program");
      
      System.out.print("Enter posted speed limit ==> ");
      int speedLim = Keyboard.getInt();
      System.out.print("Enter actual driving speed ==> ");
      int drivingSpeed = Keyboard.getInt();
      int milesOver = drivingSpeed - speedLim;
      System.out.println("You drove " + milesOver + " miles over the speed limit");
      System.out.println("You will recieve a speeding ticket");
      double minTicket = 75.0;
      System.out.println("The minimum ticket is $" + minTicket);
      System.out.println();
      System.out.println("Ticket so far: " + minTicket);
      System.out.println();
      System.out.println("Any driving speed higher than 5 miles over the speed limit");
      System.out.println("adds $10.00 for each mile over the speed limit.");
      System.out.println();
      double newTicket = milesOver * 10 + minTicket;
      if (milesOver > speedLim + 5)
      System.out.println("Ticket so far: " + newTicket);
      System.out.println();
      System.out.println("Any driving in a school zone doubles the ticket amount.");
      System.out.print("Did speeding happen in a school zone ==> ");
      String inSchoolZone = Keyboard.getString(); 
      System.out.println();
      if (inSchoolZone.equals("Y")) { 
      newTicket = newTicket * 2;
         System.out.println("Ticket so far: " + newTicket); }
      else {
      System.out.println("Ticket so far: " + newTicket); }
      System.out.println();
      System.out.println("Any speeding in a work zone doubles the ticket amount.");
      System.out.print("Did speeding happen in a work zone ==> ");
      String inWorkZone = Keyboard.getString();
      System.out.println();
      if (inWorkZone.equals("Y")) {
      newTicket = newTicket * 2;
         System.out.println("Ticket so far: " + newTicket); }
      else {
      System.out.println("Ticket so far: " + newTicket); }
      System.out.println();
      System.out.println("Hitting a worker adds a $10000.0 to the ticket.");
      System.out.print("Was a worker hit in a work zone ==> ");
      String workerHit = Keyboard.getString();
      System.out.println();
      if (workerHit.equals("Y")) {
      newTicket = newTicket + 10000.0;
      System.out.println("Ticket so far: " + newTicket); }
      else {
      System.out.println("Ticket so far: " + newTicket); }
      System.out.println();
      System.out.println("Driving more than 80mph is considered reckless.");
      System.out.println("This adds $100.00 for every mile over 80 MPH.");
      System.out.println();
      int milesOver2 = drivingSpeed - 80;
      if (drivingSpeed > 80) {
      newTicket = newTicket + (milesOver2 * 100.0);
      System.out.println("Your total ticket is " + newTicket); }    
      else {
      System.out.println("Your total ticket is " + newTicket); }


      
      
 
}

}