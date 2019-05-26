package com.davegreen;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class MyJFrame implements ActionListener, ItemListener, ListSelectionListener                // Here we have implemented the ItemListener as well for the check box.
{
    private MyJPanel myJPanel;
    private JFrame frame;
    
    public MyJFrame()
    {
        this.myJPanel = new MyJPanel();
        this.frame = new JFrame();
    }
    
    public void runMyFrame()
    {
        // LISTENERS
        myJPanel.getButton().addActionListener(this);
        myJPanel.getCheckBox().addItemListener(this);                           // Here we add an ITEM LISTENER for the check box NOT a ACTION LISTENER.
        myJPanel.getList().addListSelectionListener(this);                        // Here we are adding a LIST SELECTION LISTENER for the JList.
        
        // SCROLL PANEL 1
        myJPanel.getjTextArea1().setLineWrap(true);                                                                  // Here we are ensuring that the text will wrap once at
        myJPanel.getjScrollPane1().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);        // the edge.
        myJPanel.getjScrollPane1().setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);    // Here we define the vertical and horizontal scroll bar
                                                                                                                    // policy.
        myJPanel.add(myJPanel.getjScrollPane1());
        myJPanel.getjTextArea1().setText("This is some new text.");
        myJPanel.getjTextArea1().append(", I'm added onto the already existing text.");                          // The append() method adds to the text that is already there
                                                                                                                // without deleting the old text.
        // SCROLL PANEL 2
        myJPanel.getjScrollPane2().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);       // This scroll pane take the JList values, which in turn
        myJPanel.getjScrollPane2().setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);   // is a String [], and displays the vertically.
        myJPanel.add(myJPanel.getjScrollPane2());
        myJPanel.getList().setVisibleRowCount(4);                                                                   // Here we are manually defining how many in the list to
                                                                                                                    // display.
        myJPanel.getList().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);                               // Here we are setting it so as to restrict the user to being
                                                                                                                // able to only select ONE thing at a time.
        
        
        // CHECK BOX
        myJPanel.add(myJPanel.getCheckBox());                                                   // This is a check box being added to the panel.
        myJPanel.getCheckBox().setSelected(true);                                              // Here we are manually hard coding in whether or not the check box is checked.
        myJPanel.getCheckBox().setSelected(false);
        
        
        // FRAME
        frame.add(BorderLayout.SOUTH, myJPanel.getButton());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(myJPanel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    
    public MyJPanel getMyJPanel()
    {
        return myJPanel;
    }
    
    public void setMyJPanel(MyJPanel myJPanel)
    {
        this.myJPanel = myJPanel;
    }
    
    public JFrame getFrame()
    {
        return frame;
    }
    
    public void setFrame(JFrame frame)
    {
        this.frame = frame;
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        myJPanel.getjTextArea1().append("Holy Moly, More and More and More. \n");
    }
    
    @Override
    public void itemStateChanged(ItemEvent e)
    {
        String onOrOff = "Off";
        
        if(myJPanel.getCheckBox().isSelected())
        {
            onOrOff = "On";
        }
    
        System.out.println("Check box is " + onOrOff);
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e)
    {
        if(!e.getValueIsAdjusting())
        {
            String selection = (String) myJPanel.getList().getSelectedValue();              // This prints out the selected value from the list into the console window.
            System.out.println(selection);
        }
    }
}
