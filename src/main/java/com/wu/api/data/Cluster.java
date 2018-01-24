package com.wu.api.data;



import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Cluster {
    @JsonProperty(value = "Leader")
    private String leader;
    @JsonProperty(value = "Peers")
    private Set<String> peers;



    @Override
    public String toString() {
        return "Cluster{" +
                "leader='" + leader + '\'' +
                ", peers=" + peers +
                '}';
    }
}
