package com.wu.api.data;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReplicaPlacement {

    @JsonProperty("SameRackCount")
    private long sameRackCount;
    @JsonProperty("DiffRackCount")
    private long diffRackCount;
    @JsonProperty("DiffDataCenterCount")
    private long diffDataCenterCount;


    @Override
    public String toString() {
        return "ReplicaPlacement{" +
                "sameRackCount=" + sameRackCount +
                ", diffRackCount=" + diffRackCount +
                ", diffDataCenterCount=" + diffDataCenterCount +
                '}';
    }
}
