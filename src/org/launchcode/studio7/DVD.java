package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements OpticalDisc{
    public DVD(String name, String discType, int capacity) {
        super(name, discType, capacity);
        this.setCapacity(15);
    }


    @Override
    public void spinDisc() {
        for (String item : this.contents) {
            System.out.println(item);

        }
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
