package DeserializingPojo;

public class GetBookingPojo {
	private String firstname;
	private String lastname;
	private String totalprice;
	private String depositpaid;
	private BookingdatesPojo bookingdates;
	private String additionalneeds;
	
	
	@Override
	public String toString() {
		return "GetBookingPojo [firstname=" + firstname + ", lastname=" + lastname + ", totalprice=" + totalprice
				+ ", depositpaid=" + depositpaid + ", bookingdates=" + bookingdates + ", additionalneeds="
				+ additionalneeds + "]";
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(String totalprice) {
		this.totalprice = totalprice;
	}
	public String getDepositpaid() {
		return depositpaid;
	}
	public void setDepositpaid(String depositpaid) {
		this.depositpaid = depositpaid;
	}
	public BookingdatesPojo getBookingdates() {
		return bookingdates;
	}
	public void setBookingdates(BookingdatesPojo bookingdates) {
		this.bookingdates = bookingdates;
	}
	public String getAdditionalneeds() {
		return additionalneeds;
	}
	public void setAdditionalneeds(String additionalneeds) {
		this.additionalneeds = additionalneeds;
	}
	
	
	
}
