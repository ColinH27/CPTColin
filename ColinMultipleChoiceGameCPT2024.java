import arc.*;
import java.awt.*;
import java.awt.image.*;

public class ColinMultipleChoiceGameCPT2024 {
    public static void main(String[] args) {
        Console con = new Console("Multiple Choice Game", 1280, 720);

        // Variables
        int intMCUScore = 0;
        int intStarWarsScore = 0;
        int intDCScore = 0;

        String strMenuChoice = "";  
        String strGameChoice = ""; 
        String strEndOfGame = "";  
        String strName = "";
        String strChoice = "";


// Images
		BufferedImage imgMMS = con.loadImage("MainMenuScreen.jpg");
		BufferedImage imgPS = con.loadImage("PlayScreen.jpg");
		
		//Tutorial Images
		BufferedImage imgT1 = con.loadImage("TutorialScreen1.jpg");
		BufferedImage imgT2 = con.loadImage("TutorialScreen2.jpg");
		BufferedImage imgT3 = con.loadImage("TutorialScreen3.jpg");
		
		// Game Screens
		BufferedImage imgMCU = con.loadImage("MCUGameScreen.jpg");
		BufferedImage imgDC = con.loadImage("DCGameScreen.jpg");
		BufferedImage imgSTR = con.loadImage("StarWarsGameScreen.jpg");



// Ask for player's name once
        con.println("Enter your name:");
        strName = con.readLine();
        con.println("Welcome " + strName + "!");
        con.sleep(1000);
        con.clear();

        while (true) {
            con.println("Enter MM to go to the main menu");
            strChoice = con.readLine();
            con.sleep(1000);
            con.clear();



            if (strChoice.equalsIgnoreCase("MM")) {
				// Main Menu Screen
				con.drawImage(imgMMS, 0, 0);
				con.println("Main Menu");
                con.println("Type 'P' to Play");
                con.println("Type 'S' to View Scores");
                con.println("Type 'H' for Help");
                con.println("Type 'B' to Go Back");
                strMenuChoice = con.readLine();
                con.sleep(1000);
                con.clear(); 

                // STA TITAN "CHEAT"
                if (strMenuChoice.equalsIgnoreCase("statitan")) {
                    con.println("It's your lucky day!!!!! :)");
                    con.println("Congrats!");
                    con.println("To thank you, 5 points have been added to total score!");
                }

                // "SECRET MENU"
                if (strMenuChoice.equalsIgnoreCase("sm")) {
                    // SECRET MENU IMAGE
                    con.sleep(3000);
                }

		// VIEW SCORE SCREEN
if (strMenuChoice.equalsIgnoreCase("s")) {
    con.clear(); 
    
    TextInputFile Scores = new TextInputFile("HighScores.txt");
    String[][] strScores = new String[1][3];
    
    for (int intRow = 0; intRow < 1; intRow++) {
        strScores[intRow][0] = Scores.readLine(); // Player's Name
        strScores[intRow][1] = Scores.readLine(); // Test/Game Player Chose
        strScores[intRow][2] = Scores.readLine(); // Their score
        
        con.println(strScores[intRow][0]); 
        con.println(strScores[intRow][1]);
        con.println(strScores[intRow][2]);
        
        con.sleep(5000);
        con.clear();
    }
    
    con.println("Press Enter to return to the Main Menu");
    con.readLine(); 
    con.clear();
	continue;
}


                // HELP SCREEN (TUTORIAL)
                if (strMenuChoice.equalsIgnoreCase("h")) {
				// Tutorial Image 1 
				con.clear();
				con.drawImage(imgT1, 0, 0);
                    con.sleep(2000);
                    con.clear();
               	// Tutorial Image 2 
				con.drawImage(imgT2, 0, 0);
                    con.sleep(3000);
                    con.clear();
                // Tutorial Image 3 
				con.drawImage(imgT3, 0, 0);
                    con.sleep(3000);
                    con.clear();
                }



	// PLAY
if (strMenuChoice.equalsIgnoreCase("p")) {
    con.clear();
    con.drawImage(imgPS, 0, 0); // Draw the "Play" image
    con.sleep(2000);           // Display it for 2 seconds
    con.clear();               // Clear the screen after showing the image

    // Prompt for game choice
    con.println("Type 'mcu' to play the MCU test!");
    con.println("Type 'sw' to play the Star Wars test!");
    con.println("Type 'dc' to play DC Test!");
    con.println("What game would you like to play?");
    strGameChoice = con.readLine();
    con.clear(); // Clear screen before starting the selected game
}

		// MARVEL TEST
	if (strGameChoice.equalsIgnoreCase("mcu")) {
		con.clear(); // Clear the screen before the game starts
		TextInputFile MCU = new TextInputFile("MCU.txt");
		String[][] strMCU = new String[10][6];

		// LOADING MARVEL
		con.println("Loading");
		con.sleep(1000);
		con.print(".");
		con.sleep(1000);
		con.print("...");
		con.sleep(1000);
		con.println(".");
		con.sleep(1000);
		con.clear();

		// MARVEL IMAGE
		con.drawImage(imgMCU, 0, 0); // Display the Marvel image at (0,0)
		con.sleep(2000);             // Show the image for 2 seconds
		con.clear();                 // Clear screen before starting questions

		for (int intRow = 0; intRow < 10; intRow++) {
			// Load and display the question
			strMCU[intRow][0] = MCU.readLine(); // Question
			strMCU[intRow][1] = MCU.readLine(); // Option A
			strMCU[intRow][2] = MCU.readLine(); // Option B
			strMCU[intRow][3] = MCU.readLine(); // Option C
			strMCU[intRow][4] = MCU.readLine(); // Option D
			strMCU[intRow][5] = MCU.readLine(); // Correct Answer

			con.println(strMCU[intRow][0]); // Question
			con.println(strMCU[intRow][1]); // Option A
			con.println(strMCU[intRow][2]); // Option B
			con.println(strMCU[intRow][3]); // Option C
			con.println(strMCU[intRow][4]); // Option D

			// Get user answer
			con.print("Enter your answer: ");
			strChoice = con.readLine();
			String correctAnswer = strMCU[intRow][5];

			// Check the answer
			if (strChoice.equalsIgnoreCase(correctAnswer.substring(correctAnswer.length() - 1))) {
				con.println("Correct!");
				intMCUScore++;
			} else {
				con.println("Incorrect. The correct answer is " + correctAnswer + ".");
			}

			con.sleep(3000);
			con.clear(); // Clear screen after each question
		}

		// Display final score
		con.println("Your Final Score: " + intMCUScore + "!");
		con.println("What would you like to do now?");
		con.println("Type 'MM' to go back to the Menu");
		strEndOfGame = con.readLine();
		con.clear(); // Clear screen before returning to the menu
	}



// STAR WARS TEST
if (strGameChoice.equalsIgnoreCase("sw")) {
    TextInputFile StarWars = new TextInputFile("StarWars.txt");
    String[][] strStarWars = new String[10][6];

    // LOADING STAR WARS
    con.clear(); // Clear the screen before loading message
    con.println("Loading");
    con.sleep(1000);
    con.print(".");
    con.sleep(1000);
    con.print(".");
    con.sleep(1000);
    con.println(".");
    con.sleep(1000);
    con.clear(); // Clear again after loading message

    // Draw Star Wars Image to Cover Play Image (imgPS)
    con.drawImage(imgSTR, 300, 100); // Draw Star Wars image at (300, 100)
    con.sleep(2000); // Display for 2 seconds
    con.clear(); // Clear before starting the questions

    // STAR WARS QUESTIONS
    for (int intRow = 0; intRow < 10; intRow++) {
        strStarWars[intRow][0] = StarWars.readLine(); // Question
        strStarWars[intRow][1] = StarWars.readLine(); // Option A
        strStarWars[intRow][2] = StarWars.readLine(); // Option B
        strStarWars[intRow][3] = StarWars.readLine(); // Option C
        strStarWars[intRow][4] = StarWars.readLine(); // Option D
        strStarWars[intRow][5] = StarWars.readLine(); // Correct Answer

        con.println(strStarWars[intRow][0]); // Question
        con.println(strStarWars[intRow][1]); // Option A
        con.println(strStarWars[intRow][2]); // Option B
        con.println(strStarWars[intRow][3]); // Option C
        con.println(strStarWars[intRow][4]); // Option D

        con.print("Enter your answer: ");
        strChoice = con.readLine();
        String correctAnswer = strStarWars[intRow][5]; // Correct Answer

        if (strChoice.equalsIgnoreCase(correctAnswer.substring(correctAnswer.length() - 1))) {
            con.println("Correct!");
            intStarWarsScore++;
        } else {
            con.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        con.sleep(3000);
        con.clear(); // Clear screen for the next question
    }

    // Save score to high score file
    TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt");
    HighScoresFile.println(strName);
    HighScoresFile.println("Star Wars TEST");
    HighScoresFile.println("Score: " + intStarWarsScore + "/10");

    // Final Score Screen
    con.println("Your Final Score: " + intStarWarsScore + "!");
    con.println("What would you like to do now?");
    con.println("Type 'MM' to go back to the Menu");
    strEndOfGame = con.readLine();
    con.clear(); // Clear before returning to the menu
}

// DC TEST
if (strGameChoice.equalsIgnoreCase("dc")) {
    TextInputFile DC = new TextInputFile("DC.txt");
    String[][] strDC = new String[10][6];

    // LOADING DC
    con.clear(); // Clear the screen before loading message
    con.println("Loading");
    con.sleep(1000);
    con.print(".");
    con.sleep(1000);
    con.print(".");
    con.sleep(1000);
    con.println(".");
    con.sleep(1000);
    con.clear(); // Clear again after loading message

    // Draw DC Image to Cover Play Image (imgPS)
    con.drawImage(imgDC, 300, 100); // Draw DC image at (300, 100)
    con.sleep(2000); // Display for 2 seconds
    con.clear(); // Clear before starting the questions

    // DC QUESTIONS
    for (int intRow = 0; intRow < 10; intRow++) {
        strDC[intRow][0] = DC.readLine(); // Question
        strDC[intRow][1] = DC.readLine(); // Option A
        strDC[intRow][2] = DC.readLine(); // Option B
        strDC[intRow][3] = DC.readLine(); // Option C
        strDC[intRow][4] = DC.readLine(); // Option D
        strDC[intRow][5] = DC.readLine(); // Correct Answer

        con.println(strDC[intRow][0]); // Question
        con.println(strDC[intRow][1]); // Option A
        con.println(strDC[intRow][2]); // Option B
        con.println(strDC[intRow][3]); // Option C
        con.println(strDC[intRow][4]); // Option D

        con.print("Enter your answer: ");
        strChoice = con.readLine();
        String correctAnswer = strDC[intRow][5]; // Correct Answer

        if (strChoice.equalsIgnoreCase(correctAnswer.substring(correctAnswer.length() - 1))) {
            con.println("Correct!");
            intDCScore++;
        } else {
            con.println("Incorrect. The correct answer is " + correctAnswer + ".");
        }

        con.sleep(3000);
        con.clear(); // Clear screen for the next question
    }

    // Save score to high score file
    TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt");
    HighScoresFile.println(strName);
    HighScoresFile.println("DC TEST");
    HighScoresFile.println("Score: " + intDCScore + "/10");

    // Final Score Screen
    con.println("Your Final Score: " + intDCScore + "!");
    con.println("What would you like to do now?");
    con.println("Type 'MM' to go back to the Menu");
    strEndOfGame = con.readLine();
    con.clear(); // Clear before returning to the menu
	

                   
                }
            }
        }
    }
}
		
	

