package list;

public class stak {
	Node top=null;
	public void push(int data)
	{
		Node node=new Node(data);
		if(top==null)
		{
			top=node;
		}
		else
		{
			node.next=top;
	        top=node;
			
		}
	}
	public void show()
	{
		Node temp=top;
		while(temp!=null)
		{System.out.println(temp.data);
			
			temp=temp.next;
		}
	}
	public void pop()
	{
		Node temp;
		if(top==null)
		{
			System.out.println("Stack is empty\n");
		}
		else
		{
			System.out.println("Popped element" +" " +top.data);
			temp=top;
			top=top.next;
			temp=null;
			
			
		}
	}
	public void peek()
	{
		Node temp;
		if(top==null)
		{
			System.out.println("Stack is empty\n");
		}
		else
		{
			System.out.println("Peek element" +" " +top.data);
				
		}
	}

}
