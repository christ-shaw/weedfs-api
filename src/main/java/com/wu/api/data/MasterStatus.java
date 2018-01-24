package com.wu.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MasterStatus {
    @JsonProperty("Topology")
    private Topology topology;
    @JsonProperty("Version")
    private String version;



    @Override
    public String toString() {
        return "Dir{" +
                "topology=" + topology +
                ", version='" + version + '\'' +
                '}';
    }
}
