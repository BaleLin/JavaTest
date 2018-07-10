package practice02;

public class Student extends Person{
   int klass;

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age, int klass) {
        super(name,age);
        this.klass = klass;
    }
    public Student(String name, int age) {
        super(name,age);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String introduce(){
        return "I am a Student. I am at Class "+this.getKlass()+".";
    }
}
