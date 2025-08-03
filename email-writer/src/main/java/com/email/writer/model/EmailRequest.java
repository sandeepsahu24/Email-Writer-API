package com.email.writer.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailRequest {
    private String content;
    private String tone;

    @Override
    public String toString() {
        return "EmailBody{" +
                "content='" + content + '\'' +
                ", tone='" + tone + '\'' +
                '}';
    }
}
