package excption.hadling;

public class CustInSufficientFundException extends RuntimeException
{
//	String Message;
	
	public CustInSufficientFundException(String Message) 
	{
//		this.Message = Message;
		super(Message);
	}
//	public String getMessage()
//	{
//		return Message;
//	}
}
