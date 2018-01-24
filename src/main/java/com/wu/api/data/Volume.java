package com.wu.api.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.util.Map;
@Data
@Builder
public class Volume {
    @JsonProperty("Id")
    private long id;
    @JsonProperty("Size")
    private long size;
    @JsonProperty("ReplicaPlacement")
    private ReplicaPlacement replicaPlacement;
    @JsonProperty("Ttl")
    private Map<String, String> ttl;
    @JsonProperty("Collection")
    private String collection;
    @JsonProperty("Version")
    private long version;
    @JsonProperty("FileCount")
    private long fileCount;
    @JsonProperty("DeleteCount")
    private long deleteCount;
    @JsonProperty("DeletedByteCount")
    private long deletedByteCount;
    @JsonProperty("ReadOnly")
    private boolean readOnly;


    @Override
    public String toString() {
        return "Volume{" +
                "id=" + id +
                ", size=" + size +
                ", replicaPlacement=" + replicaPlacement +
                ", ttl=" + ttl +
                ", collection='" + collection + '\'' +
                ", version=" + version +
                ", fileCount=" + fileCount +
                ", deleteCount=" + deleteCount +
                ", deletedByteCount=" + deletedByteCount +
                ", readOnly=" + readOnly +
                '}';
    }
}
