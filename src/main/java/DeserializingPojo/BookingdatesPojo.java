package DeserializingPojo;

public class BookingdatesPojo {
	private String checkin;
	private String checkout;
	
	
	@Override
	public String toString() {
		return "BookingdatesPojo [checkin=" + checkin + ", checkout=" + checkout + "]";
	}
	
	public String getCheckin() {
		return checkin;
	}
	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}
	public String getCheckout() {
		return checkout;
	}
	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}
	

}
