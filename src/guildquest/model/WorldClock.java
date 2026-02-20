package guildquest.model;

import java.util.ArrayList;
import java.util.List;

public class WorldClock {
    private WorldTime now = new WorldTime(0);
    private final List<ClockObserver> observers = new ArrayList<>();  // NEW

    public WorldTime now() { return now; }

    public void addObserver(ClockObserver o) { observers.add(o); }   // NEW

    public void advanceMinutes(long minutes) {
        now = now.plusMinutes(minutes);
        for (ClockObserver o : observers) o.onTimeAdvanced(now);      // NEW
    }

    public void set(WorldTime newTime) {
        if (newTime == null) throw new IllegalArgumentException("newTime null");
        now = newTime;
    }
}
