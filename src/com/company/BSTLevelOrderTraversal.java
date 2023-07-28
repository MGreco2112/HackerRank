package com.company;

import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class BSTLevelOrderTraversal {

    class Solution{

        static void levelOrder(Node root){
            Queue<Node> nodeQueue = (Queue<Node>) new LinkedList();

            nodeQueue.add(root);

            do {
                Node pointer = nodeQueue.remove();

                if (pointer.left != null) {
                    nodeQueue.add(pointer.left);
                }
                if (pointer.right != null) {
                    nodeQueue.add(pointer.right);
                }

                System.out.print(pointer.data + " ");
            } while (!nodeQueue.isEmpty());

        }

        public static Node insert(Node root,int data){
            if(root==null){
                return new Node(data);
            }
            else{
                Node cur;
                if(data<=root.data){
                    cur=insert(root.left,data);
                    root.left=cur;
                }
                else{
                    cur=insert(root.right,data);
                    root.right=cur;
                }
                return root;
            }
        }
        public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        }
    }
}
