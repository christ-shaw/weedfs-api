package com.wu.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
@Data
@Builder
public class DataCenter {
    @JsonProperty("Free")
    private long free;
    @JsonProperty("Max")
    private long max;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Racks")
    private Set<Rack> racks;



    @Override
    public String toString() {
        return "DataCenter{" +
                "free=" + free +
                ", max=" + max +
                ", id='" + id + '\'' +
                ", racks=" + racks +
                '}';
    }
}
