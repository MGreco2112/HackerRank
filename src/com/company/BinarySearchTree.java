package com.company;

import com.company.nodes.linkedlist.Node;

import java.util.Scanner;

public class BinarySearchTree {
    public static int getHeight(Node root){
        boolean finished = false;

        Node leftTrav = root;
        Node rightTrav = root;

        int leftBranchCount = 0;
        int rightBranchCount = 0;

        do {
            if (leftTrav.left != null) {
                leftBranchCount++;
                leftTrav = leftTrav.left;
            } else if (leftTrav.right != null) {
                leftBranchCount++;
                leftTrav = leftTrav.right;
            }

            if (rightTrav.right != null) {
                rightBranchCount++;
                rightTrav = rightTrav.right;
            } else if (rightTrav.left != null){
                rightBranchCount++;
                rightTrav = rightTrav.left;
            }

            if (leftTrav.left == null
                    && leftTrav.right == null
                    && rightTrav.right == null
                    && rightTrav.left == null) {
                finished = true;
            }

        } while (!finished);

        return leftBranchCount >= rightBranchCount
                ?
                leftBranchCount
                :
                rightBranchCount;
    }

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
