package bai2;

public class Student implements Comparable<Student>{
    private String name;
    private String studentCode;
    private String email;
    private double point;
    private String rank;
    
    public Student(String name, String studentCode, String email, double point, String rank) {
        this.name = name;
        this.studentCode = studentCode;
        this.email = email;
        this.point = point;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", studentCode=" + studentCode + ", email=" + email + ", point=" + point
                + ", rank=" + rank + "]";
    }

    @Override
    public int compareTo(Student otherStudent) {
        // TODO Auto-generated method stub
        if (this.point < otherStudent.point) {
            return 1;
        } else if (this.point > otherStudent.point) {
            return -1;
        }
        return 0;
    }

    
    
}
