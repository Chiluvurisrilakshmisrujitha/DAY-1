class Student
{
    int age;
    String name;
    public void show(int age, String name)
    {
        this.age=age;
        this.name=name;
    }
    public void display()
    {
        System.out.println("Age: " + age);
        System.out.println("Name: "+name);
    }
}
class CollegeStudent extends Student
{
    String collegeName;
    public void show(int age, String name, String collegeName) 
    {
        super.show(age, name); 
        this.collegeName = collegeName;
    }
     public void display() 
    {
        super.display(); 
        System.out.println("College: " + collegeName);
    }
}
class SchoolStudent extends Student 
{
    String schoolName;
    public void show(int age, String name, String schoolName)
    {
        super.show(age, name);
        this.schoolName = schoolName;
    }
    public void display() 
    {
        super.display();
        System.out.println("School: " + schoolName);
    }
}
public class Main
 {
    public static void main(String[] args)
    {
        CollegeStudent s1 = new CollegeStudent();
        s1.show(21, "Madhuri", "JNTU College");
        s1.display();
        System.out.println();
        SchoolStudent s2 = new SchoolStudent();
        s2.show(15, "sruji", "ABC High School");
        s2.display();
    }
}