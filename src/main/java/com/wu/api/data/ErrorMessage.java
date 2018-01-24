package com.wu.api.data;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class ErrorMessage {

    private String error;
    private int status;
    private String reason;



    public ErrorMessage(String error) {
        this.error = error;
    }

    public ErrorMessage(String error, int status, String reason) {
        this.error = error;
        this.status = status;
        this.reason = reason;
    }


    @Override
    public String toString() {
        return "ErrorMessage{" +
                "error='" + error + '\'' +
                ", status=" + status +
                ", reason='" + reason + '\'' +
                '}';
    }
}
