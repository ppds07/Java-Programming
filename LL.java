package dsa;

public class LL {
	
	private Node head; //init first node
	private Node tail; //init last node
	private int size; //calculate size of ll by the time of insertion
	
	public LL()
	{
		this.size = 0;
	}
	
	//****************************** insert at first *******************************
	public void insertFirst(int val)  //insert at the very first node
	{
		Node node = new Node(val);  //creation of node to be added
		node.next = head; //changing the next of added node to head
		head=node; //changing the head to point the new added node
		
		if(tail == null)  //exception case for no tail
		{
			tail = head;
		}
		size = size+1;  //adds every insertion as a counter
	}
	//****************************** insert at last *******************************
	public void insertAtLast(int val) //insert as the very last node
	{
		Node node = new Node(val); //creation of added node
				
		if(tail == null)  //exception case for no tail
		{
			insertFirst(val);  //basically means no ll so added as head 
		}
		else { //added as if tail is found
		tail.next = node;   //point the current tail to added node
		tail = node;  //make the tail to point the added node
		size = size+1; //you know -_-
		}	
	}
	//**************************insert at any index *********************************
	public void insert(int val, int index) { // insertion at any given index
		if(index == 0)  //exception case as addition at very start
		{
			insertFirst(val);
			return;
		}
		if(index >= size)  //exception case as addition at the very last
		{
			insertAtLast(val);
			return;
		}
		
		//actual code
		
		Node temp = head; 
		for(int i=1;i<index;i++)  //traverse till the (desired index-1)
		{
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);  //create a new node with the next to point temp,next
		temp.next = node;  // make the actual next of temp to point added node
		size++; //-_-
		
	}
	
	// ************************* deletion at start***************************
	public int deleteAtStart() 
	{

		if(head == null) //exception case if there is no node in LL
		{
			tail = null;
			return -1;
		}
		int vall = head.value;  // extract value of the head
		head = head.next;  //let the head point next node
		if(head == null)  //exception case if there is only one node, so need to reset tail too
		{
			tail = null;
		}
		size--;
		return vall;
	}
	
	
	// ************************* deletion at end***************************
	public int deleteAtEnd()
	{
		if(head == null) //if there is no node in LL
		{
			tail = null;
			return -1;
		}
		
		Node temp = head;  //node creation for traversal
		for(int i=1;i<size-1;i++)
		{
			temp = temp.next;
		}
		if(head.next == null) //exception case: if there is only one node in LL, then remove the node and point every thing to null
		{
			int val = head.value;
			head = null;
			tail = null;
			size--;
			return val;
			
		}
		int vall = temp.next.value;  //usual deletion
		temp.next = null;
		tail = temp;
		size--;
		return vall;
	}
	
	// ************************* deletion at index***************************
	public int deleteAtIndex(int index)
	{
		if(index == 0) //exception if there is no node in LL
		{
			int val = deleteAtStart();
			return val;
		}
		if(index == size-1) //exception if the index is last node
		{
			int val = deleteAtEnd();
			return val;
		}
		if(index >= size)  //exception if index is greater than size
		{
			System.out.print("Index not found ");
			return -1;
		}
		
		Node temp = head;  //usual deletion
		for(int i=1;i<index;i++)  //traversal till (size-1)th node
		{
			temp = temp.next;
		}
		int val = temp.next.value;  //extract the deletion value
		temp.next = temp.next.next;  //point the node to deletion's next node
		return val;
		
	}
	
	//******************** Display the LL ********************************
	public void Display() {  
		Node temp = head; 
		while(temp != null)
		{
			System.out.print(temp.value+"->");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	
	//*****************creation of node**************************
	
	private class Node{  
		private int value; //store node value
		private Node next; //store at which node its going to point
		
		public Node(int value)  //constructor in which only value is needed
		{
			this.value = value;
		}
		
		@SuppressWarnings("unused")
		public Node(int value, Node next) //constructor in which both value and next of the added node is used.
		{
			this.value = value;
			this.next = next;
		}
	}
	
	public static void main(String[] args)
	{
		LL list = new LL();
		list.insertFirst(3);
		list.insertFirst(10);
		list.insertAtLast(13);
		list.insertAtLast(15);
		list.insert(65, 3);
		list.insert(88, 1);
		list.Display();
		int vall = list.deleteAtStart();
		System.out.println(vall);
		list.Display();
		 vall = list.deleteAtEnd();
		System.out.println(vall);
		list.Display();
		vall = list.deleteAtIndex(4);
		System.out.println(vall);
		list.Display();
			
	}
	
}
