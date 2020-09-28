package entities;

public class DoublyLinkedList {

	private Node first;
		
	
	public Node getFirst() {
		return first;
	}

	//m�todo que adiciona no in�cio
	public void addInicio(String element, Double value) {
		Node newNode = new Node();
		newNode.setElement(element);
		newNode.setValue(value);
		
		if(first == null) {
			first = newNode;
			first.setNext(null);
			first.setPrev(null);
		}else {
			first.setPrev(newNode);
			newNode.setNext(first);
			newNode.setPrev(null);
			first = newNode;
		}
	}
		
	//m�todo que remove o primeiro n�
	public void removePrimeiroNo() {
		if(first==null) {
			System.out.println("N�o h� n�!");
		}else if(first.getNext() != null) {
			first.getNext().setPrev(null);
			first = first.getNext();
		}else {
			first = null;
		}
	}
	
	//m�todo que remove o �ltimo n�
	public void removeUltimoNo() {
		if(first==null) {
			System.out.println("N�o h� n�!");
		}else if(first.getNext() == null && first.getPrev() == null) {
			first = null;
		}else {
			Node currentNode = first;
			while(currentNode.getNext() != null) {
				currentNode = currentNode.getNext();
			}
			currentNode = currentNode.getPrev();
			currentNode.setNext(null);
			
			while(currentNode.getPrev() != null) {
				currentNode = currentNode.getPrev();
			}			
			
			first = currentNode;
		}
		}
	
	
	public Node getLastNode() {
		Node lastNode = new Node();
		Node currentNode = first;
		
		while(currentNode.getNext() != null) {
			currentNode = currentNode.getNext();
		}
		lastNode = currentNode;
		return lastNode;
		
	}
	
	
	public void printList() {
		Node currentNode = first;
		
		if(first==null) {
			System.out.println("A lista est� vazia!!");
		}else {
			System.out.print("\n\nnull");
			while(currentNode.getNext() != null){
				System.out.print("<-["+currentNode.getElement()+"]->");
				currentNode = currentNode.getNext();
			}
			System.out.print("<-["+currentNode.getElement()+"]->");
			System.out.print("null");
		}
	}
	
}
