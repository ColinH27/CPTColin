import arc.*;
import java.awt.*;
import java.awt.image.*;

public class ColinMultipleChoiceGameCPT2024 {
    public static void main(String[] args) {
        Console con = new Console();
        
        // SCORING
        // SET SCORE TO 0 FOR ALL 3 GAMES
        int intMCUScore = 0;
        int intStarWarsScore = 0;
        int intDCScore = 0;
        int intTotalScore = 0;
        int intAverageScore = 0;

        // MAIN MENU
        String strMenuChoice = "";  
        String strGameChoice = ""; 
        String strEnd = "";  
		String strName = "";
		
		// IMAGES
		

		while (true) {
	// 	ASK PLAYER FOR THEIR NAME
   		con.println("Enter your name");
		strName = con.readLine();
		con.println("Welcome " + strName + "!");
		con.sleep(1000);
		con.clear();
  
    // MAIN MENU SCREEN
		con.println("What would you like to do?");
        strMenuChoice = con.readLine();
        con.sleep(1000);
        con.clear();

        // STA TITAN "CHEAT"
    if (strMenuChoice.equalsIgnoreCase("statitan")) {
       con.println("It's your lucky day!!!!! :)");
       con.println("Congrats!");
       con.println("To thank you 5 points have been added to total score!");
       // ADD Something
        }

        // VIEW SCORE SCREEN
	if (strMenuChoice.equalsIgnoreCase("s")) {
        // ADD LEADERBOARD
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
            con.println("Type 'dc' to play DC Test!");
            con.println("What game would you like to play?");
            strGameChoice = con.readLine();
        }

        // MARVEL TEST
        if (strGameChoice.equalsIgnoreCase("mcu")) {
            TextInputFile MCU = new TextInputFile("MCU.txt");
            String[][] strMCU = new String[10][6];
			
			// LOADING MARVEl
			con.clear();
			con.println("loading");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.println(".");
			con.sleep(1000);
			con.clear();

            for (int intRow = 0; intRow < 10; intRow++) {
                strMCU[intRow][0] = MCU.readLine(); // Question
                strMCU[intRow][1] = MCU.readLine(); // Option A
                strMCU[intRow][2] = MCU.readLine(); // Option B
                strMCU[intRow][3] = MCU.readLine(); // Option C
                strMCU[intRow][4] = MCU.readLine(); // Option D
                strMCU[intRow][5] = MCU.readLine(); // Correct Answer
				// PRINTS QUESTION AND OPTIONS
                con.println("Question " + (intRow + 1) + ":");
                con.println(strMCU[intRow][0]);
                con.println(strMCU[intRow][1]);
                con.println(strMCU[intRow][2]);
                con.println(strMCU[intRow][3]);
                con.println(strMCU[intRow][4]);
				
				// PLAYER ENTERS ANSWER
                con.print("Enter your answer: ");
                String strChoice = con.readLine();
                String correctAnswer = strMCU[intRow][5].substring(strMCU[intRow][5].length() - 1);
     
     // CHECKS IF ANSWER IS CORRECT OR NOT
      if (strChoice.equalsIgnoreCase(correctAnswer)) {
          con.println("Correct!");
     // SCORING
           intMCUScore = intMCUScore + 1;

         } else {
 con.println("Incorrect. The correct answer is " + correctAnswer + ".");
                }
         // Clears and moves onto next question       
         con.sleep(3000);
         con.clear();
	
	     TextOutputFile Scorefile = new TextOutputFile("Score.txt");
         Scorefile.println(strName);
         Scorefile.println("MCU TEST");
         Scorefile.println(intMCUScore + "/10");
                
            }
	
		// Final Score Screen & Thank You Screen
		con.println("Your Final Score: " + intMCUScore + "!");

       // Thank you for playing Screen
       con.println("What would you like to do now?");
       con.println("Type 'Quit' to quit or 'MM' to go back to the Menu");
       strEnd = con.readLine();
       con.clear();
        }

        // STAR WARS TEST
        if (strGameChoice.equalsIgnoreCase("sw")) {
            TextInputFile StarWars = new TextInputFile("StarWars.txt");
            String[][] strStarWars = new String[10][6];

			// LOADING STAR WARS
			con.clear();
			con.println("loading");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.println(".");
			con.sleep(1000);
			con.clear();

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
		// SCORING
		intStarWarsScore = intStarWarsScore + 1;
         TextOutputFile Scorefile = new TextOutputFile("Score.txt");
         Scorefile.println(strName);
         Scorefile.println("STAR WARS TEST");
         Scorefile.println(intStarWarsScore + "/10");
                 
			
	} else {
	con.println("Incorrect. The correct answer is " + correctAnswer + ".");
                }
            
         // Clears and moves onto next question       
         con.sleep(3000);
         con.clear();
            }
            
          // Final Score Screen & Thank You Screen
		con.println("Your Final Score" + intStarWarsScore + "!");
		
	// Thank you for playing Screen
       con.println("What would you like to do now?");
       con.println("Type 'Quit' to quit or 'MM' to go back to the Menu");
       strEnd = con.readLine();   
       con.clear();
            
        }

        // DC TEST
        if (strGameChoice.equalsIgnoreCase("dc")) {
            TextInputFile DC = new TextInputFile("DC.txt");
            String[][] strDC = new String[10][7];

			// LOADING DC
			con.clear();
			con.println("loading");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.print(".");
			con.sleep(1000);
			con.println(".");
			con.sleep(1000);
			con.clear();
			
            for (int intRow = 0; intRow < 10; intRow++) {
                strDC[intRow][0] = DC.readLine();
                strDC[intRow][1] = DC.readLine();
                strDC[intRow][2] = DC.readLine();
                strDC[intRow][3] = DC.readLine();
                strDC[intRow][4] = DC.readLine();
                strDC[intRow][5] = DC.readLine();
	
				// PRINTS QUESTION AND OPTIONS
                con.println("Question " + (intRow + 1) + ":");
                con.println(strDC[intRow][0]);
                con.println(strDC[intRow][1]);
                con.println(strDC[intRow][2]);
                con.println(strDC[intRow][3]);
                con.println(strDC[intRow][4]);
				
				// PLAYER ENTERS THEIR ANSWER
                con.print("Enter your answer: ");
                String strChoice = con.readLine();
                String correctAnswer = strDC[intRow][5].substring(strDC[intRow][5].length() - 1);

      if (strChoice.equalsIgnoreCase(correctAnswer)) {
            con.println("Correct!");
         // SCORING
         intDCScore = intDCScore + 1;		
         TextOutputFile Scorefile = new TextOutputFile("Score.txt");
         Scorefile.println(strName);
         Scorefile.println("DC TEST");
         Scorefile.println(intDCScore + "/10");
      } else {
 con.println("Incorrect. The correct answer is " + correctAnswer + ".");
					}
	// Clears and moves onto next question       
         con.sleep(3000);
         con.clear();
				}
				
			}
		// Final Score Screen & Thank You Screen
		con.println("Your Final Score: " + intDCScore + "!");
			
		// Thank you for playing Screen
       con.println("What would you like to do now?");
       con.println("Type 'Quit' to quit or 'MM' to go back to the Menu");
       strEnd = con.readLine();
       con.clear();
			
		}
	



		
	
	
	
	
	
	
	
	
			
	}

}
