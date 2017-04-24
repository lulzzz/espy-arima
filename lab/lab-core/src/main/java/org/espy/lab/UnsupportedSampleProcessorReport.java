package org.espy.lab;

import java.io.PrintWriter;

public class UnsupportedSampleProcessorReport implements TimeSeriesProcessorReport {

    private final String message;

    public UnsupportedSampleProcessorReport(String processorName, TimeSeriesSampleMetadata metadata) {
        this.message = processorName + " doesn't support: " + metadata;
    }

    @Override public void write(PrintWriter writer) {
        writer.write(message);
    }
}