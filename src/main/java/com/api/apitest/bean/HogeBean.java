package com.api.apitest.bean;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class HogeBean {
    @JsonProperty("hoge")
    String hoge;

    @JsonProperty("fuga")
    String fuga;
}
