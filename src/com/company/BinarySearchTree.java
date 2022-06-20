package com.company;

import com.company.nodes.linkedlist.Node;

import java.util.Scanner;

public class BinarySearchTree {
        public static int getHeight(Node root){

            Node current = root;

            int leftEdges = 0;
            int rightEdges = 0;

            while (current.left != null) {
                //   System.out.println(current.data);
                leftEdges++;
                current = current.left;
            }

            current = root;

            while (current.right != null) {
                //   System.out.println(current.data);
                rightEdges++;
                current = current.right;
            }

            return leftEdges > rightEdges ? leftEdges : rightEdges;
        }

        /*
        public class Solution {

    public static void main(String[] args) {
        //Read input from STDIN.
        //Print output to STDOUT.

       Scanner scan = new Scanner(System.in);
       int root = scan.nextInt();
      //h = log2(n+1) - 1
      double h = ((Math.log10(root + 1)/Math.log(2)) - 1) * 10;
      System.out.println(Math.round(h));
    }
    }
         */

    public static Node insert(Node root, int data){
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
        int height=getHeight(root);
        System.out.println(height);
    }
}
