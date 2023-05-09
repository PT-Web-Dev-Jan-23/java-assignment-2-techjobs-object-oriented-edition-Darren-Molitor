package org.launchcode.techjobs.oo;

public class PositionType extends JobField {

//    private static int nextId = 1;
//    private final int id;
//    private String value;

//    public PositionType() {
//        this.id = nextId;
//        nextId++;
//    }

    public PositionType(String aValue) {
        super(aValue);
//        this();
//        this.value = aValue;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.
    @Override
    public String toString() {
        if (value == "") {
            value = "Data not available";
        }
        return value;
    }

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return id == that.id;
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }

    // Getters and Setters:

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }

}