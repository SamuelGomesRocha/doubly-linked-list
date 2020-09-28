package application;

import entities.DoublyLinkedList;

public class Program {

	public static void main(String[] args) {
		
		DoublyLinkedList list1 = new DoublyLinkedList();
		DoublyLinkedList list2 = new DoublyLinkedList();
		
		list1.addInicio("pc", 100.00);
		list1.printList();
		list1.addInicio("casa", 300.00);
		list1.printList();
		list1.addInicio("carro", 600.00);
		list1.printList();
		list1.addInicio("geladeira", 500.00);
		list1.printList();
//		list2.addInicio("cadeira", 400.00);
//		list2.addInicio("laptop", 200.00);
//		
//		linkedList(list1, list2).printList();;
//		System.out.println("\n--------------");
//		linkedList(list1, list2).removeUltimoNo();
//		
//		linkedList(list1, list2).printList();;
//		
//		
		list1.removeUltimoNo();
		list1.printList();
		
		
		
		
	}

	
	//método que encadeira duas listas circulares duplamente encadeadas
	public static DoublyLinkedList linkedList(DoublyLinkedList list1, DoublyLinkedList list2) {
		list1.getLastNode().setNext(list2.getFirst());
		list2.getFirst().setPrev(list1.getLastNode());
		
		return list1;
	}
	
	
}
