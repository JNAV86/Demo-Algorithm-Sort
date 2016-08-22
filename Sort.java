//Author: Joshua Cogburn
//Description:
/*
    This Application will propt the user to enter names, then it sorts them.

*/


import java.util.*;
class Sort {
    public static void main( String [] args  ) {

        List<String> list = Arrays.asList();
        
        System.out.println("Please enter the name of the selected pet when prompted.");		
        Scanner keyboard = new Scanner(System.in);		
        boolean done = false;
        while(!done)
        {
            
            //The user is asked to enter in a name and if 
            //the user wants to enter more names then they type 'yes' 


             System.out.println("Enter the name of your chosen pet:");			
             String name = keyboard.nextLine();			
             list.add(name);			
             System.out.println("Do you need to enter more names?");			
             String response = keyboard.nextLine();			
             if(!response.equalsIgnoreCase("yes"))			
             {
                  done = true;
             }
        }
        
        
        
        Collections.sort( list , new Comparator<String>(){
            public int compare( String a, String b ){
                // if both are numbers
                if( a.matches("\\d+") && b.matches("\\d+")) {
                    return new Integer( a ) - new Integer( b );
                }
                // else, compare normally. 
                return a.compareTo( b );
            }
        });
        System.out.println( list );
    }
}