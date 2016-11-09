package com.wth;

import lombok.Data;

/**
 * Created by wangth on 2016/11/9.
 */
@Data
/**
 * 二叉树的节点数据结构
 * @author WWX
 */
public class TreeNode {
  public int key = 0;
  public String data = null;
  public boolean isVisted = false;
  public TreeNode leftChild = null;
  public TreeNode rightChild = null;

  public TreeNode() {
  }

  /**
   * @param key  层序编码
   * @param data 数据域
   */
  public TreeNode(int key, String data) {
    this.key = key;
    this.data = data;
    this.leftChild = null;
    this.rightChild = null;
  }
}