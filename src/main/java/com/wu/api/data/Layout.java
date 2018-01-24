package com.wu.api.data;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class Layout {
    private String collection;
    private String replication;
    private Set<Integer> writables;



    @Override
    public String toString() {
        return "Layout{" +
                "collection='" + collection + '\'' +
                ", replication='" + replication + '\'' +
                ", writables=" + writables +
                '}';
    }
}
