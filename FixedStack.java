package myPack;

//fixedstack implements the interface stack
class FixedStack implements Stack
{
	 
		int s[]=new int[20];  //creating an array for stack

		int top=0;	//top pointing to the index of topmost element
		int size;	//size specifies size of stack
	 
		FixedStack()
		{
			size =3;		//stack size is initialized to 3
		}	
	
	
		//method to push elements in stack
		public void push(int i)
		{
		
			if(top==size)
			{
				System.out.println("Stack overflow!!!");
			}
			else
			{
				top++;
				s[top]=i;
				System.out.println();
				System.out.println("value of stack---->");
				System.out.println();
				for(int j=1;j<=top;j++)
				{
						System.out.print("   "+s[j]+"   ");
				}
			}
		}
	
		//method to pop elements from stack
		public int pop()
		{
			if(top==0)
			{
				System.out.println(" Stack underflow");
				return(0);
			}
			else
			{
				int val=s[top];
				top--;
				System.out.println();
				System.out.println("value of stack---->");
				System.out.println();
				for(int j=1;j<=top;j++)
				{
					System.out.print("   "+s[j]+"   ");
				}

				return(val);
			}
		}
	
}