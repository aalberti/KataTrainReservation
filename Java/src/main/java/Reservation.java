import java.util.List;

public record Reservation(String trainId, List<Seat> seats, String bookingId) {
}
