package model;

public class DeluxeRoom extends Room {
    public DeluxeRoom(String roomNumber, boolean isBooked) {
        super(roomNumber, isBooked);
    }

    @Override
    public double getPrice() {
        return 50;
    }
}

