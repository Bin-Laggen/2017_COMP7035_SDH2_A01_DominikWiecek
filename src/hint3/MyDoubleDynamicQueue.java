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
		return head.getInfo();
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByFirst 
	//-------------------------------------------------------------------
	public void addByFirst(T element){
		if(numItems == 0)
		{
			head = new MyDoubleLinkedNode<T>(null, element, tail);
			tail = new MyDoubleLinkedNode<T>(head, element, null);
			numItems++;
		}
		else
		{
			System.out.println(head);
			MyDoubleLinkedNode<T> currentNode = head;
			currentNode.setLeft(head);
			head = new MyDoubleLinkedNode<T>(null, element, currentNode);
			numItems++;
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByFirst(){
		if(numItems > 0)
		{
			System.out.println(head.getRight());
			MyDoubleLinkedNode<T> nextNode = head.getRight();
			nextNode.setLeft(head);
			head.setInfo(nextNode.getInfo());
			head.setRight(nextNode.getRight());
			head.setLeft(null);
			
			numItems--;
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: last
	//-------------------------------------------------------------------
	public T last(){
		return tail.getInfo();
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: addByLast 
	//-------------------------------------------------------------------
	public void addByLast(T element){
		if(numItems == 0)
		{
			head = new MyDoubleLinkedNode<T>(null, element, tail);
			tail = new MyDoubleLinkedNode<T>(head, element, null);
			numItems++;
		}
		else
		{
			MyDoubleLinkedNode<T> currentNode = tail;
			currentNode.setRight(tail);
			tail = new MyDoubleLinkedNode<T>(currentNode, element, null);
			numItems++;
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: removeByFirst 
	//-------------------------------------------------------------------	
	public void removeByLast(){
		if(numItems > 0)
		{
			numItems--;
		}
	}
	
}
