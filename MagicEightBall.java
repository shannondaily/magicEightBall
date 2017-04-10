/*
Magic 8-Ball Program

@author Shannon Daily
@version 1.0 11/02/2016
 */

import java.util.*;
public class MagicEightBall 
{
    public static void main(String[] args)
    {
       //Declare variables 
       String userQuestion;
       int number;
       
       do{
           
       userQuestion = promptUser();
       
       shakeMagicEightBall();
       
       number = randomNumber(); 
       
       messageMagicEightBall(number);
       
       }while(number < 5);
           
    }//End main.  
    
    
    public static String promptUser()
    {
        //Declare scanner.
        Scanner mKeyboard = new Scanner(System.in);
        
        //Declare variables.
        String mUserQuestion;
        
        //Prompt user
        System.out.println("What yes/no question do you want the great Magic 8-Ball to answer?");
        mUserQuestion = mKeyboard.nextLine();
        System.out.println();
        
        //Return mUserQuestion to main.
        return mUserQuestion; 
    }//End promptUser method. 
    
    
    public static void shakeMagicEightBall()
    {
        //Declare scanner.
        Scanner mKeyboard = new Scanner(System.in);
        
        //Declare variables.
        String pressEnter;
        
        //Prompt user to press enter.
        System.out.println("Press enter to shake the Magic 8-Ball.");
        pressEnter = mKeyboard.nextLine();
        
    }//End shakeMagicEightBall method.
    
    
    public static int randomNumber()
    {
        //Declare random number generator.
        Random mRand = new Random();
        
        //Declare variables. 
        int mNumber;
        
        //Find a random number between 0 and 19 inclusive.
        mNumber = mRand.nextInt(20); 
        
        //return random number to main.
        return mNumber;
    }//End randomNumber method.        
    
    
    public static void messageMagicEightBall(int methodNumber)
    {
        //Declare array.
        String [] answerArray = new String [20]; 
        
        //Declare variables.
        answerArray[0] = "Reply hazy, try again.";
        answerArray[1] = "Ask again later.";
        answerArray[2] = "Better not tell you now.";
        answerArray[3] = "Cannot predict now.";
        answerArray[4] = "Concentrade and ask again.";
        answerArray[5] = "Don't count on it.";
        answerArray[6] = "My reply is no.";
        answerArray[7] = "My sources say no.";
        answerArray[8] = "Outlook not so good.";
        answerArray[9] = "Very doubtful.";
        answerArray[10] = "It is certain.";
        answerArray[11] = "It is decidely so.";
        answerArray[12] = "Without a doubt.";
        answerArray[13] = "Yes, definitely.";
        answerArray[14] = "You may relly on it.";
        answerArray[15] = "As I see it, yes.";
        answerArray[16] = "Most likely."; 
        answerArray[17] = "Outlook good.";
        answerArray[18] = "Yes.";
        answerArray[19] = "Signs point to yes.";   
        
        System.out.printf("%s\n", answerArray[methodNumber]);  
        System.out.println();
    }//End messageMagicEightBall method.    
}//End class.
