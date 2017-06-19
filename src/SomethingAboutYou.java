import java.util.Scanner;

public class SomethingAboutYou { 
	public static void main( String[] args ) { 
		Scanner sc = new Scanner(System.in);
	    String firstName;
	    int age;
	    String height;
	    double gpa;
	
	    System.out.println( "What is your first name? " );
	    firstName = sc.next();
	
	    System.out.println( "How old are you? " );
	    age = sc.nextInt();
	    
	
	    System.out.print( "How tall are you? " );
	    height = sc.next();
	
	    System.out.println( "What is your GPA? " );
	    gpa = sc.nextDouble();
	    System.out.println("First name: " + firstName);
	    System.out.println("Age is: " + age);
	    System.out.println("Height is: " + height);
	    System.out.printf("GPA is: %.2f %n",gpa);

    }
}