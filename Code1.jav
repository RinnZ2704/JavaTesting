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
