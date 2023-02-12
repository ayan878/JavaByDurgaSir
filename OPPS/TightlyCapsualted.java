

class Account 
{
    
private double balance;
public double getBalance() {
return balance;
}
}

class A {
int x=10; //not
}
class B extends A {
private int y=20; //not
}
class C extends B {
private int z=30; //not
}
//Note: if the parent class is not tightly encapsulated then no child class is tightly
//encapsulated. it  has been done