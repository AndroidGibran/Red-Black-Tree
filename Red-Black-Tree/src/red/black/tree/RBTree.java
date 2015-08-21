/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package red.black.tree;

/**
 *
 * @author GibranIqbal
 */
public class RBTree {
   RBNode root;
   
   public void insert(int x){
       System.out.println("new Insertion ="+x); 
      RBNode parent = null;
      RBNode grandParent;
      RBNode current;
      RBNode node = new RBNode();
      node.setData(x);
      node.setIsRed(true);
      if(root==null){
         node.setIsRed(false);
         root = node;
      }
      else {
        
        current = root;
        while(true){
            grandParent = parent;
            if(grandParent!=null)
            System.out.println("GrandParent="+grandParent.getData());
            else
            System.out.println("GrandParent= null");
            parent = current;
           if(x<current.getData()){   //x is less should go left
               current=current.leftChild;   //reach left node
            if(current==null)           // null means no leaf should attach
            {
                if(parent.isIsRed()){
                    System.out.println("LeftChild "+"parent is red");
                    return;
                }
                parent.leftChild = node;    //
                return;
            }      
           }
           else {
               current = current.rightChild;
               if(current==null){
                   if(parent.isIsRed()){
                    System.out.println("RightChild "+"parent is red");
                    return;
                }
              parent.rightChild = node;   
              return;
               }
           } 
              
        }
      }
   }
   private void inOrder(RBNode root){
      if(root==null)
          return;
       inOrder(root.leftChild);
       System.out.println(root.getData());
       inOrder(root.rightChild);
                  
   }
   private void preOrder(RBNode root){
      if(root==null)
          return;
      System.out.println(root.getData());
      
      
       inOrder(root.leftChild);
       inOrder(root.rightChild);
                  
   }
   public void display(){
         inOrder(root); 
   }
}
