
class HealthMonitor {
    int heartRate = 0;

    public void setHeartRate(int n) {
        heartRate = n;

    }

    public int getHeartRate() {
        return heartRate;
    }

    public int getInstance() {
        return heartRate;
    }
}

public class Solution {
    public static void main(String[] args) {
        HealthMonitor hm = new HealthMonitor();
        hm.setHeartRate(7);
        hm.getInstance();
        hm.getHeartRate();

    }
}
