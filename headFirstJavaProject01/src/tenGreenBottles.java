//Print the lyrics of to the song 10 Green Bottles.
public class tenGreenBottles {
	public static void main(String[] args) {
	
		//Declare variables
		int tenGreenBottles = 10; //Numbers of bottles.
		String greenBottles = tenGreenBottles + " green Bottles hanging on the wall";
		
		//Chorus of the song.
		while(tenGreenBottles > 1) { 
			System.out.println(greenBottles);
			System.out.println(greenBottles);
			System.out.println("And if one green bottle should accidentally fall");
			tenGreenBottles = tenGreenBottles - 1;
			greenBottles = tenGreenBottles + " green Bottles hanging on the wall";
			System.out.println(greenBottles);
		
			System.out.println();

		} // End of while loop
		//End of the song
		if (tenGreenBottles == 1) {
			System.out.println(greenBottles);
			System.out.println(greenBottles);
			System.out.println("And if one green bottle should accidentally fall");
			tenGreenBottles = tenGreenBottles - 1;
			greenBottles = tenGreenBottles + " green Bottles hanging on the wall";
			System.out.println("There’ll be no green bottles hanging on the wall");
			
		} //End of if.
		
	}

}
