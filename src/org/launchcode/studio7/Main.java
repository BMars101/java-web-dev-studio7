package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        CD myCD = new CD("Music Mix", "CD", 10);
        System.out.println(myCD.getCapacity());
        myCD.addContents("a song");
        System.out.println(myCD.getContents());
        System.out.println(myCD.getCapacity());
        System.out.println(myCD.getRemainingCapacity());
        myCD.spinDisc();

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
