public class test12
{

   public static void main( String [ ] args )
   {
	int i;

	int numItems = 32;
    HeapPriorityQueue< Integer, Integer > h1 = new
	HeapPriorityQueue< Integer, Integer >( );
    
    for( i = 37; i != 0; i = ( i + 37 ) % numItems )
        h1.insert( i, i );	
    h1.printHeap();		
	
	for( i = 1; i <= numItems/2; i++ )
	    h1.removeMin();
    h1.printHeap();		// 1/2 of the heap is left

   }  // end main

}  // end class
