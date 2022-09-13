package WifiDiagnosis;
import java.util.Scanner;
public class WifiDiagnosis {
    public static void main(String[] args) 
    {
    	String readInput ="";
    	Scanner userInput = new Scanner(System.in);
    	System.out.println("If you have a problem with internet connectivity, this Wifi Diagnosis might work.\n");
    	System.out.println("Reboot the computer and try to connect.\nDid that fix the problem? (Yes or No) ");
    	readInput = userInput.nextLine();
    	if("Yes".equals(readInput) || "yes".equals(readInput))
    	{
    		System.out.print("Done\n");
    	}
    	else if("No".equals(readInput) || "no".equals(readInput))
    	{
    		System.out.print("Reboot the router and try to connect.\nDid that fix the problem? (Yes or No) ");
    		readInput = userInput.nextLine();
    		if("Yes".equals(readInput) || "yes".equals(readInput))
    		{
    			System.out.print("Done");
    		}
    		else if("No".equals(readInput) || "no".equals(readInput))
    		{
    			System.out.println("Make sure the cables connecting the router are firmly plugged in and power is getting to the router.\nDid that fix the problem?(Yes or No)");
    			readInput = userInput.nextLine();
    			if("Yes".equals(readInput) || "yes".equals(readInput))
    			{
    				System.out.println("Done");
    			}
    			else if("No".equals(readInput) || "no".equals(readInput))
    			{
    				System.out.println("Move the computer closer to the router and try to connect.\nDid that fix the problem? (Yes or No)");
    				readInput = userInput.nextLine();
    				if("Yes".equals(readInput) || "yes".equals(readInput))
    				{
    					System.out.println("Done");
    				}
    				else if("No".equals(readInput) || "no".equals(readInput))
    				{
    					System.out.println("Contact your Internet Service Provider.\nDone\n");
    				}
    			}
    		}
    	}
    	
    	System.out.println("Programmer: Keimahrey Bates");
    }
}
