package MD2.Bai4.BaiTap;

import java.time.Duration;
import java.time.LocalDateTime;

public class StopWatch {
    private LocalDateTime startTime;
    private LocalDateTime endTime;

    public StopWatch() {
    }

    public LocalDateTime start() {
        return this.startTime = LocalDateTime.now();
    }

    public LocalDateTime stop() {
        return this.endTime = LocalDateTime.now();
    }

    public long getElapsedTime() {
        return Duration.between(startTime, endTime).toMillis();
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
