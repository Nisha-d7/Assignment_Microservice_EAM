package com.nisha.week7;

public class Student {
    private int StudentID;
    private String Fname;
    private String Lname;
    private String Phone;
    private String DOB;
    private String Address;
    private String Street;
    private String City;
    private String No;

    @Override
    public String toString() {
        return "Student [StudentID=" + StudentID + ", Fname=" + Fname + ", Lname=" + Lname + ", Phone=" + Phone +
                ", DOB=" + DOB + ", Address=" + Address + ", Street=" + Street + ", City=" + City + ", No=" + No + "]";
    }

    public Student() {
    }

    public Student(int studentID, String fname, String lname, String phone, String dob, String address,
                   String street, String city, String no) {
        this.StudentID = studentID;
        this.Fname = fname;
        this.Lname = lname;
        this.Phone = phone;
        this.DOB = dob;
        this.Address = address;
        this.Street = street;
        this.City = city;
        this.No = no;
    }

    // Getters and Setters
    public int getStudentID() { return StudentID; }
    public void setStudentID(int studentID) { this.StudentID = studentID; }
    public String getFname() { return Fname; }
    public void setFname(String fname) { this.Fname = fname; }
    public String getLname() { return Lname; }
    public void setLname(String lname) { this.Lname = lname; }
    public String getPhone() { return Phone; }
    public void setPhone(String phone) { this.Phone = phone; }
    public String getDOB() { return DOB; }
    public void setDOB(String dob) { this.DOB = dob; }
    public String getAddress() { return Address; }
    public void setAddress(String address) { this.Address = address; }
    public String getStreet() { return Street; }
    public void setStreet(String street) { this.Street = street; }
    public String getCity() { return City; }
    public void setCity(String city) { this.City = city; }
    public String getNo() { return No; }
    public void setNo(String no) { this.No = no; }
}