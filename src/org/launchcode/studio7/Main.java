package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){
        DVD myDVD = new DVD("Dance recital", "DVD", 15);
        myDVD.addContents("first act");
        myDVD.addContents("half time");
        myDVD.addContents("final act");
        myDVD.addContents("after party");
        System.out.println(myDVD.toString());
        CD myCD = new CD("Music Mix", "CD", 10);
        myCD.addContents("the sweetest thing");
        myCD.addContents("the sweetest kill");
        myCD.addContents("you're so cool");
        System.out.println(myCD.toString());

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
