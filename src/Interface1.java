

import java.util.Scanner;

interface FlightAvailability
	{

		abstract void check();
	}  

class Airindia implements FlightAvailability 
	{   
		int seat=30;
		public void check()
		{
		   	       System.out.println("Welcome to Airasia");
		}
	}

	class Vistara
	{
		int seat=40;
		public void check()
		{
		System.out.println("Welcome to Vistara");
		}
	}

	class Indiga
	{ 
		int seat=50;
		public void check()
		{
		System.out.println("Welcome to Indigo");
		}
	}

	public class Interface1
	{
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			Airindia a= new Airindia();
			Vistara v = new Vistara();
			Indiga i=new Indiga();
			do
			{
			System.out.println();
			System.out.println("Enter your choice");
	        System.out.println("1.Airasia");
			System.out.println("2.VistaraEnter your choice");
			System.out.println("3.IndigoEnter your choice");
			System.out.println("4.Exit");
			System.out.println();
			int choice = sc.nextInt();
			switch(choice)
			{
				case 1:
					a.check();
				//int seat=30;
					System.out.println(a.seat + " seat Booking Available in Airasia");
				   System.out.println("Enter seats required");
					 int book = sc.nextInt();
					System.out.println(book + "Seats Booked Succesfully");
					a.seat=a.seat-book;
					System.out.println("Remaining Seats = " + (a.seat));
				    
					break;
					
			    case 2:
					v.check();
					
				    System.out.println("Enter seats required");
				    int book1 = sc.nextInt();
					System.out.println(book1 + "Seats Booked Succesfully");
					System.out.println("Remaining Seats = " + (v.seat - book1));
					
				    break;

				case 3:
					
					int seat2=20;
				    System.out.println("Enter seats required");
					int book2 = sc.nextInt();
					System.out.println(book2 + "Seats Booked Succesfully");
					System.out.println("Remaining Seats = " + (i.seat- book2));
					
				    break;

				case 4:
					return;
				   
				default:			
				    System.out.println("Invalid choice");
			}

			}
			while (true);
		}

	}




