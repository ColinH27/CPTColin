import arc.*;

public class ColinMultipleChoiceGameCPT {
    public static void main(String[] args) {
        Console con = new Console();
// MAIN MENU
		
		// Image That Shows Main Menu
	
	// Player Will Type In What They Want To DO
	String strGameChoice = con.readLine();	
	
	if (strGameChoice.equalsIgnoreCase("Play")) {	
		// Will put in more code that redirects them to screen where player can pick 1 of the 3 tests to play
	}else if (strGameChoice.equalsIgnoreCase("Help")){
		// Will direct player to a help screen
		con.println("Loading...");
	}else if (strGameChoice.equalsIgnoreCase("Score")) {
		// Will put in more code that redirects them to a score screen
		con.println("Loading...");
	}else if (strGameChoice.equalsIgnoreCase("Quit")) {
		//Will put option to quit game
	}
		
// MARVEL TEST
        TextInputFile MCU = new TextInputFile("MCU.txt");
        String[][] strMCU = new String[10][6];

        // CODE WILL LOOP/REPEAT 10 TIME FOR ALL 10 QUESTIONS IN TEST
        for (int intRow = 0; intRow < 10; intRow++) {
            // Read questions and options into the array
            strMCU[intRow][0] = MCU.readLine(); // Question
            strMCU[intRow][1] = MCU.readLine(); // Option A
            strMCU[intRow][2] = MCU.readLine(); // Option B
            strMCU[intRow][3] = MCU.readLine(); // Option C
            strMCU[intRow][4] = MCU.readLine(); // Option D
            strMCU[intRow][5] = MCU.readLine(); // Correct Answer

            // OUTPUTS 1 QUESTION AND ITS RESPONSES
            con.println("Question " + (intRow + 1) + ":");
            con.println(strMCU[intRow][0]); // Question
            con.println(strMCU[intRow][1]); // Option A
            con.println(strMCU[intRow][2]); // Option B
            con.println(strMCU[intRow][3]); // Option C
            con.println(strMCU[intRow][4]); // Option D

            // GETS THE PLAYER'S RESPONSE
            con.print("Enter your answer: ");
            String strChoice = con.readLine();

			// CORRECT ANSWER OF EACH QUESTION
			String correctAnswerLine = strMCU[intRow][5];
			String correctAnswer = correctAnswerLine.substring(correctAnswerLine.length() - 1);

			// CHECK IF PLAYER'S RESPONSE IS CORRECT OR NOT 
			if (strChoice.equalsIgnoreCase(correctAnswer)) {
				con.println("Correct!");
			} else {
				con.println("Incorrect:( The correct answer is " + correctAnswer + ".");
			}

        }
        
        con.println("Thanks for playing!!!");
        con.println("Type MM to go back to the main menu screen");
        
        

// STAR WARS TEST
      TextInputFile StarWars = new TextInputFile("StarWars.txt");
      String[][] strStarWars = new String[10][6];
		// CODE WILL LOOP/REPEAT 10 TIMES FOR ALL 10 QUESTIONS IN TEST
        for (int intRow = 0; intRow < 10; intRow++) {
            // Read questions and options into the array
            strStarWars[intRow][0] = StarWars.readLine(); // Question
            strStarWars[intRow][1] = StarWars.readLine(); // Option A
            strStarWars[intRow][2] = StarWars.readLine(); // Option B
            strStarWars[intRow][3] = StarWars.readLine(); // Option C
            strStarWars[intRow][4] = StarWars.readLine(); // Option D
            strStarWars[intRow][5] = StarWars.readLine(); // Correct Answer

            // OUTPUTS 1 QUESTION AND ITS RESPONSES
            con.println("Question " + (intRow + 1) + ":");
            con.println(strStarWars[intRow][0]); // Question
            con.println(strStarWars[intRow][1]); // Option A
            con.println(strStarWars[intRow][2]); // Option B
            con.println(strStarWars[intRow][3]); // Option C
            con.println(strStarWars[intRow][4]); // Option D

            // GETS THE PLAYER'S RESPONSE
            con.print("Enter your answer: ");
            String strChoice = con.readLine();

            // CORRECT ANSWER OF EACH QUESTION
            String correctAnswerLine = strStarWars[intRow][5];
            String correctAnswer = correctAnswerLine.substring(correctAnswerLine.length() - 1);

            // CHECK IF PLAYER'S RESPONSE IS CORRECT OR NOT
            if (strChoice.equalsIgnoreCase(correctAnswer)) {
                con.println("Correct!");
            } else {
                con.println("Incorrect:( The correct answer is " + correctAnswer + ".");
            }
        }

 

		
    }
}

