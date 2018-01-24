package com.wu.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Topology {
    @JsonProperty("Free")
    private long free;
    @JsonProperty("Max")
    private long max;
    @JsonProperty("DataCenters")
    private Set<DataCenter> dataCenters;
    @JsonProperty("layouts")
    private Set<Layout> layouts;



    @Override
    public String toString() {
        return "Topology{" +
                "free=" + free +
                ", max=" + max +
                ", layouts=" + layouts +
                '}';
    }
}
