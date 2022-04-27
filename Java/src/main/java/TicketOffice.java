import service.booking.BookingService;
import service.train.TrainService;

public class TicketOffice {
    private final TrainService trainService;
    private final BookingService bookingService;

    public TicketOffice(TrainService trainService, BookingService bookingService) {
        this.trainService = trainService;
        this.bookingService = bookingService;
    }

    public Reservation makeReservation(ReservationRequest request) {
		//TODO: implement this code!
		return null;
    }

}