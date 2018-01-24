package com.wu.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Rack {
    @JsonProperty("Free")
    private long free;
    @JsonProperty("Max")
    private long max;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("DataNodes")
    private Set<DataNode> dataNodes;



    @Override
    public String toString() {
        return "Rack{" +
                "free=" + free +
                ", max=" + max +
                ", id='" + id + '\'' +
                ", dataNodes=" + dataNodes +
                '}';
    }
}
