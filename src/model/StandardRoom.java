package model;

public class StandardRoom extends Room {
    public StandardRoom(String roomNumber, boolean isBooked) {
        super(roomNumber, isBooked);
    }

    @Override
    public double getPrice() {
        return 10;
    }
}

