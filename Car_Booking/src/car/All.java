package car;

public class All {
	private BookingDetails[] bookingdetails;
	private PaymentDetails[] paymentdetails;
	private TimeSheet[] timesheet;
	private Locations[] locations;
	public void setBookingdetails(BookingDetails[] bookingdetails)
	{
		this.bookingdetails=bookingdetails;
	}
	public BookingDetails[] getbookingdetails()
	{
		return bookingdetails;
	}
	public void setPaymentdetails(PaymentDetails[] paymentdetails)
	{
		this.paymentdetails=paymentdetails;
	}
	public PaymentDetails[] getpaymentdetails()
	{
		return paymentdetails;
	}
	public void setTimesheet(TimeSheet[] timesheet)
	{
		this.timesheet=timesheet;
	}
	public TimeSheet[] gettimesheet()
	{
		return timesheet;
	}
	public void setLocations(Locations[] locations)
	{
		this.locations=locations;
	}
	public Locations[] getlocations()
	{
		return locations;
	}
	public void dis()
	{
			for(BookingDetails bd: bookingdetails)
			{
				System.out.println("--------------booking details--------------");
				System.out.println(bd.getBid());
				System.out.println(bd.getBdate());
				System.out.println(bd.getVnum());
				System.out.println(bd.getVname());
			}
			for(PaymentDetails pd: paymentdetails)
			{
				System.out.println("--------------payment details-------------");
				System.out.println(pd.getWithdriver());
				System.out.println(pd.getWithoutdriver());
			}
			for(TimeSheet ts: timesheet)
			{
				System.out.println("---------------timesheet details-----------");
				System.out.println(ts.getBdate());
				System.out.println(ts.getDays());
			}
			for(Locations l: locations)
			{
				System.out.println("---------------locations---------------------");
				System.out.println(l.getFrom());
				System.out.println(l.getTo());
			}
			}
	}