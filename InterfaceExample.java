package myPack;

public class InterfaceExample
{
	public static void main(String args[])
	{
		Stack f= new FixedStack();    //creating object of FixedStack
		VariableStack v= new VariableStack();    //creating object of VariableStack
		int val;
		
		System.out.println("Fixed stack operations");
		System.out.println("***********************");
		
		
		//push elements in fixedstack
		System.out.println("Push Operations");
		System.out.println("****************");
		f.push(10);
		f.push(20);
		f.push(30);
		f.push(40);
		
		
		//pop elements from fixedstack
		System.out.println("Pop Operations");
		System.out.println("****************");
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		
		
		System.out.println("Variable stack operations");
		System.out.println("***********************");
		
		
		//push elements in variablestack
		System.out.println("Push Operations");
		System.out.println("****************");
		v.push(10);
		v.push(20);
		v.push(30);
		v.push(40);
				
		
		//pop elements from variablestack
		System.out.println("Pop Operations");
		System.out.println("****************");
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		
	}
}
