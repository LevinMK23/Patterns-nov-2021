package com.geekbrains.patterns.arch.part1.registry;

// @Configuration
public class GeneratorsConfig {

    // @Bean
    public GeneratorsRegistry getGeneratorsRegistry(
            ReportGenerator a,
            ReportGenerator b,
            ReportGenerator c
    ) {
        GeneratorsRegistry registry = new GeneratorsRegistry();
        return registry.registerGenerator(a)
                .registerGenerator(b)
                .registerGenerator(c);
    }

}
