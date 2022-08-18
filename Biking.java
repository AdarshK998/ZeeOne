package Day2;

class Bike{
    Bike()
    {
        System.out.println("constructor executed");
    }
    Bike (int i)
    {
        System.out.println("constructor");
    }
}
public class Biking {
    public static void main(String[] args) {
        Bike b=new Bike();
        Bike b1=new Bike(10);
    }
}
