package yakovlevma.pkmn.models;

import java.io.Serializable;

public class Student implements Serializable {
    public static final long serialVersionUID = 1L;
    private String firstName;
    private String surName;
    private String fatherName;
    private String group;

    public Student() {}

    public Student(String firstName, String surName, String fatherName, String group) {
        this.firstName = firstName;
        this.surName = surName;
        this.fatherName = fatherName;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }
    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getFatherName() {
        return fatherName;
    }
    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", group='" + group + '\'' +
                '}';
    }
}
