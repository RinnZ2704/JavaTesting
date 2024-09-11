import java.time.LocalTime;

class EventLogger {
    static int eventCount = 0;
    LocalTime eventTime;

    EventLogger() {
        this.eventTime = LocalTime.now();
        eventCount++;
        System.out.println("Su kien xay ra vao luc: " + eventTime);
    }

    static void showEventCount() {
        System.out.println("Tong so su kien da xay ra: " + eventCount);
    }
}

public class Main {
    public static void main(String[] args) {
        new EventLogger();

        new EventLogger();

        new EventLogger();

        EventLogger.showEventCount(); 
    }
}

/*Tạo đối tượng nhưng ko sử dụng ngay. Mục đích của việc tạo đối tượng là để thực hiện 1 công việc cụ thểw (ghi lại thời gian sự kiện). Sau khi hoàn thành việc không cần giữ lại đối tượng để sử dụng tiếp*/
