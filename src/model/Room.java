//Tạo 1 Constructor
//Tạo Getter Setter cho 2 thuộc tính (Để phục vụ Encapsulation do đã để private --> Cần phương thức Getter & Setter để lấy dữ liệu)
//Phương thức TRỪU TƯỢNG để tính giá của từng phòng
//Tất cả class cần tạo constructor --> Tạo constructor ở Class con, sử dụng được thuộc tính của class cha
//1 class & object khác nhau ở structure --> Structure in Java = ? --> Create a constructor? --> Tìm hiểu cách tạo 1 Constructor
//Các class còn lại, thường hay hạng sang tất cả đều phải tạo getPrice()

package model;

public abstract class Room {
    private String roomNumber;
    private boolean isBooked;

    public Room(String roomNumber, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.isBooked = isBooked;
    }

    //Phương thức TRỪU TƯỢNG để tính giá của từng phòng
    public abstract double getPrice();

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }
}