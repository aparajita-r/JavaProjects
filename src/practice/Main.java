package practice;

public class Main {
    public static void main(String[] args) {

/*
        System.out.println("Hello world!");
        System.out.println(" I m here");
        System.out.println("Hellloooo");

        // THis is example of Abstract class [1.] creating the object of class implementing the functionalInterface. the class is between two { and };
        functionInter fI1= new functionInter(){

            @Override
            public void sayHello(){
                System.out.println("Inside main method Interface1");
            }
        };

        fI1.letsPay();
        fI1.sayHello();
        functionInter.sayHi();

        // 2nd implementation of anonymous class. anonymous class is used where lymda expression cant be used because Lymda expression can be used only with functional
        // Interface but many times the Interface will have more than 1 abstract methods so it will not be considered as functional interface. such as

        functionInter fI2 = new functionInter() {
            @Override
            public void sayHello() {
                System.out.println("inside fI2 overridden method");
            }
        };

        fI2.sayHello();
       // fI2.sayHi();  static method cant be accessed via object
        fI2.letsPay();
*/

        // Thread implementation for the lymda expression
        functionInter i1 = () -> {
            System.out.println("Hello Lymda 1");
        };
        i1.sayHello();

        calculateArea ca1 = (a,b)-> a*b;
        System.out.println("Area ="+ ca1.area(4, 5));

        calculateArea ca2 =(a,b) -> a+b;
        System.out.println("Sum =" + ca2.area(8, 6));

        LengthInter lI1 =(str) -> str.length();
        System.out.println("Length of my name :" + lI1.lengthStr("Aparajita Ramyan"));

        // Thread usage

    }
}