package Pages;

import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import DB.DB;

public class FieldsInformation extends JPanel {

        JPanel MeteoNordPanel4 = new javax.swing.JPanel();
        JPanel jPanel52 = new javax.swing.JPanel();
        JPanel jPanel53 = new javax.swing.JPanel();
        JPanel MeteoCentrePanel3 = new javax.swing.JPanel();
        JPanel jPanel54 = new javax.swing.JPanel();
        JPanel jPanel55 = new javax.swing.JPanel();
        JPanel jPanel55_2 = new javax.swing.JPanel();
        JPanel jPanel37 = new javax.swing.JPanel();

        JLabel jLabel29 = new javax.swing.JLabel();

        JTable jTable1 = new javax.swing.JTable();

        JTable jTable2 = new javax.swing.JTable();

        JScrollPane jScrollPane1 = new javax.swing.JScrollPane();

        JScrollPane jScrollPane12 = new javax.swing.JScrollPane();

        java.awt.GridBagConstraints gridBagConstraints;

        public FieldsInformation() {
                super();
                // Security View

                this.setBackground(new java.awt.Color(0, 102, 102));
                this.setLayout(new java.awt.BorderLayout());

                MeteoNordPanel4.setLayout(new javax.swing.BoxLayout(MeteoNordPanel4, javax.swing.BoxLayout.LINE_AXIS));

                jPanel52.setBackground(new java.awt.Color(153, 153, 153));

                jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel29.setText("Informations sur le champ");

                List<Map<String, Object>> list = DB.getDataFromDB();

                List<Map<String, Object>> list_2 = DB.getDataFromDB_2();

                System.out.println("list");

                System.out.println(list);

                // Add The graphe

                XYSeriesCollection dataset = new XYSeriesCollection();

                var series1 = new XYSeries("Humidité du sol");

                var series2 = new XYSeries("Temperature");

                var series3 = new XYSeries("Humidité de l'air");

                for (int index = 0; index < list.size(); index++) {
                        series1.add((int) list.get(index).get("ID"), (int) list.get(index).get("Soil_Humidity"));
                        series2.add((int) list.get(index).get("ID"), (int) list.get(index).get("Temperatur"));
                        series3.add((int) list.get(index).get("ID"), (int) list.get(index).get("Humidity"));
                }

                // Define dataset_2 for FieldsInformation_2

                XYSeriesCollection dataset_2 = new XYSeriesCollection();

                var series4 = new XYSeries("Niveau deau");

                var series5 = new XYSeries("Gaz");

                var series6 = new XYSeries("Distance");

                for (int index = 0; index < list_2.size(); index++) {
                        series4.add(index, (int) list_2.get(index).get("Water_Level"));
                        series5.add(index, (int) list_2.get(index).get("Gaz"));
                        series6.add(index, (int) list_2.get(index).get("Distance"));
                }

                dataset.addSeries(series1);
                dataset.addSeries(series2);
                dataset.addSeries(series3);
                dataset_2.addSeries(series4);
                dataset_2.addSeries(series5);
                dataset_2.addSeries(series6);

                // Create a chart 1
                JFreeChart lineChart = ChartFactory.createXYLineChart(
                                "Evolution des grandeurs en fonction du temps",
                                "Temps",
                                "Mesure",
                                dataset,
                                PlotOrientation.VERTICAL,
                                true, true, false);

                ChartPanel chartPanel = new ChartPanel(lineChart);

                // Create a chart 2
                JFreeChart lineChart_2 = ChartFactory.createXYLineChart(
                                "Evolution des grandeurs en fonction du temps",
                                "Temps",
                                "Mesure",
                                dataset_2,
                                PlotOrientation.VERTICAL,
                                true, true, false);

                ChartPanel chartPanel_2 = new ChartPanel(lineChart_2);

                jPanel55_2.add(chartPanel);
                jPanel55_2.add(chartPanel_2);
                jPanel54.add(jPanel55_2);

                javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
                jPanel52.setLayout(jPanel52Layout);
                jPanel52Layout.setHorizontalGroup(
                                jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel52Layout.createSequentialGroup()
                                                                .addGap(120, 120, 120)
                                                                .addComponent(jLabel29)
                                                                .addContainerGap(464, Short.MAX_VALUE)));
                jPanel52Layout.setVerticalGroup(
                                jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel52Layout.createSequentialGroup()
                                                                                .addContainerGap(20, Short.MAX_VALUE)
                                                                                .addComponent(jLabel29)
                                                                                .addGap(20, 20, 20)));

                MeteoNordPanel4.add(jPanel52);

                this.add(MeteoNordPanel4, java.awt.BorderLayout.PAGE_START);

                javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
                jPanel53.setLayout(jPanel53Layout);
                jPanel53Layout.setHorizontalGroup(
                                jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 1027, Short.MAX_VALUE));
                jPanel53Layout.setVerticalGroup(
                                jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));

                this.add(jPanel53, java.awt.BorderLayout.PAGE_END);

                MeteoCentrePanel3.setBackground(new java.awt.Color(0, 102, 102));
                MeteoCentrePanel3.setLayout(new java.awt.BorderLayout());

                jPanel54.setBackground(new java.awt.Color(0, 255, 204));
                jPanel54.setLayout(new javax.swing.BoxLayout(jPanel54, javax.swing.BoxLayout.LINE_AXIS));

                jPanel55.setBackground(new java.awt.Color(0, 102, 102));
                jPanel55.setLayout(new java.awt.GridLayout(0, 1, 0, 30));

                jPanel55_2.setBackground(new java.awt.Color(0, 102, 102));
                jPanel55_2.setLayout(new java.awt.GridLayout(0, 1, 0, 30));

                jPanel37.setBackground(new java.awt.Color(102, 255, 102));

                javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
                jPanel37.setLayout(jPanel37Layout);
                jPanel37Layout.setHorizontalGroup(
                                jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 515, Short.MAX_VALUE));
                jPanel37Layout.setVerticalGroup(
                                jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 550, Short.MAX_VALUE));

                jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "ID", "Humidité du sol", "Température", "Humidité de l'air"
                                }));

                jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jTable2.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                },
                                new String[] {
                                                "Niveau d'eau", "Gaz", "Distance"
                                }));

                jScrollPane1.setViewportView(jTable1);

                jScrollPane12.setViewportView(jTable2);

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

                for (Map<String, Object> listItem : list) {
                        Object[] rowData = new Object[listItem.size()];
                        rowData[0] = listItem.get("ID");
                        rowData[1] = listItem.get("Soil_Humidity");
                        rowData[2] = listItem.get("Humidity");
                        rowData[3] = listItem.get("Temperatur");
                        model.addRow(rowData);
                }

                // Add FieldsInformation part 2 to the second table

                DefaultTableModel model_2 = (DefaultTableModel) jTable2.getModel();

                for (Map<String, Object> listItem : list_2) {
                        Object[] rowData = new Object[listItem.size()];

                        rowData[0] = listItem.get("Water_Level");
                        rowData[1] = listItem.get("Gaz");
                        rowData[2] = listItem.get("Distance");

                        model_2.addRow(rowData);
                }

                jPanel55.add(jScrollPane1);
                jPanel55.add(jScrollPane12);

                jPanel54.add(jPanel55);

                MeteoCentrePanel3.add(jPanel54, java.awt.BorderLayout.CENTER);

                this.add(MeteoCentrePanel3, java.awt.BorderLayout.CENTER);
        }

}
