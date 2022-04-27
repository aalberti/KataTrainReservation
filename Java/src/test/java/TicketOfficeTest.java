import org.junit.Test;
import service.booking.BookingService;
import service.train.TrainService;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class TicketOfficeTest {
    @Test
    public void reserveSeats() {
        final var trainService = new TrainService();
        final var bookingService = new BookingService();
        final var ticketOffice = new TicketOffice(trainService, bookingService);

        final var reservation = ticketOffice.makeReservation(new ReservationRequest(null, 0));

        assertThat(reservation,
                is(new Reservation(null, null, null)));
    }
}
