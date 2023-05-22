package com.captcha_task.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

//Lombok annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CaptchaDto {

    boolean success;
    @JsonProperty("challenge_ts")
    LocalDateTime challengeTs;
    String hostname;
    @JsonProperty("error-codes")
    List<String> errorCodes;
}
