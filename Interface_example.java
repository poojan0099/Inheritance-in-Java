// Simple program on interface
interface F1{
    int a=10;
    public void name();
}
class Interface_example implements F1{
    public void name()
    {
        System.out.println("\nInterface method is name()");
    }
    public static void main(String[] args)
    {
        Interface_example e1 = new Interface_example();
        System.out.println(e1.a);
        e1.name();
    }
}
