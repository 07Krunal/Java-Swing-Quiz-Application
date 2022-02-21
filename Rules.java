
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    JButton b1, b2, b3, b4, b5;
    String username;
    
    Rules(String username){
        this.username = username;
        
        setBounds(160, 100, 1200, 650); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
      
//        setBounds(600, 200, 800, 650); 
//        getContentPane().setBackground(Color.WHITE);
//        setLayout(null);
        
        JLabel l1 = new JLabel("Welcome " + username + " to Quizzy");
        l1.setForeground(new Color(30, 144, 255));
        l1.setFont(new Font("Verdana", Font.BOLD, 30));
        l1.setBounds(30, 20, 800, 40);
        add(l1);
        
        JLabel l3 = new JLabel("Choose a Category");
        l3.setForeground(new Color(30, 144, 255));
        l3.setFont(new Font("Verdana", Font.BOLD, 28));
        l3.setBounds(750, 60, 500, 40);
        add(l3);
        
        JLabel l2 = new JLabel("");
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setBounds(50, 80,600, 460);
        l2.setText(
            "<html>"+ 
                "1. Select the category from the given options on &nbsp left side" + "<br><br>" +
                "2. Each &nbsp category has 10 questions from  easy to hard level" + "<br><br>" +
                "3. Each Question has 4 options and one of &nbsp them is correct" + "<br><br>" +
                "4. Each question has a timer of 15 sec running on top part" + "<br><br>" +
                "5. You can use one Lifeline in case of emergency ( 50 -50)" + "<br><br>" +
                "6. Answer is auto submitted if next button is &nbsp not pressed " + "<br><br>" +
                "7. Brace yourself, and give your best in the coming 5 mins" + "<br><br><br>" +
                "&nbsp &nbsp &nbsp &nbsp  Best of Luck!! &nbsp SELECT OPTION TO BEGIN" + "<br><br>" +
            "<html>"
        );
        add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(150, 530, 170, 30);
        b1.setBackground(new Color(30, 144, 255));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("C++");
        b2.setBounds(800, 170, 200, 50);
        b2.setBackground(new Color(30, 144, 255));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Java");
        b3.setBounds(800, 270, 200, 50);
        b3.setBackground(new Color(30, 144, 255));
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        add(b3);
        
        b4 = new JButton("SQL");
        b4.setBounds(800, 370, 200, 50);
        b4.setBackground(new Color(30, 144, 255));
        b4.setForeground(Color.WHITE);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("HTML");
        b5.setBounds(800, 470, 200, 50);
        b5.setBackground(new Color(30, 144, 255));
        b5.setForeground(Color.WHITE);
        b5.addActionListener(this);
        add(b5);
        
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Cplusplus(username).setVisible(true);
        }
        else if(ae.getSource() == b3){
            this.setVisible(false);
            new Java1(username).setVisible(true);
        }
        else if(ae.getSource() == b4){
            this.setVisible(false);
            new SQL(username).setVisible(true);
        }
        else if(ae.getSource() == b5){
            this.setVisible(false);
            new HTML(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    }
}