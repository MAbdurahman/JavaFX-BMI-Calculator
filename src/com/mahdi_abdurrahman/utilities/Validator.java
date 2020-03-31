package com.mahdi_abdurrahman.utilities;

public class Validator {
    private String lineEnd;

    public Validator() {
        this.lineEnd = "\n";
    }

    public Validator(String lineEnd) {
        this.lineEnd = lineEnd;
    }

    public String isPresent(String value, String name) {
        String msg = "";
        if (value.isEmpty()) {
            msg = name + " is required!" + lineEnd;
        }
        return msg;
    }

    public String isDouble(String value, String name) {
        String msg = "";
        try {
            Double.parseDouble(value);
        } catch (NumberFormatException e) {
            msg = name + " must be a valid number!" + lineEnd;
        }
        return msg;
    }

    public String isInteger(String value, String name) {
        String msg = "";
        try {
            Integer.parseInt(value);
        } catch (NumberFormatException e) {
            msg = name + " must be an integer!" + lineEnd;
        }
        return msg;
    }
}//end of the Validator Class
