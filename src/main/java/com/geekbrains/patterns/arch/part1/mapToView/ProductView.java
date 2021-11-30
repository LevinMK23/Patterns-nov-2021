package com.geekbrains.patterns.arch.part1.mapToView;

import lombok.Data;

// @ApiModel
@Data
public class ProductView {

    private String name;
    private Long price;
    private String imageUrl;

}
