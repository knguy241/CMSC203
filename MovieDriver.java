package movie;
import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);
	String loop;
	do {
	Movie movie = new Movie();
	System.out.print("What is the title of your movie? ");
	String title = keyboard.nextLine();
	System.out.print("What is the rating for your movie? ");
	String rating = keyboard.nextLine();
	System.out.print("Enter the number of tickets for this movie: ");
	int tickets = keyboard.nextInt();
	keyboard.nextLine();
	System.out.print("Continue entering movies? Y/N ");
	loop = keyboard.nextLine();
	movie.toString();
	}
		while(loop.equalsIgnoreCase("Y"));
	}

	

}
