package com.geekbrains.patterns.creators.builder;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Dto {
    private final int x;
    private final String s;
}
