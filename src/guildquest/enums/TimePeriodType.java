package guildquest.enums;

public enum TimePeriodType {
    DAY(1440L),
    WEEK(10080L),
    MONTH(43200L),
    YEAR(525600L);

    private final long spanMinutes;

    TimePeriodType(long spanMinutes) {
        this.spanMinutes = spanMinutes;
    }

    public long spanMinutes() {
        return spanMinutes;
    }
}
