package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {
        LinkedInBot linkedInBot = new LinkedInBot();
        linkedInBot.loginfailed("UserName","Password");
        System.out.println( "Completed Successfully" );
    }
}
