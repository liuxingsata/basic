package com.wth;

import org.junit.Test;

/**
 * Created by wangth on 2016/11/9.
 */
public class SortTest {
  @Test
  public void test(){
    int[] a = new int[]{12,43,5,7,76,45,90,76,23,67};
    System.out.println("*******排序*****************");
    SortMethods.mergeSort(a,0,9);
    System.out.println(a[1]);
  }
}
