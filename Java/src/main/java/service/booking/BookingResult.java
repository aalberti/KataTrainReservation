package service.booking;

import java.util.Collection;

public interface BookingResult {
    record OK() implements BookingResult {}
    record AlreadyReserved(Collection<String> alreadyReservedSeats) implements BookingResult {}
}
