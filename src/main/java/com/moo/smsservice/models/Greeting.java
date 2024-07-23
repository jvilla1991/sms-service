package com.moo.smsservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Builder;

@Data
@AllArgsConstructor
@Builder
public class Greeting {

    private long id;

    private String name;

}
