package list;

public class stakRunner {

	public static void main(String[] args) {
		stak obj = new stak();
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		obj.show();
		obj.pop();
		obj.pop();
		obj.show();
		obj.peek();
	}

}
