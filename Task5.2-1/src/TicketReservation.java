public class TicketReservation implements Runnable {
    private final TicketReservationSystem customer;
    private final int id;

    public TicketReservation(TicketReservationSystem customer, int id) {
        this.customer = customer;
        this.id = id;
    }
    public void run() {
        int tickets = (int) ((Math.random() * 4) + 1);
        if (customer.bookingSeats(tickets)) {
            System.out.println("Customer " + id + " reserved " + tickets + " tickets");
        }
        else {
            System.out.println("Customer " + id + " couldn't reserve " + tickets + " tickets.");
        }
    }
}
