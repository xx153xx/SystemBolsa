/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemBolsa;

/**
 *
 * @author derp_
 */
public class HomeBroker extends javax.swing.JInternalFrame {

    /**
     * Creates new form HomeBroker
     */
    public HomeBroker() {
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

        jpnBroker = new javax.swing.JPanel();
        menuBroker = new javax.swing.JMenuBar();
        menuComprar = new javax.swing.JMenu();
        menuComprar02 = new javax.swing.JMenuItem();
        menuVender = new javax.swing.JMenu();
        menuVender02 = new javax.swing.JMenuItem();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Home Broker");

        jpnBroker.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jpnBrokerLayout = new javax.swing.GroupLayout(jpnBroker);
        jpnBroker.setLayout(jpnBrokerLayout);
        jpnBrokerLayout.setHorizontalGroup(
            jpnBrokerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 632, Short.MAX_VALUE)
        );
        jpnBrokerLayout.setVerticalGroup(
            jpnBrokerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        menuComprar.setText("Comprar");

        menuComprar02.setText("Comprar");
        menuComprar02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuComprar02ActionPerformed(evt);
            }
        });
        menuComprar.add(menuComprar02);

        menuBroker.add(menuComprar);

        menuVender.setText("Vender");

        menuVender02.setText("Vender");
        menuVender02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVender02ActionPerformed(evt);
            }
        });
        menuVender.add(menuVender02);

        menuBroker.add(menuVender);

        setJMenuBar(menuBroker);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBroker, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnBroker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuComprar02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuComprar02ActionPerformed
       Comprar ob = new Comprar();
        jpnBroker.add(ob);
        ob.setVisible(true);
    }//GEN-LAST:event_menuComprar02ActionPerformed

    private void menuVender02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVender02ActionPerformed
       Vender ob = new Vender();
        jpnBroker.add(ob);
        ob.setVisible(true);
    }//GEN-LAST:event_menuVender02ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpnBroker;
    private javax.swing.JMenuBar menuBroker;
    private javax.swing.JMenu menuComprar;
    private javax.swing.JMenuItem menuComprar02;
    private javax.swing.JMenu menuVender;
    private javax.swing.JMenuItem menuVender02;
    // End of variables declaration//GEN-END:variables
}
