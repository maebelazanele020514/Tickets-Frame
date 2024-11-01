/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ac.za.tut.ticketframe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
/**
 *
 * @author hifi
 */
public class TicketFrame extends JFrame{
//panels
    private JPanel headingPanel;
    private JPanel customerDetailsPanel;
    private JPanel namePanel;
    private JPanel surnamePanel;
    private JPanel ticketDetailsPanel;
    private JPanel homeTeamPanel;
    private JPanel awayTeamPanel;
    private JPanel costPanel;
    private JPanel numberOfTicketsPanel;
    private JPanel totalAmtPanel;
    private JPanel buttonPanel;
    private JPanel ticketsDetailsAndButtonsPanel;
    private JPanel mainPanel;
    
//Labels
    private JLabel headingLabel;
    private JLabel nameLabel;
    private JLabel surnameLabel;
    private JLabel homeTeamLabel;
    private JLabel awayTeamLabel;
    private JLabel costLabel;
    private JLabel numberOfTicketsLabel;
    private JLabel totalAmtLabel;
    
//Text Fields
    private JTextField nameTextField;
    private JTextField surnameTextField;
    private JTextField homeTeamTextField;
    private JTextField awayTeamTextField;
    private JTextField costTextField;
    private JTextField totalAmtTextField;

//scrollbar
    private JSlider slider;
    
//buttons
    private JButton buyButton;
    private JButton clearButton;
    private JButton exitButton;
    
    public TicketFrame() {
        
        //basic frame settings 
        setTitle("Ticket Sales");
        setSize(600,650);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        //create panels
        
        //create heading panel
        headingPanel=new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        //create customer details panel
        customerDetailsPanel=new JPanel(new GridLayout(4,1,1,1));
        customerDetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Customer details"));
        namePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        //create ticket panel
        ticketDetailsPanel=new JPanel (new GridLayout(5,1,1,1));
        ticketDetailsPanel.setBorder(new TitledBorder(new LineBorder(Color.BLUE,2),"Ticket details"));
        homeTeamPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        costPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        numberOfTicketsPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        totalAmtPanel=new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        //create button panel
        buttonPanel=new JPanel(new FlowLayout());
        
        //create ticket+button panel
        ticketsDetailsAndButtonsPanel=new JPanel(new BorderLayout());
        mainPanel=new JPanel(new BorderLayout());
        
        //create Labels
        headingLabel=new JLabel("Soccer Match Tickets");
        headingLabel.setFont(new Font(Font.SERIF, Font.BOLD + Font.ITALIC,25));
        headingLabel.setForeground(Color.CYAN);
        
        nameLabel=new JLabel("Name: ");
        surnameLabel=new JLabel("Surname: ");
        homeTeamLabel=new JLabel("Home team: ");
        awayTeamLabel=new JLabel("Away team: ");
        costLabel=new JLabel("Cost price:R ");
        numberOfTicketsLabel=new JLabel("Number of tickets required: ");
        totalAmtLabel=new JLabel("Total amount due:R ");
        
        //create TextFields 
        nameTextField=new JTextField(15);
        surnameTextField=new JTextField(15);
        homeTeamTextField=new JTextField(15);
        awayTeamTextField=new JTextField(15);
        costTextField=new JTextField(15);
        totalAmtTextField=new JTextField(20);
        totalAmtTextField.setText("To be calculated later.");
        totalAmtTextField.setEditable(false);
        
        //create slider
        slider=new JSlider(1,20);
        
        //create buttons
        buyButton=new JButton("Buy");
        clearButton=new JButton("Clear");
        exitButton=new JButton("Exit");
        
        //add components to panels
        headingPanel.add(headingLabel);
        
        namePanel.add(nameLabel);
        namePanel.add(nameTextField);
        
        surnamePanel.add(surnameLabel);
        surnamePanel.add(surnameTextField);
        
        customerDetailsPanel.add(namePanel);
        customerDetailsPanel.add(surnamePanel);
        
        homeTeamPanel.add(homeTeamLabel);
        homeTeamPanel.add(homeTeamTextField);
        
        awayTeamPanel.add(awayTeamLabel);
        awayTeamPanel.add(awayTeamTextField);
        
        costPanel.add(costLabel);
        costPanel.add(costTextField);
        
        numberOfTicketsPanel.add(numberOfTicketsLabel);
        numberOfTicketsPanel.add(slider);
        
        totalAmtPanel.add(totalAmtLabel);
        totalAmtPanel.add(totalAmtTextField);
        
        ticketDetailsPanel.add(homeTeamPanel);
        ticketDetailsPanel.add(awayTeamPanel);
        ticketDetailsPanel.add(costPanel);
        ticketDetailsPanel.add(numberOfTicketsPanel);
        ticketDetailsPanel.add(totalAmtPanel);
        
        buttonPanel.add(buyButton);
        buttonPanel.add(clearButton);
        buttonPanel.add(exitButton);
        
        ticketsDetailsAndButtonsPanel.add(ticketDetailsPanel, BorderLayout.CENTER);
        ticketsDetailsAndButtonsPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        mainPanel.add(headingPanel,BorderLayout.NORTH);
        mainPanel.add(customerDetailsPanel, BorderLayout.CENTER);
        mainPanel.add(ticketsDetailsAndButtonsPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        pack();
        setVisible(true);
        
    }
    
    
}
