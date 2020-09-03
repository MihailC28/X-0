import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game implements ActionListener {
    public static int a[][] = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
    public static boolean winX = false;
    public static boolean win0 = false;

    public static int i = 0;


    int numberOfX = 1;
    int numberOf0 = 0;

    public static JLabel turn = new JLabel("Turn:X");
    public static JLabel winner = new JLabel("");


    JFrame window = new JFrame("X&0");
    JPanel mainP = new JPanel();
    JPanel board = new JPanel();
    JLabel title = new JLabel("X&0");

    JButton bt1 = new JButton();
    JButton bt2 = new JButton();
    JButton bt3 = new JButton();
    JButton bt4 = new JButton();
    JButton bt5 = new JButton();
    JButton bt6 = new JButton();
    JButton bt7 = new JButton();
    JButton bt8 = new JButton();
    JButton bt9 = new JButton();

    JButton again = new JButton("Reload");

    public void CreateWindow(){
        window.setSize(1024, 768);
        window.setVisible(true);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.add(mainP);

        mainP.setBackground(Color.decode("#383838"));
        mainP.add(board);
        mainP.setLayout(null);
        mainP.add(title);
        mainP.add(turn);
        mainP.add(winner);
        mainP.add(again);


        title.setBounds(477,0, 100, 100);
        title.setFont(new Font("Verdana", Font.PLAIN, 24));
        title.setForeground(Color.white);

        turn.setBounds(20,150, 100, 100);
        turn.setFont(new Font("Verdana", Font.PLAIN, 15));
        turn.setForeground(Color.white);

        winner.setBounds(460,30, 120, 120);
        winner.setFont(new Font("Verdana", Font.PLAIN, 22));
        winner.setForeground(Color.white);


        board.setBounds(212, 110, 600, 600);
        board.setLayout(null);
        //board.setBackground(Color.decode("#757575"));

    }

    public void CreateButtons(){


        bt1.setBounds(0, 0, 200, 200);
        board.add(bt1);
        bt2.setBounds(200, 0, 200, 200);
        board.add(bt2);
        bt3.setBounds(400, 0, 200, 200);
        board.add(bt3);
        bt4.setBounds(0, 200, 200, 200);
        board.add(bt4);
        bt5.setBounds(200, 200, 200, 200);
        board.add(bt5);
        bt6.setBounds(400, 200, 200, 200);
        board.add(bt6);
        bt7.setBounds(0, 400, 200, 200);
        board.add(bt7);
        bt8.setBounds(200, 400, 200, 200);
        board.add(bt8);
        bt9.setBounds(400, 400, 200, 200);
        board.add(bt9);

        bt1.setBackground(Color.white);
        bt2.setBackground(Color.white);
        bt3.setBackground(Color.white);
        bt4.setBackground(Color.white);
        bt5.setBackground(Color.white);
        bt6.setBackground(Color.white);
        bt7.setBackground(Color.white);
        bt8.setBackground(Color.white);
        bt9.setBackground(Color.white);

        bt1.setFont(new Font("Verdana", Font.BOLD, 30));
        bt2.setFont(new Font("Verdana", Font.BOLD, 30));
        bt3.setFont(new Font("Verdana", Font.BOLD, 30));
        bt4.setFont(new Font("Verdana", Font.BOLD, 30));
        bt5.setFont(new Font("Verdana", Font.BOLD, 30));
        bt6.setFont(new Font("Verdana", Font.BOLD, 30));
        bt7.setFont(new Font("Verdana", Font.BOLD, 30));
        bt8.setFont(new Font("Verdana", Font.BOLD, 30));
        bt9.setFont(new Font("Verdana", Font.BOLD, 30));

        bt1.addActionListener(this);
        bt2.addActionListener(this);
        bt3.addActionListener(this);
        bt4.addActionListener(this);
        bt5.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt9.addActionListener(this);

        again.setBackground(Color.decode("#9c9c9c"));
        again.setFont(new Font("Verdana", Font.BOLD, 17));
        again.addActionListener(this);
        again.setBounds(840, 0, 150, 50);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bt1) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt1.setText("X");
                    a[0][0] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt1.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt1.setText("0");
                    a[0][0] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt1.setEnabled(false);
                }

        }
        if(e.getSource() == bt2) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt2.setText("X");
                    a[0][1] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt2.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt2.setText("0");
                    a[0][1] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt2.setEnabled(false);
                }

        }
        if(e.getSource() == bt3) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt3.setText("X");
                    a[0][2] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt3.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt3.setText("0");
                    a[0][2] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt3.setEnabled(false);
                }

        }
        if(e.getSource() == bt4) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt4.setText("X");
                    a[1][0] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt4.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt4.setText("0");
                    a[1][0] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt4.setEnabled(false);
                }

        }
        if(e.getSource() == bt5) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt5.setText("X");
                    a[1][1] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt5.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt5.setText("0");
                    a[1][1] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt5.setEnabled(false);
                }

        }
        if(e.getSource() == bt6) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt6.setText("X");
                    a[1][2] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt6.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt6.setText("0");
                    a[1][2] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt6.setEnabled(false);
                }

        }
        if(e.getSource() == bt7) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt7.setText("X");
                    a[2][0] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt7.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt7.setText("0");
                    a[2][0] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt7.setEnabled(false);
                }

        }
        if(e.getSource() == bt8) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt8.setText("X");
                    a[2][1] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt8.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt8.setText("0");
                    a[2][1] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt8.setEnabled(false);
                }

        }
        if(e.getSource() == bt9) {
            if (i < 9 && !win0 && !winX)
                if (i % 2 == 0) {
                    turn.setText("Turn:0");
                    //x turn
                    bt9.setText("X");
                    a[2][2] = 1;
                    winX = CheckForWinner(numberOfX);
                    bt9.setEnabled(false);



                } else {
                    turn.setText("Turn:X");
                    //0 turn
                    bt9.setText("0");
                    a[2][2] = 0;
                    win0 = CheckForWinner(numberOf0);
                    bt9.setEnabled(false);
                }

        }


        i++;
        if (winX == true) {
            winner.setText("Winner:X");
        }else if(win0 == true){
            winner.setText("Winner:0");
        }else if(i >= 9){
            winner.setText("--Draw--");
        }

        if(e.getSource() == again){

            a[0][0] = -1;
            a[0][1] = -1;
            a[0][2] = -1;
            a[1][0] = -1;
            a[1][1] = -1;
            a[1][2] = -1;
            a[2][0] = -1;
            a[2][1] = -1;
            a[2][2] = -1;

            winX = false;
            win0 = false;
            i = 0;
            numberOfX = 1;
            numberOf0 = 0;

            turn.setText("Turn:X");
            winner.setText(" ");

            bt1.setText(" ");
            bt1.setEnabled(true);

            bt2.setText(" ");
            bt2.setEnabled(true);

            bt3.setText(" ");
            bt3.setEnabled(true);

            bt4.setText(" ");
            bt4.setEnabled(true);

            bt5.setText(" ");
            bt5.setEnabled(true);

            bt6.setText(" ");
            bt6.setEnabled(true);

            bt7.setText(" ");
            bt7.setEnabled(true);

            bt8.setText(" ");
            bt8.setEnabled(true);

            bt9.setText(" ");
            bt9.setEnabled(true);

        }

    }




    public static boolean CheckForWinner(int m){
        //winner winner chicken dinner
        if (a[0][0] == a[0][1] && a[0][1] == a[0][2] && a[0][2] == m) {
            return true;
        }
        if (a[1][0] == a[1][1] && a[1][1] == a[1][2] && a[1][2] == m) {
            return true;
        }
        if (a[2][0] == a[2][1] && a[2][1] == a[2][2] && a[2][2] == m) {
            return true;
        }
        if (a[0][0] == a[1][0] && a[1][0] == a[2][0] && a[2][0] == m) {
            return true;
        }
        if (a[0][1] == a[1][1] && a[1][1] == a[2][1] && a[2][1] == m) {
            return true;
        }
        if (a[0][2] == a[1][2] && a[1][2] == a[2][2] && a[2][2] == m) {
            return true;
        }
        if (a[0][0] == a[1][1] && a[1][1] == a[2][2] && a[2][2] == m) {
            return true;
        }
        if (a[0][2] == a[1][1] && a[1][1] == a[2][0] && a[2][0] == m) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {



            Game TicTacToe = new Game();



    }
}
