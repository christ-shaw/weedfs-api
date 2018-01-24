package com.wu.api.data;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Grow {
    private long count;


    @Override
    public String toString() {
        return "Grow{" +
                "count=" + count +
                '}';
    }
}
