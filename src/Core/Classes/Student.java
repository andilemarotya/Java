package Classes;

public class Student {

    String name;
    int age;
    String address;

    /*We can define many constructors in java*/
    public Student(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String GetName(){
        return name;
    }
    public int GetAge(){
        return age;
    }
    public String GetAddress(){
        return address;
    }

    @Override
    public String toString(){
        return ("Student name is "+ this.GetName() +" age is "+ this.GetAge()+" and address is: "+ this.GetAddress());
    }

    public static void main(String[] args){
        Student john = new Student("John",23,"216 Matsha Street");

        System.out.println(john.GetName());
        System.out.println(john);
        System.out.println(john.age);
    }

}
