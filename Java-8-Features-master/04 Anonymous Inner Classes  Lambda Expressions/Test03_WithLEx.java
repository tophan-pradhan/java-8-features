//Test03_WithLEx.java

class Test03_WithLEx {

	public static void main(String[] args) {

		Thread t = new Thread(() -> {
			for (int i=1; i<10; i++) {
				System.out.println("Child Thread");
			}
		});
		t.start();
		for (int i=1; i<10; i++) {
			System.out.println("Main Thread");
		}
	}
}
