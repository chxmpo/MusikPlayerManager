package views;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.table.TableRowSorter;


public class PlaylistPanel extends JPanel {
    private JTable table;
    private DefaultTableModel model;
    private JButton btnAdd, btnRemove, btnSave;  //mehrere gleichzeitig damit weniger code


    public JButton getBtnAdd() {
        return btnAdd;
    }

    public void setBtnAdd(JButton btnAdd) {
        this.btnAdd = btnAdd;
    }

    public JButton getBtnRemove() {
        return btnRemove;
    }

    public void setBtnRemove(JButton btnRemove) {
        this.btnRemove = btnRemove;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public void setBtnSave(JButton btnSave) {
        this.btnSave = btnSave;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public void setModel(DefaultTableModel model) {
        this.model = model;
    }

    public JTable getTable() {
        return table;
    }

    public void setTable(JTable table) {
        this.table = table;
    }

    public PlaylistPanel(){
        setLayout(new BorderLayout());

        //Tabellen Format
        model = new DefaultTableModel(new Object[]{"Titel", "Künstler"}, 0);
        table = new JTable(model);
        add(new JScrollPane(table), BorderLayout.CENTER);

        //Sortierfunktion
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(model);
        table.setRowSorter(sorter);

        //Button Layout
        JPanel buttonPanel = new JPanel();
        btnAdd = new JButton("Song hinzufügen");
        btnRemove = new JButton("Song löschen");
        btnSave = new JButton("Speichern");
        buttonPanel.add(btnAdd);
        buttonPanel.add(btnRemove);
        buttonPanel.add(btnSave);

        add(buttonPanel, BorderLayout.SOUTH);
    }
}
