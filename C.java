public class C extends A
{

	public class D extends A.B {
    	//can now call getIndex()
		 public Integer callGetIndex() {
		 	return getIndex();
		 }

    }
     
    public D getD() {
    	return new D();
    }
 }