package myPack;

class VariableStack implements Stack
{
		int s[]=new int[20];	// declaring an array for stack
		int top=0;				
		int size;
		
		VariableStack()
		{
				size =3;		//initializing size of the stack 
		}
	
		//	method to push elements in stack
	
		public void push(int i)
		{
		//if size exceeds the initialized size add extra memory to stack
			if(top==size)
			{
				System.out.println("Adding extra memory!!!");
				size++;
				top++;
				s[top]=i;
				System.out.println("value of stack---->");
				System.out.println();
				
				for(int j=1;j<=top;j++)
				{
					System.out.print("   "+s[j]+"   ");
				}
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
