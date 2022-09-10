// Encapsulatinon - data members and member functions are integrated into a single unit.
// Access specifier is private
// Cannot be accessed by other classes
// get() and set() methods are used to access private members.
// better control flexibility and security
public class Encapsulation {
	private int age;   // Encapsulating data members as 'private'
	private int id;
	private String name;
	
	void setAge(int age)
	{
		this.age = age;
	}
	void setId(int id)
	{
		this.id = id;
	}
	void setName(String name)
	{
		this.name = name;
	}
	void getAge()
	{
		System.out.println(age);
	}
	void getId()
	{
		System.out.println(id);
	}
	void getName()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		Encapsulation e = new Encapsulation();
		e.setAge(18);
		e.setId(03);
		e.setName("John");
		
		e.getAge();
		e.getId();
		e.getName();
	}
}
