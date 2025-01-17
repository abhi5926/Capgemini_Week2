public class MovieTicket {
    // Attributes to hold movie details
    private String movieName;
    private String seatNumber;
    private double price;

    // Constructor to initialize the movie ticket with the movie name
    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Not Booked";  // Initially, no seat is assigned
        this.price = 0.0;  // Initially, price is 0 until ticket is booked
    }

    // Method to book a ticket: assigns a seat and updates the price
    public void bookTicket(String seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully for movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    // Method to display the ticket details
    public void displayTicketDetails() {
       
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        // Example usage
        // Create a new MovieTicket object for a specific movie
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");

        // Display ticket details before booking
        ticket.displayTicketDetails();

        // Book a ticket: assign seat number and price
        ticket.bookTicket("A5", 15.50);

        // Display ticket details after booking
        ticket.displayTicketDetails();
    }
}
