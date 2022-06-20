//Hierarchical inheritance where one class is inherited by two or more class
class One{
    String one = "classOne";
}
class Two extends One{
    String two = "ClassTwo";
    String one = super.one;
    void one()
    {
    System.out.println(one);
    }
}
class Three extends One{
    String three = "ClassThree";
}
class Hierarchical_inheritance{
    public static void main(String[] args){
        Three t1= new Three();
        System.out.println(t1.three);
        Two t2 = new Two();
        System.out.println("\n"+t2.two);
        t2.one();
        System.out.println(t1.one);
    }
}
