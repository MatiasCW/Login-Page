import java.util.Scanner;

public class loginPage
{
    static String secretUname;
    static String secretPassword;
 
static void question(){
   
    Scanner input = new Scanner(System.in);
    System.out.print("ENTER NEW USERNAME ");  
    secretUname = input.nextLine();
    System.out.print("ENTER NEW PASSWORD "); 
    secretPassword = input.nextLine();
    
//username & password can't be empty
if (secretUname.isEmpty() && secretPassword.isEmpty()) {
    System.out.println("MISSING USERNAME & PASSWORD, PLEASE ENTER A USERNAME AND A PASSWORD");
    }
}
public static void main (String[] args)
{ 

    String username = " ";
    String password = " ";
//variable for amount of login attempts
//count starts at 0
    int count=0;

question();

//IF NEW PASSWORD OR NEW USERNAME IS LESS THAN 8 CHARACTERS THEN PROGRAM STOPS RUNNING
if (secretUname.length() < 8 && secretPassword.length() < 8 ) {
System.out.println("USERNAME AND PASSWORD MUST BE MORE THAN 8 CHARACTERS");
question();
    }

// PROMPT THE USER TO INPUT/ENTER INFORMATION
for (int x = 1; x <= 3; x++)  {
 
Scanner input = new Scanner(System.in);
System.out.print("ENTER USERNAME "); 
username = input.nextLine();
System.out.print("ENTER PASSWORD "); 
password = input.nextLine();


/*if the username is equal the secret username and password is equal to the
secret password & count is equal or lower than 3 & the username & password lenght is greater or equal to 8 then, you may proceed*/
if (secretUname.equals(username) && secretPassword.equals(password) && count <=3 && (username.length() >= 8 && password.length() >= 8 )) {
    System.out.println(" you may proceed ");
    System.exit(0);
//the user is now logged in
}   

else {
    System.out.println("USER OR PASSWORD IS WRONG");
    count = count +1 ; 
    System.out.println("You have had " + count + " tries/try");
            }

        }
    }
}