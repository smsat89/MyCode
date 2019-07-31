package javaConcepts;

public class ConstructorConcept {

	int age;
	String Name;
	
	public ConstructorConcept() {
		System.out.println("This is Default Constructor");
	
	}
	
	public ConstructorConcept(int a) {
		System.out.println("This is Parameterised Constructor and the value of parameter is " + a);	
	}
	

	public ConstructorConcept(int age, String Name) {
		System.out.println("This is an example of Parameterised Constructor and the values of parameters are " + age +" & " + Name );
	this.Name=Name;
	this.age=age;
	
	
	}


	public static void main(String[] args) {

//		ConstructorConcept cc= new ConstructorConcept();
//		ConstructorConcept cc= new ConstructorConcept(10);
	ConstructorConcept cc= new ConstructorConcept(30,"Sumeet");
	}

}
