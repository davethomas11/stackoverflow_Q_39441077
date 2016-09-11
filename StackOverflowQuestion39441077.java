public class StackOverflowQuestion39441077 {
	
	public static void main(String[] args) {

		C.D innerD = new C().getD();

		//Prove we can call get Index from class C extends A.B
		System.out.println(innerD.callGetIndex());
	}
}