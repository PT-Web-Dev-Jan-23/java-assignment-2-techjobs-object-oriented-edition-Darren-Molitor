package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    private static int nextId = 1;
    public final int id;
    String value;

    public JobField() {
        this.id = nextId;
        nextId++;
    }

    public JobField(String aValue) {
        this();
        this.value = aValue;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        if (value == "") {
            value = "Data not available";
        }
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

}