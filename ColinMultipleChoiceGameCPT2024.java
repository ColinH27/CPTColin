import arc.*;
import java.awt.*;
import java.awt.image.*;

public class ColinMultipleChoiceGameCPT2024 {
    public static void main(String[] args) {
        Console con = new Console("Multiple Choice Game", 1280, 720);

        // Variables
        // SCORING VARIABLES
        int intMarvelScore = 0;
        int intStarWarsScore = 0;
        int intDCScore = 0;
        
        // CHOICE VARIABLES
        String strMenuChoice = "";
        String strGameChoice = "";
        String strEndOfGame = "";
        String strName = "";
        String strChoice = "";

        // IMAGES
        // Main Menu Images
        BufferedImage imgMMS = con.loadImage("MainMenuScreen.jpg");
        BufferedImage imgPS = con.loadImage("PlayScreen.jpg");
        
        // Tutorials / HELP Images
        BufferedImage imgT1 = con.loadImage("TutorialScreen1.jpg");
        BufferedImage imgT2 = con.loadImage("TutorialScreen2.jpg");
        BufferedImage imgT3 = con.loadImage("TutorialScreen3.jpg");
        
        // Game Images
        BufferedImage imgMCU = con.loadImage("MCUGameScreen.jpg");
        BufferedImage imgDC = con.loadImage("DCGameScreen.jpg");
        BufferedImage imgSTR = con.loadImage("StarWarsGameScreen.jpg");
        
        // SECRET MENU IMAGE
        

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


		// MAIN MENU SCREEN
            if (strChoice.equalsIgnoreCase("MM")) {
                // Main Menu Image
                con.drawImage(imgMMS, 0, 0);
                con.println("Main Menu");
                con.println("Type 'P' to Play");
                con.println("Type 'S' to View Scores");
                con.println("Type 'H' for Help");
                con.println("Type 'B' to Go Back");
                strMenuChoice = con.readLine();
                con.sleep(1000);
                con.clear();

				// STA TITAN
			if (strMenuChoice.equalsIgnoreCase("statitan")) {
			con.clear();
			con.println("Congrats! It's your lucky day!!! ");
			con.println("To thank you 5 points will be added to the");
			con.println("score of the next game that you play!");
			if (strGameChoice.equalsIgnoreCase("dc")) {
					intDCScore = intDCScore + 5;
				}		
					
			if (strGameChoice.equalsIgnoreCase("sw")) {
					intStarWarsScore = intStarWarsScore + 5;
				}
				
			if (strGameChoice.equalsIgnoreCase("mcu")) {
					intMarvelScore = intMarvelScore + 5;
				}
				
			
			}
				// SECRET MENU
			if (strMenuChoice.equalsIgnoreCase("sm")) {
				con.println("Congrats you found the secret menu!");
				con.sleep(2000);
				con.clear();
				
				// Secert Menu Image
				
				
		
			}
					
                // SCORE SCREEN
                if (strMenuChoice.equalsIgnoreCase("s")) {
                    TextInputFile Scores = new TextInputFile("HighScores.txt");
                    while (!Scores.eof()) {
                        con.println(Scores.readLine()); // Player's Name
                        con.println(Scores.readLine()); // Test That Player Chose
                        con.println(Scores.readLine()); // Score
                        
                    }
                    con.println("Press Enter to return to the Main Menu");
                    con.readLine();
                    con.clear();
                } else if (strMenuChoice.equalsIgnoreCase("h")) {
					//HELP SCREEN
                    con.clear();
                    con.drawImage(imgT1, 0, 0);
                    con.sleep(2000);
                    con.clear();
                    con.drawImage(imgT2, 0, 0);
                    con.sleep(3000);
                    con.clear();
                    con.drawImage(imgT3, 0, 0);
                    con.sleep(3000);
                    con.clear();
                } else if (strMenuChoice.equalsIgnoreCase("p")) {
                    // PLAY SCREEN
                    con.clear();
                    con.drawImage(imgPS, 0, 0);
                    con.sleep(2000);
                    con.clear();
                    con.println("Type 'mcu' to play the MCU test!");
                    con.println("Type 'sw' to play the Star Wars test!");
                    con.println("Type 'dc' to play the DC Test!");
                    con.println("What game would you like to play?");
                    strGameChoice = con.readLine();
                    con.clear();

// MCU GAME
                    if (strGameChoice.equalsIgnoreCase("mcu")) {
                        TextInputFile MCU = new TextInputFile("MCU.txt");
                        String[][] strMCU = new String[10][6];
                        con.println("Loading");
                        con.sleep(1000);
                        con.print(".");
                        con.sleep(1000);
                        con.print("...");
                        con.sleep(1000);
                        con.clear();
                        con.drawImage(imgMCU, 0, 0);
                        con.sleep(2000);
                        con.clear();

                        for (int intRow = 0; intRow < 10; intRow++) {
                            strMCU[intRow][0] = MCU.readLine();
                            strMCU[intRow][1] = MCU.readLine();
                            strMCU[intRow][2] = MCU.readLine();
                            strMCU[intRow][3] = MCU.readLine();
                            strMCU[intRow][4] = MCU.readLine();
                            strMCU[intRow][5] = MCU.readLine();

							// PRINTS QUESTION & OPTIONS
                            con.println(strMCU[intRow][0]); // QUESTION
                            con.println(strMCU[intRow][1]); // OPTION A
                            con.println(strMCU[intRow][2]); // OPTION B
                            con.println(strMCU[intRow][3]); // OPTION C
                            con.println(strMCU[intRow][4]); // OPTION D

							// PLAYER SUBMITS ANSWER
                            con.print("Enter your answer: ");
                            strChoice = con.readLine();
                           
                           // CHECKS IF ANSWER IS CORRECT OR NOT
                            if (strChoice.equalsIgnoreCase(strMCU[intRow][5].substring(strMCU[intRow][5].length() - 1))) {
                                con.println("Correct!");
                                // ADDS POINT IF CORRECT
                                intMarvelScore = intMarvelScore + 1;
                            } else {
                                con.println("Incorrect. The correct answer is " + strMCU[intRow][5] + ".");
                            }
                            con.sleep(3000);
                            con.clear();
                        }
						// PUTS FINAL SCORE INTO THE HIGHSCORE.TXT FILE
                        TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt", true);
                        HighScoresFile.println(strName);
                        HighScoresFile.println("MCU TEST");
                        HighScoresFile.println(intMarvelScore + "/10");
                        con.println("Your Final Score: " + intMarvelScore + "!");
                        con.println("Type 'MM' to go back to the Menu");
                        strEndOfGame = con.readLine();
                        con.clear();
                    
				
				
// DC GAME
                    } else if (strGameChoice.equalsIgnoreCase("dc")) {
                        TextInputFile DC = new TextInputFile("DC.txt");
                        String[][] strDC = new String[10][6];
                        con.clear();
                        con.println("Loading");
                        con.sleep(1000);
                        con.print(".");
                        con.sleep(1000);
                        con.print(".");
                        con.sleep(1000);
                        con.println(".");
                        con.sleep(1000);
                        con.clear();
                        con.drawImage(imgDC, 0, 0);
                        con.sleep(2000);
                        con.clear();

                        for (int intRow = 0; intRow < 10; intRow++) {
                            strDC[intRow][0] = DC.readLine();
                            strDC[intRow][1] = DC.readLine();
                            strDC[intRow][2] = DC.readLine();
                            strDC[intRow][3] = DC.readLine();
                            strDC[intRow][4] = DC.readLine();
                            strDC[intRow][5] = DC.readLine();
	
							// PRINTS QUESTION & OPTIONS
                            con.println(strDC[intRow][0]); // QUESTION
                            con.println(strDC[intRow][1]); // OPTION A
                            con.println(strDC[intRow][2]); // OPTION B
                            con.println(strDC[intRow][3]); // OPTION C
                            con.println(strDC[intRow][4]); // OPTION D

							// PLAYER ENTERS ANSWER
                            con.print("Enter your answer: ");
                            strChoice = con.readLine();
                            
                            // CHECKS IF ANSWER IS CORRECT OR NOT
                            if (strChoice.equalsIgnoreCase(strDC[intRow][5].substring(strDC[intRow][5].length() - 1))) {
                                con.println("Correct!");
                                // ADDS POINT IF CORRECT
                                intDCScore = intDCScore + 1;
                            } else {
                                con.println("Incorrect. The correct answer is " + strDC[intRow][5] + ".");
                            }
                            con.sleep(3000);
                            con.clear();
                        }
						// PUTS FINAL SCORE INTO HIGHSCORE.TXT FILE
                        TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt", true);
                        HighScoresFile.println(strName);
                        HighScoresFile.println("DC TEST");
                        HighScoresFile.println(intDCScore + "/10");
                        con.println("Your Final Score: " + intDCScore + "!");
                        con.println("Type 'MM' to go back to the Menu");
                        strEndOfGame = con.readLine();
                        con.clear();
                    
                    
// STAR WARS GAME
                    } else if (strGameChoice.equalsIgnoreCase("sw")) {
                        TextInputFile StarWars = new TextInputFile("StarWars.txt");
                        String[][] strStarWars = new String[10][6];
                        con.clear();
                        con.println("Loading");
                        con.sleep(1000);
                        con.print(".");
                        con.sleep(1000);
                        con.print(".");
                        con.sleep(1000);
                        con.println(".");
                        con.sleep(1000);
                        con.clear();
                        con.drawImage(imgSTR, 0, 0);
                        con.sleep(2000);
                        con.clear();

                        for (int intRow = 0; intRow < 10; intRow++) {
                            strStarWars[intRow][0] = StarWars.readLine();
                            strStarWars[intRow][1] = StarWars.readLine();
                            strStarWars[intRow][2] = StarWars.readLine();
                            strStarWars[intRow][3] = StarWars.readLine();
                            strStarWars[intRow][4] = StarWars.readLine();
                            strStarWars[intRow][5] = StarWars.readLine();

							// PRINTS QUESTION & OPTIONS
                            con.println(strStarWars[intRow][0]); // QUESTION
                            con.println(strStarWars[intRow][1]); // OPTION A
                            con.println(strStarWars[intRow][2]); // OPTION B
                            con.println(strStarWars[intRow][3]); // OPTION C
                            con.println(strStarWars[intRow][4]); // OPTION D

							// PLAYER ENTERS ANSWER
                            con.print("Enter your answer: ");
                            strChoice = con.readLine();
                            
                            // CHECKS IF ANSWER IS CORRECT OR NOT
                            if (strChoice.equalsIgnoreCase(strStarWars[intRow][5].substring(strStarWars[intRow][5].length() - 1))) {
                                con.println("Correct!");
                                // ADDS POINT IF CORRECT
                                intStarWarsScore = intStarWarsScore + 1;
                            } else {
                                con.println("Incorrect. The correct answer is " + strStarWars[intRow][5] + ".");
                            }
                            con.sleep(3000);
                            con.clear();
                        }

						// PRINTS FINAL SCORE INTO HIGHSCORE.TXT FILE
                        TextOutputFile HighScoresFile = new TextOutputFile("HighScores.txt", true);
                        HighScoresFile.println(strName);
                        HighScoresFile.println("Star Wars TEST");
                        HighScoresFile.println(intStarWarsScore + "/10");
                        con.println("Your Final Score: " + intStarWarsScore + "!");
                        con.println("Type 'MM' to go back to the Menu");
                        strEndOfGame = con.readLine();
                        con.clear();
                    }
                }
            }
        }
    }
}
