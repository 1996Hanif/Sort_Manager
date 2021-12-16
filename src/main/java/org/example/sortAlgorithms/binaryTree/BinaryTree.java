package org.example.sortAlgorithms.binaryTree;

import org.example.sortAlgorithms.Sorter;

import java.util.ArrayList;

public class BinaryTree implements Sorter {
    private Node rootNode;
    public ArrayList<Integer> sortedList = new ArrayList<>();

    public ArrayList<Integer> sorter(ArrayList<Integer> listOfRandomNumbers) {
        //adds to Binary Tree
        addElements(listOfRandomNumbers);
        //returns the binary tree in a sorted list
        getAllNodesValues(rootNode);
        return sortedList;
    }

    //findAllNodes: find all nodes under the node given
    private void getAllNodesValues(Node node){

        //recursion used to find the all child's childs
        if  (!node.isLeftChildEmpty()) {
            getAllNodesValues(node.getLeftChild());
        }
        sortedList.add(node.getValue());
        if  (!node.isRightChildEmpty())
            getAllNodesValues(node.getRightChild());
    }
    //addElements: adding an array of nodes to the tree
    private void addElements(ArrayList<Integer> elements) {
        rootNode = new Node(elements.get(0));
        for (int i = 1; i < elements.size(); i++)
            addNodeToTree(rootNode, elements.get(i));
    }
    //addNodeToTree: placing the node within the tree
    private void addNodeToTree(Node node, int element){
        if (element <= node.getValue()){
            if (node.isLeftChildEmpty())
                //places node to tree if left child is empty
                node.setLeftChild(new Node(element));
            else
                addNodeToTree(node.getLeftChild(), element);
        }
        else if (element>node.getValue()) {
            if (node.isRightChildEmpty())
                //places node to tree if right child is empty
                node.setRightChild(new Node(element));
            else
                addNodeToTree(node.getRightChild(), element);
        }
    }


}
