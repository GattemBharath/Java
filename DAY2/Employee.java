/*Create a class employee. Inside that class create three variable name,age,city. Also create a function to
display the three variables. In the main function create two objects and call the function using it.*/

public class Employee {
    int age;
    String name, city;
    public Employee(String name, String city, int age)
    {
    	this.name = name;
    	this.age = age;
    	this.city = city;
    }
    void display()
    {
    	System.out.println("The name is "+name);
    	System.out.println("The age is "+age);
    	System.out.println("The city is "+city);
    	System.out.println("-------------------");
    }    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Employee e1 = new Employee("Bharath", "Mangalagiri", 19);
        e1.display();
        Employee e2 = new Employee("Simha", "Vijayawada", 8);
        e2.display();
	}

}
