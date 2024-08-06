package day23.wrapperCollection;

public class WrapperClassDemo {

	public static void main(String[] args) {
		int a=10;  //primitive
		System.out.println("Primtive A " +a);
		
		Integer iobj=new Integer(a);
		System.out.println("Non Primtive iobj "+iobj);
		
		int b=iobj.intValue();
		System.out.println("Primtive B " +b);
		
		
		double x=10.1;
		Double dobj=new Double(x);
	    double y=dobj.doubleValue();
	    
	    System.out.println("Primtive X " +x);
	
		System.out.println("Non Primtive dobj "+dobj);
		
		System.out.println("Primtive Y " +y);
		
		
		int n=123;
		String s1=String.valueOf(n);
		System.out.println(s1.length());
		
		String s2="987";
		String s3="111";
		System.out.println(s2+s3);
		int z=Integer.parseInt(s2);
		int k=Integer.parseInt(s3);
		System.out.println(z+k);
		

	}

}
