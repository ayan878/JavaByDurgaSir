class Parent {
public void methodOne(){
    System.out.println("Method One");
 }
}
class Child extends Parent {
public void methodTwo() {
    System.out.println("Method Two");
 }
}
class Inheritance{
    public static void main (String[]args){
        Parent p1=new Parent();
        p1.methodOne();
         //p1.methodTwo(); WE cant call Child class with parent class object
        Child ch1=new Child();
        ch1.methodOne();  //We can call Parent class with child class object
        //p1.methodTwo(); WE cant call Child class with parent class object

    }
}