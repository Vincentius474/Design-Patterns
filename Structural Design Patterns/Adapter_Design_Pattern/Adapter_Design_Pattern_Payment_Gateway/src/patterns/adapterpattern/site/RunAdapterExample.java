package patterns.adapterpattern.site;

import patterns.adapterpattern.payd.PayD;
import patterns.adapterpattern.xpay.Xpay;

public class RunAdapterExample {

	public static void main(String[] args) {

		// Object for Xpay
		Xpay xpay = new XpayImpl();
		xpay.setCreditCardNo("4789565874102365");
		xpay.setCustomerName("Max Warner");
		xpay.setCardExpMonth("09");
		xpay.setCardExpYear("25");
		xpay.setCardCVV((short)235);
		xpay.setAmount(2565.23);
		
		PayD payD = new XpayToPayDAdapter(xpay);
		testPayD(payD);
	}
	
	private static void testPayD(PayD objPayD) {
		System.out.println(objPayD.getCardOwnerName());
		System.out.println(objPayD.getCustCardNo());
		System.out.println(objPayD.getCardExpMonthDate());
		System.out.println(objPayD.getCVVNo());
		System.out.println(objPayD.getTotalAmount());
	}

}
