/** Simple (minimal) singly-linked list node. */
class Node {
    int data;
    Node next;
    public Node( int data, Node next ) {
        this.data = data;
        this.next = next;
    }
}
 
 
 
/** Linked-list Utility Methods */
public class Intersection {

private static Node head;
 
    /** Adds a new element to the head of a list. */
    public void add( int data ) {
        head = new Node( data, head );
    }
 
    /** Returns a new linked list representing the intersection. */
    public void getIntersection( Node list1, Node list2 ) {
 
         if( list1 == null || list2 == null ) {
				System.out.print("list is sempty" );        }
 
        Node cursor1 = list1;
        Node cursor2 = list2;
 
        while( cursor1 != null && cursor2 != null )
		{
            if( cursor1.data == cursor2.data ) 
			{
				System.out.print(" "+cursor1.data );
					
                cursor1 = cursor1.next;
                cursor2 = cursor2.next;
            } 
			else if( cursor1.data < cursor2.data ) {
                cursor1 = cursor1.next;
            } else {
                cursor2 = cursor2.next;
            }
        }
 
         
    }
 
    /** Prints the linked-list by traversing it backwards (in reverse). */
    public static void printReverse( Node node ) {
        if( node != null ) {
            printReverse( node.next );
            System.out.print( node.data + " " );
        }
    }
 
    /** Test Method */
    public static void main( String[ ] args ) {
 
        // Initialize first list with range [10, 30]
        Intersection list1 = new Intersection( );
        for( int i = 30; i >= 15; i-- ) {
            list1.add( i );
        }
  
	    list1.printReverse( list1.head );
		    System.out.println( );
			
			
		 Intersection list2 = new Intersection( );
        for( int j = 22; j >=15; j-- ) {
            list2.add( j );
        }
  
	    list2.printReverse( list2.head );
		    System.out.println( );
 
					
					
					
 		System.out.println( "intersection list :\n");
		        Intersection listnew = new Intersection( );

        listnew.getIntersection( list1.head, list2.head );
		 
		 
 
        // Print the intersection in reverse in order to view 
        // the entries in ascending order
         ///listnew.printReverse(  listnew.head );
     }
}
