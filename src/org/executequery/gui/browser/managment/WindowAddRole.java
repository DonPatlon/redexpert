package org.executequery.gui.browser.managment;

import org.executequery.GUIUtilities;
import org.executequery.gui.browser.UserManagerPanel;

import javax.swing.*;

/**
 * Created by mikhan808 on 15.03.2017.
 */
public class WindowAddRole extends JPanel {
    public WindowAddRole(UserManagerPanel u)
    {
        initComponents();
        ump=u;
    }
    UserManagerPanel ump;
    JTextField nameTextField;
    JButton okButton;
    JLabel jLabel1;
    private void initComponents()
    {
        nameTextField = new JTextField();
        okButton = new JButton();
        jLabel1 = new JLabel();
        jLabel1.setText("Name");
        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(null);
        //layout.setHorizontalGroup();
        okButton.setSize(50,20);
        okButton.setLocation(50,100);
        jLabel1.setSize(50,25);
        jLabel1.setLocation(50,50);
        nameTextField.setSize(500,25);
        nameTextField.setLocation(100,50);
        this.add(okButton);
        this.add(jLabel1);
        this.add(nameTextField);

    }
    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)
    {
        ump.addRole(nameTextField.getText());
        GUIUtilities.closeSelectedTab();
    }
}