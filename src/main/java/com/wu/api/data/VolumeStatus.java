package com.wu.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
@Data
@Builder
public class VolumeStatus {
    @JsonProperty("Version")
    private String version;
    @JsonProperty("Volumes")
    private Set<Volume> volumes;



    @Override
    public String toString() {
        return "VolumeStatus{" +
                "version='" + version + '\'' +
                ", volumes=" + volumes +
                '}';
    }
}
