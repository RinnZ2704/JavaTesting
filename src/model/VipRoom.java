package model;

public class VipRoom extends Room {
    public VipRoom(String roomNumber, boolean isBooked) {
        super(roomNumber, isBooked);
    }

    @Override
    public double getPrice() { //
        return 100;
    }
}

