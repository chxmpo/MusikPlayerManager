package views;

import javax.swing.*;
import java.awt.*;

public class SongDialog extends JDialog {
    private JTextField txtTitle, txtArtist;
    private JButton btnOK, btnCancel;
    private boolean confirmed = false;


    public JButton getBtnOK() {
        return btnOK;
    }

    public void setBtnOK(JButton btnOK) {
        this.btnOK = btnOK;
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public boolean isConfirmed() {
        return confirmed;
    }

    public void setConfirmed(boolean confirmed) {
        this.confirmed = confirmed;
    }

    public JTextField getTxtArtist() {
        return txtArtist;
    }

    public void setTxtArtist(JTextField txtArtist) {
        this.txtArtist = txtArtist;
    }

    public JTextField getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(JTextField txtTitle) {
        this.txtTitle = txtTitle;
    }

    public SongDialog(JFrame parent){
        super(parent, "Neuen Song hinzufügen", true);
        setSize(300,150);
        setLocationRelativeTo(parent);
        setLayout(new GridLayout(3,2,10,10));

        add(new JLabel("Titel: "));
        txtTitle = new JTextField();
        add(txtTitle);

        add(new JLabel("Künstler: "));
        txtArtist = new JTextField();
        add(txtArtist);

        btnOK = new JButton("OK");
        btnCancel = new JButton("Abbrechen");
        add(btnOK);
        add(btnCancel);

        // Wenn OK gedrückt wurde:
        btnOK.addActionListener(e -> {
            // Erst prüfen, ob Felder leer sind
            if (txtTitle.getText().trim().isEmpty() || txtArtist.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Bitte beide Felder ausfüllen!");
                return;
            }
            confirmed = true;
            setVisible(false);
        });
        btnCancel.addActionListener(e -> setVisible(false));
    }

    public String getTitleInput(){
        return txtTitle.getText();
    }

    public String getArtistInput() {
        return txtArtist.getText();
    }
}
