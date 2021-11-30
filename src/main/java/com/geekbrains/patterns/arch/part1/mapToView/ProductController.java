package com.geekbrains.patterns.arch.part1.mapToView;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ProductController {

//    private ProductViewMapper mapper = new ProductViewMapper();
//
//    public List<ProductView> getProducts(
//            String nameForSearch,
//            Long minPrice,
//            Long maxPrice
//    ) {
//        List<Product> products = productService.setProducts(
//                nameForSearch, maxPrice, minPrice);
//        Set<Long> productIds = products.stream()
//                .map(Product::getId)
//                .collect(Collectors.toSet());
//        Map<Long, String> urls = imageRepository.getImagesUrl(productIds);
//
//        return products.stream()
//                .map(product -> mapper.map(product, urls.get(product.getId())))
//                .collect(Collectors.toList());
//    }

}
