/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gephi.statistics;

import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.data.xy.XYSeries;
/**
 *
 * @author u114236
 */
public class ReportData {
    private String reportHtml;
    private XYSeriesCollection seriesCollection;
    
    public ReportData(String reportHtml) {
        this.reportHtml = reportHtml;
        this.seriesCollection = new XYSeriesCollection();
    }
    
    public ReportData(String reportHtml, XYSeries series) {
        this.reportHtml = reportHtml;
        this.seriesCollection = new XYSeriesCollection();
        this.addXYSeries(series);
    }
    
    public void addXYSeries(XYSeries series) {
        this.seriesCollection.addSeries(series);
    }
    
    public String getReportHtml() {
        return this.reportHtml;
    }
    
    private String returnCSV(XYSeries series) {
        String csv = "x;y\n";
        for (int i = 0; i < series.getItems().size(); i++) {
            csv += series.getX(i) + ";" + series.getY(i) + "\n";
        }
        return csv;
    }
}
