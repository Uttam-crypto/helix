package tech.codingclub.helix.entity;

public class TimeApi {

    private String time_str;
    private Long epoch_time;

    public TimeApi(String timeStr, Long epochTime){
        time_str = timeStr;
        epoch_time = epochTime;
    }
}
