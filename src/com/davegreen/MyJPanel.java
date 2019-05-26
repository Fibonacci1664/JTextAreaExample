package com.davegreen;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel
{
    private JTextArea jTextArea1;
    private JTextArea jTextArea2;
    private JScrollPane jScrollPane1;
    private JScrollPane jScrollPane2;
    private JPanel jPanel;
    private JCheckBox checkBox;
    private String [] listEntries;
    private JList list;
    private JButton button;
    
    public MyJPanel()
    {
        this.jTextArea1 = new JTextArea("This is the initial text", 10, 20);
        this.jTextArea2 = new JTextArea("This is the initial text", 10, 20);
        this.jScrollPane1 = new JScrollPane(jTextArea1);
        this.jPanel = new JPanel();
        this.checkBox = new JCheckBox("Goes to 11.");
        this.listEntries = new String[] {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        this.list = new JList(listEntries);
        this.jScrollPane2 = new JScrollPane(list);
        this.button = new JButton("Click here!");
    }
    
    public JButton getButton()
    {
        return button;
    }
    
    public void setButton(JButton button)
    {
        this.button = button;
    }
    
    public JTextArea getjTextArea1()
    {
        return jTextArea1;
    }
    
    public void setjTextArea1(JTextArea jTextArea1)
    {
        this.jTextArea1 = jTextArea1;
    }
    
    public JTextArea getjTextArea2()
    {
        return jTextArea2;
    }
    
    public void setjTextArea2(JTextArea jTextArea2)
    {
        this.jTextArea2 = jTextArea2;
    }
    
    public JScrollPane getjScrollPane1()
    {
        return jScrollPane1;
    }
    
    public void setjScrollPane1(JScrollPane jScrollPane1)
    {
        this.jScrollPane1 = jScrollPane1;
    }
    
    public JScrollPane getjScrollPane2()
    {
        return jScrollPane2;
    }
    
    public void setjScrollPane2(JScrollPane jScrollPane2)
    {
        this.jScrollPane2 = jScrollPane2;
    }
    
    public String[] getListEntries()
    {
        return listEntries;
    }
    
    public void setListEntries(String[] listEntries)
    {
        this.listEntries = listEntries;
    }
    
    public JList getList()
    {
        return list;
    }
    
    public void setList(JList list)
    {
        this.list = list;
    }
    
    public JPanel getjPanel()
    {
        return jPanel;
    }
    
    public void setjPanel(JPanel jPanel)
    {
        this.jPanel = jPanel;
    }
    
    public JCheckBox getCheckBox()
    {
        return checkBox;
    }
    
    public void setCheckBox(JCheckBox checkBox)
    {
        this.checkBox = checkBox;
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.setColor(Color.blue);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        
        g.setColor(Color.red);
        g.fillOval(100, 100, 200, 100);
    }
}
