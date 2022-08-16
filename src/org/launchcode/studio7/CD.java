package org.launchcode.studio7;

public class CD extends BaseDisc implements OpticalDisc{
    public CD(String name, String discType, int capacity) {
        super(name, discType, capacity);
        this.setCapacity(10);

    }

    @Override
    public void spinDisc() {
        for(String item : this.contents){
            System.out.println(item);

        }

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
