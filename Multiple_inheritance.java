// Multiple inheritance where two classes are inherited by one single class. Multiple inheritance can only be implemented using interfaces
interface F1{
    int a=10;
    default void name()
    {
      System.out.println("\nInterface method is name()");  
    }
}
interface F2 extends F1{
    int b = 20;
    public void age();
}


class Multiple_inheritance implements F1,F2{
    public void age()
    {
        System.out.println("\nage is 18");
    }
    public static void main(String[] args)
    {
        Multiple_inheritance e1 = new Multiple_inheritance();
        System.out.println(e1.a+"\n");
        System.out.println(e1.b);
        e1.name();
        e1.age();
    }
}
