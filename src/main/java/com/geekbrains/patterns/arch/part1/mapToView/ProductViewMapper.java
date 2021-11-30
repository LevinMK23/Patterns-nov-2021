package com.geekbrains.patterns.arch.part1.mapToView;

public class ProductViewMapper {

    public ProductView map(Product product, String url) {
        ProductView view = new ProductView();
        view.setName(product.getName());
        view.setPrice(product.getPrice());
        view.setImageUrl(url);
        return view;
    }

}
