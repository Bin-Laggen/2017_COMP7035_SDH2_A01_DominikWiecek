package hint2;


public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private MyNode head;
	private int numItems;
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){
		this.head = null;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){
		if(numItems == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){
		if(numItems > 0)
		{
			return this.head.getInfo();
		}
		else
		{
			System.out.println("ERROR - Queue is empty");
			return 0;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		MyNode newNode = new MyNode(element, null);
		if(numItems == 0)
		{
			head = newNode;
		}
		else
		{
			int i = 0;
			MyNode currentNode = head, previousNode = null;
			do
			{
				previousNode = currentNode;
				currentNode = currentNode.getNext();
				i++;
			}
			while(i < numItems);

			newNode = new MyNode(element, null);
			previousNode.setNext(newNode);
			newNode.setNext(currentNode);
		}
		numItems++;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
		if(numItems == 1)
		{
			head = null;
			numItems--;
		}
		else if(numItems > 1)
		{
			head = head.getNext();
			numItems--;
		}
		else
		{
			System.out.println("ERROR - Queue is empty");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
