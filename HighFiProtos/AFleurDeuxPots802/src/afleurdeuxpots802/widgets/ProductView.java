/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afleurdeuxpots802.widgets;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author fabien
 */
public class ProductView extends javax.swing.JPanel {

    private static final String PATH_NO_IMAGE = "./ressources/noImage.png";
    /**
     * Creates new form ProductView
     */
    public ProductView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        nbSpinner = new javax.swing.JSpinner();
        addToCartButton = new javax.swing.JButton();
        imgLabel = new javax.swing.JLabel();

        nameLabel.setText("Name");

        priceLabel.setText("0,00 €");

        addToCartButton.setText("Buy");

        imgLabel.setText("IMG");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(priceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nbSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addToCartButton))
                            .addComponent(nameLabel))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(imgLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(priceLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nbSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(addToCartButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void setImage(String path) {
        if(path != null) {
            //ImageIcon icon = new ImageIcon(path);
            ImageIcon icon = new ImageIcon((new ImageIcon(path)).getImage().getScaledInstance(150, 150,  java.awt.Image.SCALE_SMOOTH));
            imgLabel.setText("");
            imgLabel.setIcon(icon);
        } else {
            ImageIcon icon = new ImageIcon(PATH_NO_IMAGE);
            imgLabel.setText("");
            imgLabel.setIcon(icon);
        }
        
        
    }
    
    public void setName(String name) {
        if(name != null) {
            nameLabel.setText(name);
        }
    }
    
    public void setPrice(Double price) {
        if(price != null) {
            priceLabel.setText(price + " €");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addToCartButton;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JSpinner nbSpinner;
    private javax.swing.JLabel priceLabel;
    // End of variables declaration//GEN-END:variables

    void enableBuy(boolean b) {
        this.addToCartButton.setEnabled(b);
    }
}
