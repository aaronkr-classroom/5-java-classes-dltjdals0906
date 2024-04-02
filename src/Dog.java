public class Dog {
	public String breed;
	public String color;
	protected int age;
	private String name;
	
	public void sound() {
		System.out.println("명멍 bow bow ~");
	}
	protected void run() {
		System.out.println("달려라!");
	}
	private void sleep() {
		System.out.println("잘자라!");
	}
}
