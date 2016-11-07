// The "PrimeNumber" class.
import java.awt.*;
import hsa.Console;

public class PrimeNumber
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	int num;
	int check;
	boolean prime = false;
	
	c.print("Input a number: ");
	num = c.readInt();
	for (int i = 2; i < num; i++){
	    check = num % i;
	    if (check == 0)
		prime = true;
	}
	if (prime == false)
	    c.println("The number is prime.");
	else
	    c.println("The number is not prime.");
	    
	    
	    
	
	// Place your program here.  'c' is the output console
    } // main method
} // PrimeNumber class

