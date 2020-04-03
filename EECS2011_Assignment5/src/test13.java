public class test13
{

   public static void main( String [ ] args )
   {
	int i;

	int numItems = 64;
    HeapPriorityQueue< Integer, Integer > h1 = new
	HeapPriorityQueue< Integer, Integer >( );
    
    for( i = 37; i != 0; i = ( i + 37 ) % numItems )
        h1.insert( i, i );	
    h1.printHeap();		
	
	for( i = 1; i <= numItems * 3/4; i++ )
	    h1.removeMin();
    h1.printHeap();		// 1/4 of the heap is left

   }  // end main

}  // end class
