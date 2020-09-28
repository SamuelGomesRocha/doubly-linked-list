package entities;

public class Node {
	
	private String element;
	private Double value;
	private Node next;
	private Node prev;
	
	public String getElement() {
		return element;
	}
	public void setElement(String element) {
		this.element = element;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public Node getPrev() {
		return prev;
	}
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	
}
