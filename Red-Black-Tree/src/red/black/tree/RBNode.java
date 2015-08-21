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
public class RBNode {
    private int data; 
    RBNode rightChild;
    RBNode leftChild;
    private boolean isRed = false;

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public boolean isIsRed() {
        return isRed;
    }

    public void setIsRed(boolean isRed) {
        this.isRed = isRed;
    }
    
}
