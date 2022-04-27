import org.junit.jupiter.api.Test;
import service.booking.BookingService;
import service.train.TrainService;

import static org.assertj.core.api.Assertions.assertThat;

public class TicketOfficeTest {
    @Test
    public void reserveSeats() {
        final var trainService = new TrainService();
        final var bookingService = new BookingService();
        final var ticketOffice = new TicketOffice(trainService, bookingService);

        final var reservation = ticketOffice.makeReservation(new ReservationRequest(null, 0));

        assertThat(reservation)
                .isEqualTo(new Reservation(null, null, null));
    }
}
