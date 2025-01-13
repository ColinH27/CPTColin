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
                con.clear();
				con.drawImage(imgMMS, 1280, 720);
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
    // VIEW SCORE SCREEN
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
                    // Image 1
                    con.sleep(5000);
                    con.clear();
                    // Image 2
                    con.sleep(5000);
                    con.clear();
                }



                // PLAY
                if (strMenuChoice.equalsIgnoreCase("p")) {
                    con.println("Type 'mcu' to play the MCU test!");
                    con.println("Type 'sw' to play the Star Wars test!");
                    con.println("Type 'dc' to play DC Test!");
                    con.println("What game would you like to play?");
                    strGameChoice = con.readLine();
                }

                // MARVEL TEST
                if (strGameChoice.equalsIgnoreCase("mcu")) {
                    TextInputFile MCU = new TextInputFile("MCU.txt");
                    String[][] strMCU = new String[10][6];

                    // LOADING MARVEL
                    con.clear();
                    con.println("Loading...");
                    con.sleep(1000);
                    con.print(".");
                    con.sleep(1000);
                    con.print("...");
                    con.sleep(1000);
                    con.println(".");
                    con.sleep(1000);
                    con.clear();

                    // MARVEL IMAGE
                    for (int intRow = 0; intRow < 10; intRow++) {
                        strMCU[intRow][0] = MCU.readLine(); // Question
                        strMCU[intRow][1] = MCU.readLine(); // Option A
                        strMCU[intRow][2] = MCU.readLine(); // Option B
                        strMCU[intRow][3] = MCU.readLine(); // Option C
                        strMCU[intRow][4] = MCU.readLine(); // Option D
                        strMCU[intRow][5] = MCU.readLine(); // Correct Answer

                        // PRINTS QUESTION AND OPTIONS 
                        con.println(strMCU[intRow][0]);  // Question
                        con.println(strMCU[intRow][1]);  // Option A
                        con.println(strMCU[intRow][2]);  // Option B
                        con.println(strMCU[intRow][3]);  // Option C
                        con.println(strMCU[intRow][4]);  // Option D

                        con.print("Enter your answer: ");
                        strChoice = con.readLine();
                        String correctAnswer = strMCU[intRow][5]; // Correct answer from file

                        // CHECKS IF ANSWER IS CORRECT OR NOT
                        if (strChoice.equalsIgnoreCase(strMCU[intRow][5].substring(strMCU[intRow][5].length() - 1))) {
                            con.println("Correct!");
                            intMCUScore = intMCUScore + 1; 
                        } else {
                            con.println("Incorrect. The correct answer is " + correctAnswer + ".");
                        }

                        // Clears and moves onto next question
                        con.sleep(3000);
                        con.clear();


                    }
                    
                     // Save score to high score file
                     TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt");
                     con.println(strName);
                     con.println("MCU TEST");
                     con.println("Score: " + intMCUScore + "/10");

                    // Final Score Screen & Thank You Screen
                    con.println("Your Final Score: " + intMCUScore + "!");
                    con.println("What would you like to do now?");
                    con.println("Type 'MM' to go back to the Menu");
                    strEndOfGame = con.readLine();
                    con.clear();
                }

                // STAR WARS TEST
                if (strGameChoice.equalsIgnoreCase("sw")) {
                    TextInputFile StarWars = new TextInputFile("StarWars.txt");
                    String[][] strStarWars = new String[10][6];

                    // LOADING STAR WARS
                    con.clear();
                    con.println("Loading...");
                    con.sleep(1000);
                    con.print(".");
                    con.sleep(1000);
                    con.print("...");
                    con.sleep(1000);
                    con.println(".");
                    con.sleep(1000);
                    con.clear();

                    // STAR WARS IMAGE
                    for (int intRow = 0; intRow < 10; intRow++) {
                        strStarWars[intRow][0] = StarWars.readLine(); // Question
                        strStarWars[intRow][1] = StarWars.readLine(); // Option A
                        strStarWars[intRow][2] = StarWars.readLine(); // Option B
                        strStarWars[intRow][3] = StarWars.readLine(); // Option C
                        strStarWars[intRow][4] = StarWars.readLine(); // Option D
                        strStarWars[intRow][5] = StarWars.readLine(); // Correct Answer

                        // PRINTS QUESTION AND OPTIONS without A), B), C), D)
                        con.println(strStarWars[intRow][0]);  // Question
                        con.println(strStarWars[intRow][1]);  // Option A
                        con.println(strStarWars[intRow][2]);  // Option B
                        con.println(strStarWars[intRow][3]);  // Option C
                        con.println(strStarWars[intRow][4]);  // Option D

                        // PLAYER ENTERS ANSWER on same line as the prompt
                        con.print("Enter your answer: ");
                        strChoice = con.readLine();
                        String correctAnswer = strStarWars[intRow][5]; // Correct answer from file

                        // CHECKS IF ANSWER IS CORRECT OR NOT
                        if (strChoice.equalsIgnoreCase(strStarWars[intRow][5].substring(strStarWars[intRow][5].length() - 1))) {
                            con.println("Correct!");
                            intStarWarsScore = intStarWarsScore + 1; 
                        } else {
                            con.println("Incorrect. The correct answer is " + correctAnswer + ".");
                        }

                        // Clears and moves onto next question
                        con.sleep(3000);
                        con.clear();


                    }

					// Save score to high score file
                      TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt");
                      con.println(strName);
                      con.println("Star Wars TEST");
                      con.println("Score: " + intStarWarsScore + "/10");
                        
                    // Final Score Screen & Thank You Screen
                    con.println("Your Final Score: " + intStarWarsScore + "!");
                    con.println("What would you like to do now?");
                    con.println("Type 'MM' to go back to the Menu");
                    strEndOfGame = con.readLine();   
                    con.clear();
                }

                // DC TEST
                if (strGameChoice.equalsIgnoreCase("dc")) {
                    TextInputFile DC = new TextInputFile("DC.txt");
                    String[][] strDC = new String[10][6];

                    // LOADING DC
                    con.clear();
                    con.println("Loading...");
                    con.sleep(1000);
                    con.print(".");
                    con.sleep(1000);
                    con.print("...");
                    con.sleep(1000);
                    con.println(".");
                    con.sleep(1000);
                    con.clear();

                    // DC IMAGE
                    for (int intRow = 0; intRow < 10; intRow++) {
                        strDC[intRow][0] = DC.readLine(); // Question
                        strDC[intRow][1] = DC.readLine(); // Option A
                        strDC[intRow][2] = DC.readLine(); // Option B
                        strDC[intRow][3] = DC.readLine(); // Option C
                        strDC[intRow][4] = DC.readLine(); // Option D
                        strDC[intRow][5] = DC.readLine(); // Correct Answer

                        // PRINTS QUESTION AND OPTIONS without A), B), C), D)
                        con.println(strDC[intRow][0]);  // Question
                        con.println(strDC[intRow][1]);  // Option A
                        con.println(strDC[intRow][2]);  // Option B
                        con.println(strDC[intRow][3]);  // Option C
                        con.println(strDC[intRow][4]);  // Option D

                        // PLAYER ENTERS ANSWER on same line as the prompt
                        con.print("Enter your answer: ");
                        strChoice = con.readLine();
                        String correctAnswer = strDC[intRow][5]; // Correct answer from file

                        // CHECKS IF ANSWER IS CORRECT OR NOT
                        if (strChoice.equalsIgnoreCase(strDC[intRow][5].substring(strDC[intRow][5].length() - 1))) {
                            con.println("Correct!");
                            intDCScore = intDCScore + 1; // Updated scoring
                        } else {
                            con.println("Incorrect. The correct answer is " + correctAnswer + ".");
                        }

                        // Clears and moves onto next question
                        con.sleep(3000);
                        con.clear();


                    }
				
					 // Save score to high score file
                      TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt");
                      con.println(strName);
                      con.println("DC TEST");
                      con.println("Score: " + intDCScore + "/10");
				
                    // Final Score Screen & Thank You Screen
                    con.println("Your Final Score: " + intDCScore + "!");
                    con.println("What would you like to do now?");
                    con.println("Type 'MM' to go back to the Menu");
                    strEndOfGame = con.readLine();
                    con.clear();
                }
            }
        }
    }
}


		
	

