/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afleurdeuxpots802.widgets;

import afleurdeuxpots802.model.Product;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author fabien
 */
public class PageThumbnail extends javax.swing.JPanel {
    
    JLabel[] jLabels;
    /**
     * Creates new form PageThumbnail
     */
    public PageThumbnail() {
        initComponents();
        jLabels = new JLabel[8];
    }
    
    public void setAsNext() {
        jLabels[0] = jLabel1;
        jLabels[1] = jLabel2;
        jLabels[2] = jLabel3;
        jLabels[3] = jLabel4;
        jLabels[4] = jLabel5;
        jLabels[5] = jLabel6;
        jLabels[6] = jLabel7;
        jLabels[7] = jLabel8;
    }
    
    public void setAsPrev() {
        jLabels[0] = jLabel2;
        jLabels[1] = jLabel3;
        jLabels[2] = jLabel4;
        jLabels[3] = jLabel5;
        jLabels[4] = jLabel6;
        jLabels[5] = jLabel7;
        jLabels[6] = jLabel8;
        jLabels[7] = jLabel9;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)))
                .addGap(0, 35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(0, 24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

    void setThumbnail(int i, Product product) {
        //JLabel[] jLabels = {jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8};
        JLabel imgLabel = jLabels[i];
        if(product != null) {
            ImageIcon icon0 = new ImageIcon(product.getImagePath());
            ImageIcon icon = new ImageIcon(icon0.getImage().getScaledInstance(40, 40,  java.awt.Image.SCALE_SMOOTH));
            imgLabel.setText("");
            imgLabel.setIcon(icon);
            setVisible(true);
        } else {
            setVisible(false);
        }
        
    }

    void setNextPageNumber(int nbNextPages) {
        jLabel9.setText(Integer.toString(nbNextPages));
    }
    
    void setPrevPageNumber(int nbPrevPages) {
        jLabel1.setText(Integer.toString(nbPrevPages));
    }
}
