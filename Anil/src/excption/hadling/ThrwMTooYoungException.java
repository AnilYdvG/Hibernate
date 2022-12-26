package excption.hadling;

public class ThrwMTooYoungException extends RuntimeException 
													//custom Exception is unchecked exception,and RE is also Unchecked
//													compiler will never check whether the Exception is handled or not
{
	ThrwMTooYoungException(String Message)
	{
		super(Message);
	}
}
class ThrwTooOldException extends RuntimeException
{
	String message;
	ThrwTooOldException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}
