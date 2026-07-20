public class TicketReservationSystem {
    private int seats;
    public TicketReservationSystem(int seats) {
        this.seats = seats;
    }
    public synchronized boolean bookingSeats(int tickets) {
        if (tickets <= seats) {
            seats -= tickets;
            return true;
        }
        return false;
    }
}
