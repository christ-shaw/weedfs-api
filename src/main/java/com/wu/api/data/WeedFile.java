package com.wu.api.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WeedFile {
    private String name;
    private long size;



    @Override
    public String toString() {
        return "WeedFile{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
