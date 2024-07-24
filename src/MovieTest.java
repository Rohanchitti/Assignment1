

class Movies
{
	private String movieName;
	private double price;
	private String movieCategory;
	private String language;
	private int movieTickets;
	private int bookingTicket;
	public String getMovieprice;
	public String getBookingDetails;
	public String getPric;

	public void setMovieName(String movieName) {
		this.movieName=movieName;
	}

	public void setPrice(double price) {
		this.price=price;
	}

	public void setMovieCategory(String movieCategory) {
		this.movieCategory=movieCategory;
	}

	public void setMovieLanguage(String language) {
		this.language=language;
	}

	public void setAvailableTickets(int movieTickets) {
		this.movieTickets=movieTickets;
	}

	public void setBookingTicket(int bookingTicket) {
		this.bookingTicket=bookingTicket;
	}

	public String getMovieName() {
		return movieName;
	}

	public double getPrice() {
		return price;
	}

	public String getMovieCategory() {
		return movieCategory;
	}

	public String getMovieLanguage() {
		return language;
	}

	public int getAvailableTickets() {
		return movieTickets;
	}

	public int getBookingTicket() {
		return bookingTicket;
	}

	public double getTotalPrice() {
		return price*bookingTicket;
	}

	public int getFinalAvailableTkts() {
		return movieTickets-bookingTicket;
	}
}

class MovieTest 
{
	public static void main(String[] args) 
	{
		Movies movie1 = new Movies();
		movie1.setMovieName("Despicable 4");
		movie1.setMovieCategory("Cartoon");
		movie1.setMovieLanguage("English");
		movie1.setPrice(300.55);
		movie1.setAvailableTickets(30);
		movie1.setBookingTicket(3);

		System.out.println("Movie Name: "+movie1.getMovieName());
		System.out.println("Movie Category: "+movie1.getMovieCategory());
		System.out.println("Movie Language: "+movie1.getMovieLanguage());
		System.out.println("Movie Price: "+movie1.getPrice());
		System.out.println("Available Movie Tickets: "+movie1.getAvailableTickets());
		System.out.println("No. of Tickets booking: "+movie1.getBookingTicket());
		System.out.println("Total price: "+movie1.getTotalPrice());
		System.out.println("Final Available Movie Tickets: "+movie1.getFinalAvailableTkts());
	}
}


