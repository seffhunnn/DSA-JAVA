class Pen{
    String color;
    String type;

        public void write(){
            System.out.println("writing something");
        }

        public void printColor(){
            System.out.println(this.color);
        }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

//    Student(){ // non parametrised constructor
//        System.out.println("Constructor called");
//    }

    Student(String name,int age){ //  parametrised constructor
        this.name=name;
        this.age=age;
    }
}

public class Oops {
    public static void main(String[] args){
//        Pen pen1= new Pen();
//        pen1.color="Blue";
//        pen1.type="Gel";
//
//        Pen pen2= new Pen();
//        pen2.color="Black";
//        pen2.type="Ballpoint";
//
//        pen1.printColor();
//        pen2.printColor();

        Student s1=new Student("Saif",24);
        s1.printInfo();
    }
}
