import java.util.Random;
import java.util.Scanner;

public class GamePen
{
    /*
    * Requirements: method of score keeping, random
    *               number, user input, 2d array to
    *               represent grid or goal.
    */
    
    private int userScore = 0;
    String[][] goal = new String[3][4];
    private int shots = 5;
    Scanner scanMain = new Scanner(System.in);
    
    public void startGame()
    {
        System.out.println("What team (country) would you like to play as?");
        String userTeam = scanMain.nextLine();
        
        System.out.println("What team would you like to play against?");
        String opponentTeam = scanMain.nextLine();
        
        for(int i = 1; i <= shots; i++)
        {
            System.out.println("");
            System.out.println("It's time to shoot! To choose a shot, type... ");
            System.out.println("The height of shot, followed by the direction.");
            System.out.println("Where would you like to shoot?");
            String userShot = scanMain.nextLine();
            System.out.println("");
            
            for(int r = 0; r < goal.length; r++)
            {
                for(int c = 0; c < goal[0].length; c++)
                {
                    goal[r][c] = " ";
                }
            }
            
            int randRow = (int)(Math.random() * 3);
            int randCol = (int)(Math.random() * 4);
            
            saveShot(randRow, randCol);
            shot(userShot, randRow, randCol);
            
            printGoal();
        }
        
        if(userScore == 5)
        {
            System.out.println("");
            System.out.println("Congratulations! You beat " + opponentTeam + " with a score of " + userScore + " points.");
            System.out.println(userTeam + " are crowned champions!");
        }
        else
        {
            System.out.println("You did not score all of your goals. This means you lost.");
            System.out.println("You scored a total of " + userScore + " goals.");
            System.out.println(opponentTeam + " are crowned champions!");
        }
        
    }
    
    public boolean saveShot(int randRow, int randCol)
    {
        goal[randRow][randCol] = "🧤";
        System.out.println("The goalie has dived to [" + randRow + "," + randCol + "].");
        return true;
    }
    
    public void shot(String userShot, int randRow, int randCol)
    {
        if(userShot.equals("top right"))
        {
            if(randRow == 0 && randCol == 3)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[0][3] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        }
        else if(userShot.equals("bottom right"))
        {
            if(randRow == 2 && randCol == 3)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[2][3] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        }
        else if(userShot.equals("mid right"))
        {
            if(randRow == 1 && randCol == 3)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[1][3] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        }
        else if(userShot.equals("top left"))
            if(randRow == 0 && randCol == 0)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[0][0] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("bottom left"))
            if(randRow == 2 && randCol == 0)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[2][0] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("mid left"))
            if(randRow == 1 && randCol == 0)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[1][0] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("top middle right"))
            if(randRow == 0 && randCol == 2)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[0][2] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("bottom middle right"))
            if(randRow == 2 && randCol == 2)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[2][2] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("mid middle right"))
            if(randRow == 1 && randCol == 2)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[1][2] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("top middle left"))
            if(randRow == 0 && randCol == 1)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[0][1] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("bottom middle left"))
            if(randRow == 2 && randCol == 1)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[2][1] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
        else if(userShot.equals("mid middle left"))
            if(randRow == 1 && randCol == 1)
            {
                System.out.println("Your shot was saved!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
            else
            {
                goal[1][1] = "⚽️";
                userScore++;
                System.out.println("Congratulations, you scored!");
                System.out.println("You now have " + userScore + " point(s).");
                System.out.println("");
            }
    }
    
    public void printGoal()
    {
        System.out.println("         __________ __________ __________ __________ ");
        for(int r = 0; r < goal.length; r++)
        {
            System.out.println("        |          |          |          |          |");
            for(int c = 0; c < goal[0].length; c++)
            {
                if(c==0)
                    System.out.print("        |  ");
                System.out.print("   " + goal[r][c] + "    |  ");
            }
            System.out.println();
            System.out.println("        |__________|__________|__________|__________|");
        }
    }
    
}
