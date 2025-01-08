import arc.*;
import java.awt.*;
import java.awt.image.*;

public class ColinMultipleChoiceGameCPT {
    public static void main(String[] args) {
        Console con = new Console();
        
        // SCORING
        // SET SCORE TO 0 FOR ALL 3 GAMES
        int intMCUScore = 0;
        int intStarWarsScore = 0;
        int intCountriesScore = 0;
        int intTotalScore = 0;
        int intAverageScore = 0;

        // MAIN MENU
        String strMenuChoice = "";  
        String strGameChoice = ""; 
        String strEnd = "";  
		String strName = "";

		while (true) {
	// 	ASK PLAYER FOR THEIR NAME
		con.println("Enter your name");
		strName = con.readLine();
	
	
        con.println("What would you like to do?");
        strMenuChoice = con.readLine();

        // STA TITAN "CHEAT"
    if (strMenuChoice.equalsIgnoreCase("statitan")) {
       con.println("It's your lucky day!!!!! :)");
       con.println("Congrats!");
       con.println("To thank you 5 points have been added to total score!");
       intTotalScore = 5 + intTotalScore;
        }

        // VIEW SCORE SCREEN
	if (strMenuChoice.equalsIgnoreCase("s")) {
        con.println("Type 'mcu' to view marvel test score!");
        con.println("Type 'sw' to view star wars test score!");
        con.println("Type 'c' to view guess the country test score!");
        con.println("Type 'ts' to view total score for all 3 games!");
        con.println("Type 'avg' to view score average for all 3 games!");

            con.println("Which score would you like to view?");
            String strScore = con.readLine();

            if (strScore.equalsIgnoreCase("mcu")) {
                con.println("Score: " + intMCUScore);
            } else if (strScore.equalsIgnoreCase("sw")) {
                con.println("Score: " + intStarWarsScore);
            } else if (strScore.equalsIgnoreCase("c")) {
                con.println("Score: " + intCountriesScore);
            } else if (strScore.equalsIgnoreCase("ts")) {
                intTotalScore = intMCUScore + intStarWarsScore + intCountriesScore;
                con.println("Score: " + intTotalScore);
            } else if (strScore.equalsIgnoreCase("avg")) {
                intAverageScore = intTotalScore / 3;
                con.println("Score: " + intAverageScore);
            }
        }

        // HELP SCREEN (TUTORIAL)
        if (strMenuChoice.equalsIgnoreCase("h")) {
            // Insert images of help
        }

        // QUIT GAME
        if (strMenuChoice.equalsIgnoreCase("q")) {
            // CLOSE FILE
        }

        // PLAY
        if (strMenuChoice.equalsIgnoreCase("p")) {
            con.println("Type 'mcu' to play the MCU test!");
            con.println("Type 'sw' to play the Star Wars test!");
            con.println("Type 'c' to play guess the country!");
            con.println("What game would you like to play?");
            strGameChoice = con.readLine();
        }

        // MARVEL TEST
        if (strGameChoice.equalsIgnoreCase("mcu")) {
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

       // Thank you for playing Screen
       con.println("What would you like to do now?");
       con.println("Type 'Quit' to quit or 'MM' to go back to the Menu");
       strEnd = con.readLine();
        }

        // STAR WARS TEST
        if (strGameChoice.equalsIgnoreCase("sw")) {
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
        if (strGameChoice.equalsIgnoreCase("c")) {
            TextInputFile Countries = new TextInputFile("Countries.txt");
            String[][] strCountries = new String[10][7];

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
            intCountriesScore = intCountriesScore + 1;
      } else {
 con.println("Incorrect. The correct answer is " + correctAnswer + ".");
					}
				}
			}
		}
	}

}
