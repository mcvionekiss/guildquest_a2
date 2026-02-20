// guildquest/model/ClockObserver.java
package guildquest.model;

public interface ClockObserver {
    void onTimeAdvanced(WorldTime newTime);
}