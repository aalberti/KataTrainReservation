package service.booking;

import java.util.Collection;

public record BookingRequest(String trainId, Collection<String> seatIds, String bookingRef) {
}
