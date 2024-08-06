package day18.exceptionhandling;

public class LowQtyException extends Exception
{
private String message;  //"min order quantity is 500 units"
public LowQtyException(String x)
{
	this.message=x;
}

public String getMessage() {
	return this.message;
}


}
