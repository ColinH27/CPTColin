import arc.*;
import java.awt.*;
import java.awt.image.*;

public class ColinMultipleChoiceGameCPT {
    public static void main(String[] args) {
        Console con = new Console();
	// SCORING
	// INITIALIZE SCORE TO 0 FOR ALL 3 GAMES
	        int intMCUScore = 0;
			int intStarWarsScore = 0;


	// MAIN MENU
	con.println("What would you like to do?");
	String strGameChoice = con.readLine();

// VIEW SCORE SCREEN
	if (strGameChoice.equalsIgnoreCase("Score")) {
	con.println("Which game would you like to view your score for?");
	String strScore = con.readLine();
		if (strScore.equalsIgnoreCase("Marvel")) {
			con.println(intMCUScore);
		}else if (strScore.equalsIgnoreCase("Star Wars")){
			con.println(intStarWarsScore);

		}
	}
// HELP SCREEN
		
// QUIT GAME
	
// PLAY 	
			
	// MARVEL TEST
	if (strGameChoice.equalsIgnoreCase("Marvel")) {
                 
        
        TextInputFile MCU = new TextInputFile("MCU.txt");
        String[][] strMCU = new String[10][6];

        for (int intRow = 0; intRow < 10; intRow++) {
            strMCU[intRow][0] = MCU.readLine(); // Question
            strMCU[intRow][1] = MCU.readLine(); // Option A
            strMCU[intRow][2] = MCU.readLine(); // Option B
            strMCU[intRow][3] = MCU.readLine(); // Option C
            strMCU[intRow][4] = MCU.readLine(); // Option D
            strMCU[intRow][5] = MCU.readLine(); // Correct Answer

            con.println("Question " + (intRow + 1) + ":");
            con.println(strMCU[intRow][0]);
            con.println(strMCU[intRow][1]);
            con.println(strMCU[intRow][2]);
            con.println(strMCU[intRow][3]);
            con.println(strMCU[intRow][4]);
			
            con.print("Enter your answer: ");
            String strChoice = con.readLine();
            String correctAnswer = strMCU[intRow][5].substring(strMCU[intRow][5].length() - 1);

            if (strChoice.equalsIgnoreCase(correctAnswer)) {
                con.println("Correct!");
                intMCUScore = intMCUScore + 1;
            } else {
                con.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
        }
		
        con.println("Thanks for playing!");
        con.println("What would you like to do now?");
        con.println("Type 'Quit' to quit or 'MM' to go back to the Menu");
        String strEndOfMCU = con.readLine();
        if (strGameChoice.equalsIgnoreCase("MM")) {
			
		}

        
        
	}
 
        // STAR WARS TEST
    if (strGameChoice.equalsIgnoreCase("Star Wars")) {
        
        TextInputFile StarWars = new TextInputFile("StarWars.txt");
        String[][] strStarWars = new String[10][6];

        for (int intRow = 0; intRow < 10; intRow++) {
            strStarWars[intRow][0] = StarWars.readLine();
            strStarWars[intRow][1] = StarWars.readLine();
            strStarWars[intRow][2] = StarWars.readLine();
            strStarWars[intRow][3] = StarWars.readLine();
            strStarWars[intRow][4] = StarWars.readLine();
            strStarWars[intRow][5] = StarWars.readLine();

            con.println("Question " + (intRow + 1) + ":");
            con.println(strStarWars[intRow][0]);
            con.println(strStarWars[intRow][1]);
            con.println(strStarWars[intRow][2]);
            con.println(strStarWars[intRow][3]);
            con.println(strStarWars[intRow][4]);

            con.print("Enter your answer: ");
            String strChoice = con.readLine();
            String correctAnswer = strStarWars[intRow][5].substring(strStarWars[intRow][5].length() - 1);

            if (strChoice.equalsIgnoreCase(correctAnswer)) {
                con.println("Correct!");
                intStarWarsScore = intStarWarsScore + 1;
            } else {
                con.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
        }

	}
	
	
        // GUESS THE COUNTRY BY THE FLAG
        TextInputFile Countries = new TextInputFile("Countries.txt");
        String[][] strCountries = new String[10][7];
        int intCountriesScore = 0;

        for (int intRow = 0; intRow < 10; intRow++) {
            strCountries[intRow][0] = Countries.readLine();
            strCountries[intRow][1] = Countries.readLine();
            strCountries[intRow][2] = Countries.readLine();
            strCountries[intRow][3] = Countries.readLine();
            strCountries[intRow][4] = Countries.readLine();
            strCountries[intRow][5] = Countries.readLine();
            strCountries[intRow][6] = Countries.readLine();

            con.println("Question " + (intRow + 1) + ":");
            con.println(strCountries[intRow][0]);
            con.println(strCountries[intRow][1]);
            con.println(strCountries[intRow][2]);
            con.println(strCountries[intRow][3]);
            con.println(strCountries[intRow][4]);
            con.println(strCountries[intRow][5]);

            con.print("Enter your answer: ");
            String strChoice = con.readLine();
            String correctAnswer = strCountries[intRow][6].substring(strCountries[intRow][6].length() - 1);

            if (strChoice.equalsIgnoreCase(correctAnswer)) {
                con.println("Correct!");
                intCountriesScore++;
            } else {
                con.println("Incorrect. The correct answer is " + correctAnswer + ".");
            }
        }
    }
}


