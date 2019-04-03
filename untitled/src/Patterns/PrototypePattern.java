package Patterns;

public class PrototypePattern {
    public static void main(String[] args) throws CloneNotSupportedException{
        Kash kash = new Kash();
        kash.setStudent(new Student());
        Student student = kash.getStudent();
    }
}
class Student implements Cloneable{
    public Student clone() throws CloneNotSupportedException{
        return (Student)super.clone();
    }
}
class Kash{
    private Student student;
    public Student getStudent() throws CloneNotSupportedException{
        return student.clone();
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
