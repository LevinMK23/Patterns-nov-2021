package com.geekbrains.patterns.arch.part1.registry;

public interface ReportGenerator {

    ReportType getType();

    void generateReportAsync(ReportData reportData);

    HtmlLink generateReportSync(ReportData reportData);

}
