package com.collection;

public class Student {
	
	String stud_id;
    String stud_name;
    String stud_location;

    public String getStud_id() {
        return stud_id;
    }

    public String getStud_name() {
        return stud_name;
    }

    public String getStud_location() {
        return stud_location;
    }

    Student(String sid, String sname, String slocation) {

        this.stud_id = sid;
        this.stud_name = sname;
        this.stud_location = slocation;

    }

}
