package hint3;


public class MyDoubleDynamicQueue<T> implements MyQueue<T> {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private MyDoubleLinkedNode<T> tail;
	private MyDoubleLinkedNode<T> head;
	private int numItems;
	
	
	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyDoubleDynamicQueue(){
		this.tail = null;
		this.head = null;
		this.numItems = 0;
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: isEmpty
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
	public T first(){
		if(numItems > 0)
		{
			return head.getInfo();
		}
		else
		{
			System.out.println("ERROR - Queue is empty");
			return null;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){
		if(numItems == 0)
		{
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
		}
		else
		{
			MyDoubleLinkedNode<T> oldHead = head;
			head = new MyDoubleLinkedNode<T>(null, element, oldHead);
			oldHead.setLeft(head);
		}
		numItems++;
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){
		if(numItems > 1)
		{
			head = head.getRight();
			head.setLeft(null);
			
			numItems--;
		}
		else if(numItems == 1)
		{
			head = null;
			tail = null;
			numItems--;
		}
		else
		{
			System.out.println("ERROR - Queue is empty");
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last(){
		if(numItems > 0)
		{
			return tail.getInfo();
		}
		else
		{
			System.out.println("ERROR - Queue is empty");
			return null;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){
		if(numItems == 0)
		{
			head = new MyDoubleLinkedNode<T>(null, element, null);
			tail = head;
			numItems++;
		}
		else
		{
			MyDoubleLinkedNode<T> oldTail = tail;
			tail = new MyDoubleLinkedNode<T>(oldTail, element, null);
			oldTail.setRight(tail);
			numItems++;
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){
		if(numItems > 1)
		{
			tail = tail.getLeft();
			tail.setRight(null);
			numItems--;
		}
		else if(numItems == 1)
		{
			tail = null;
			head = null;
			numItems--;
		}
		else
		{
			System.out.println("ERROR - Queue is empty");
		}
	}
	
}
