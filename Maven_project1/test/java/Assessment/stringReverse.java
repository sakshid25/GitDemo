package Assessment;

public class stringReverse 
{    
   public static void main(String[] args) {    
       String string = "Hello World";       
       String reversedString = "";    
           
       //Iterate through the string from last and add each character to variable reversedStr    
       for(int i = string.length()-1; i >= 0; i--){    
    	   reversedString = reversedString + string.charAt(i);    
       }    
           
       System.out.println("Original string is " + string);    
       //Displays the reverse of given string    
       System.out.println("Reversed string is " + reversedString);    
   }    
}    