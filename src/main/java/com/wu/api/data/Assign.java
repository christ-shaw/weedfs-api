package com.wu.api.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Assign {
    String fid;
    String url;
    String publicUrl;
    long count;


    @Override
    public String toString() {
        return "Assign{" +
                "fid='" + fid + '\'' +
                ", url='" + url + '\'' +
                ", publicUrl='" + publicUrl + '\'' +
                ", count=" + count +
                '}';
    }
}
