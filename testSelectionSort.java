package testSelectionSort;


import java.util.Arrays;

import org.junit.jupiter.api.Test;
public class testSelectionSort {

	@Test
	public void test() {
	testPositive();
	testNegatives();
	testMixed();
	testDuplicates();
	}
    SelectionSort sort = new SelectionSort();

    public void testPositive(){
        int[] arr = new int[]{13,1,7,11,2};
        int[] res = new int[]{1,2,7,11,13};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,res));
    }

    public void testNegatives(){
        int[] arr = new int[]{-18,-12,-4,-10,-6,-8,-2};
        int[] res = new int[]{-18,-12,-10,-8,-6,-4,-2};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,res));
    }

    public void testMixed(){
        int[] arr = new int[]{-28,-14,7,-5,3,9};
        int[] res = new int[]{-28,-14,-5,3,7,9};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,res));
    }

    public void testDuplicates(){
        int[] arr = new int[]{-4,-30,5,15,-4,15,-45,15,3};
        int[] res = new int[]{-45,-30,-4,-4,3,5,15,15,15};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,res));
    }
}
