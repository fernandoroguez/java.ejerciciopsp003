/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03;

import sun.applet.Main;

/**
 *
 * @author ferna
 * @param <E>
 */
public class MyList<E> {

    private Node<E> firstNode;
    private Node<E> lastNode;
    private Node<E> actualNode;
    int cont=1;
    

    public MyList() {
        this.firstNode = null;
    }

    public void showMyList() {
        Node<E> temporary = this.firstNode;
        while (temporary != null) {

            System.out.println(temporary.getMain().toString());
            temporary = temporary.getNextNode();

        }
    }

    public void finall(){
        actualNode=lastNode;
    }

    public void inicio(){
        actualNode=firstNode;
    }
    public void adelante() {
        actualNode = actualNode.getNextNode();
       // System.out.println(actualNode.getMain().toString());
    }

    public void destruir(){
        firstNode=null;
        actualNode=null;
        lastNode=null;
        cont=1;
    }
    public int getnum(){
        return cont;
    }
    
    public E getmain(){
        return actualNode.main;
    }
    
    public void atras() {
        actualNode = actualNode.getReturnNode();
        //System.out.println(actualNode.getMain().toString());
    }

    public void modificar(E p){
        actualNode.setMain(p);
        actualNode.main=p;
       // System.out.println("Ha modificado");
        
    }
    public boolean esultimo(){
        return actualNode.nextNode==null;
    }
    public boolean esprimero(){
        return actualNode.returnNode==null;
    }
    public void eliminar(){
        if(actualNode==lastNode){
            atras();
            lastNode=actualNode;
            actualNode.setNextNode(null);
        }
        if(actualNode==firstNode){
            adelante();
            firstNode=actualNode;
            actualNode.setReturnNode(null);
        }
        else{
            actualNode.getNextNode().setReturnNode(actualNode.getReturnNode());
            actualNode.getReturnNode().setNextNode(actualNode.getNextNode());
        }
            
        
    }
    
    public void add(E p) {
        Empleado aux;
        aux=(Empleado) p;
        aux.setNum(cont);
        cont++;
        Node<E> newNode = new Node(aux);
        if (firstNode == null) {
            firstNode = newNode;
            lastNode = newNode;
            actualNode = newNode;
        } else {
            newNode.setReturnNode(lastNode);
            lastNode.setNextNode(newNode);
            lastNode = newNode;
        }
    }
    public String actual(){
        return actualNode.getMain().toString();
    }

// Inner class
    public class Node<E> {

        private Node<E> nextNode;
        private Node<E> returnNode;
        E main;
        public Node(E p) {
            this.nextNode = null;
            this.returnNode = null;
            this.main = p;
        }

        public Node<E> getNextNode() {
            return this.nextNode;
        }

        public boolean esultimo(){
            return null==nextNode;
        }
        public boolean esprimero(){
            return null==returnNode;
        }
        
        public void setNextNode(Node<E> nextNode) {
            this.nextNode = nextNode;
        }

        public Node<E> getReturnNode() {
            return this.returnNode;
        }

        public void setReturnNode(Node<E> xe) {
            this.returnNode = xe;
        }

        public E getMain() {
            return main;
        }

        public void setMain(E p) {
            this.main = p;
        }
    }
}
