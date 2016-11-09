package com.wth;

import org.junit.Test;

/**
 * Created by wangth on 2016/11/9.
 */
public class TreeTest {
  @Test
  public void test(){
    BinaryTree bt = new BinaryTree();
    bt.createBinTree(bt.root);
    System.out.println("the size of the tree is " + bt.size());
    System.out.println("the height of the tree is " + bt.height());

    System.out.println("*******(前序遍历)[ABDECF]遍历*****************");
    bt.preOrder(bt.root);

    System.out.println("*******(中序遍历)[DBEACF]遍历*****************");
    bt.inOrder(bt.root);

    System.out.println("*******(后序遍历)[DEBFCA]遍历*****************");
    bt.postOrder(bt.root);

    System.out.println("***非递归实现****(前序遍历)[ABDECF]遍历*****************");
    bt.nonRecPreOrder(bt.root);

    System.out.println("***非递归实现****(中序遍历)[DBEACF]遍历*****************");
    bt.nonRecInOrder(bt.root);

    System.out.println("***非递归实现****(后序遍历)[DEBFCA]遍历*****************");
    bt.noRecPostOrder(bt.root);
  }
}
