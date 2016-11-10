package com.wth;

import org.junit.Test;

/**
 * Created by wangth on 2016/11/10.
 */
public class SearchTest {
  @Test
  public void test(){
    int[] a = new int[]{12,43,5,7,76,45,90,76,23,67};
    SortMethods.bubbleSort(a);
    SortMethods.print(a);
    System.out.println();
    System.out.print(new BinarySearch().searchLoop(a,76));
  }

}
