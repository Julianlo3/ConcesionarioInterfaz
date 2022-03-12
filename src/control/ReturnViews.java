/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class ReturnViews {
    public JInternalFrame returnInternal(JPanel panel, String text)
    {
        JInternalFrame interno = new JInternalFrame(text);
        interno.add(panel);
        interno.setClosable(true);
        interno.pack();
        interno.setVisible(true);
        return interno;
    }
}
