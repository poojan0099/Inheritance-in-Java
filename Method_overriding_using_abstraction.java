//Abstaraction used in method overriding which is type of Polymorphism
//Abstract Method is a method without body
//class must have "abstract" keyword while defining abstract class.
//if a class extends abstract class then it must define the abstract method of the abstract class
//we cannot create an object of Abstract class.
abstract class Fruit{
    abstract void color();
}

class Apple extends Fruit{
    void color()
    {
        System.out.println("Red color");
    }
}

class Banana extends Fruit{
    void color()
    {
        System.out.println("Yellow color");
    }
}

class Method_overriding_using_abstraction{
    public static void main(String[] args)
    {
        Banana b = new Banana();
        b.color();
        Apple a = new Apple();
        a.color();
    }
}
