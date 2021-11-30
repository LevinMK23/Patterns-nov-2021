package com.geekbrains.patterns.arch.part1.registry;

import java.util.HashMap;

public class GeneratorsRegistry {

    private final HashMap<ReportType, ReportGenerator> registry;

    public GeneratorsRegistry(ReportGenerator... generators) {
        registry = new HashMap<>();
        for (ReportGenerator generator : generators) {
            registry.put(generator.getType(), generator);
        }
    }

    public GeneratorsRegistry registerGenerator(ReportGenerator generator) {
        registry.put(generator.getType(), generator);
        return this;
    }

    public ReportGenerator getGenerator(ReportType type) {
        return registry.get(type);
    }

}
