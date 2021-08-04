
package collection.arraylist;


public class Student {
    
    String studentName;
    int rollNo;
    int studentAge;
    long phoneNo;
    
     Student(String name, int roll, int age, int phone){
        this.studentName = name;
        this.studentAge = age;
        this.rollNo = roll;
        this.phoneNo = phone;
    }

    public String getStudenntName() {
        return studentName;
    }

    public void setStudenntName(String studenntName) {
        this.studentName = studenntName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Student{" + "studenntName=" + studentName + ", rollNo=" + rollNo + ", studentAge=" + studentAge + ", phoneNo=" + phoneNo + '}';
    }
     
     
    
}
