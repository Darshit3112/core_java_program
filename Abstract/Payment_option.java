package Abstract;

class creditcardpayment implements Payment
{
	@Override
	public void payment_type() 
	{
		 System.out.println("creditcard");
	}
}
class PaypalPayment implements Payment
{

	@Override
	public void payment_type() 
	{	
		System.out.println("paypal");
	}
	
}
class UpiPayment implements Payment
{

	@Override
	public void payment_type() 
	{	
		System.out.println("upi");
	}
	
}
public class Payment_option 
{
	public static void main(String[] args) 
	{
		creditcardpayment c=new creditcardpayment();
		PaypalPayment p=new PaypalPayment();
		UpiPayment u=new UpiPayment();
		
		c.payment_type();
		p.payment_type();
		u.payment_type();
	}
}