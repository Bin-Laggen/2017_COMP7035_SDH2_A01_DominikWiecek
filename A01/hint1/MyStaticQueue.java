package hint1;


public class MyStaticQueue implements MyQueue {
	

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private int items[];
	private int numItems;
	private int maxItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyStaticQueue(int m){
		this.maxItems = m;
		this.items = new int[this.maxItems];
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
			return this.items[0];	
		}	
		else
		{
			System.out.println("ERROR - Queue is empty");
			return this.items[0];
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){
		if(numItems < maxItems)
		{
			this.items[numItems] = element;
			numItems++;
		}
		else
		{
			System.out.println("ERROR - Queue is full");
		}
	}
	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){
		if(numItems > 0)
		{
			int[] tempItems = new int[maxItems];
			for(int i = 1; i < numItems; i++)
			{
				tempItems[i - 1] = items[i];
			}
			this.items = tempItems;
			numItems--;
		}
		else
		{
			System.out.println("ERROR - Queue is empty");
		}
	}
	
}
