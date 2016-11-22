package recursiveSortingPackage;

import org.junit.Test;
import static org.junit.Assert.*;

public class SelectionSortTest {
    
    public SelectionSortTest() {
    }

    @Test
    public void testSelectionSortNull() {
        System.out.println( "selectionSort" );
        int[] list = null;
        SelectionSort.selectionSort( list );
        // check at list er sorteret
        boolean res = isSorted( list );
        assertTrue( res );
    }

    //@Test
    public void testSelectionSortThreeElements() {
        System.out.println( "selectionSort" );
        int[] list = {5, 9, 1};
        SelectionSort.selectionSort( list );
        // check at list er sorteret
        boolean res = isSorted( list );
        assertTrue( res );
    }
    
    @Test
    public void testSelectionSortOneElement() {
        System.out.println( "selectionSort" );
        int[] list = {5};
        SelectionSort.selectionSort( list );
        // check at list er sorteret
        boolean res = isSorted( list );
        assertTrue( res );
    }
    private boolean isSorted( int[] list ) {
        if ( list == null) return true;
        for(int index = 0; index<list.length-1;index++){
            if ( list[index] > list[index+1]) return false;
        }
        return true;
    }
    
}
