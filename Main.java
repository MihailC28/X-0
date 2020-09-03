import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    JFrame window = new JFrame("Main Menu");
    JPanel menu = new JPanel();

    JButton play = new JButton("PLAY");
    JButton quit = new JButton("QUIT");

    JLabel title = new JLabel("X&0");



    public void CreateMainMenu(){
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setVisible(true);
        window.setSize(1024, 768);

        window.add(menu);

        menu.setBackground(Color.decode("#383838"));
        menu.setLayout(null);
        menu.add(play);
        menu.add(title);
        menu.add(quit);




        play.setBounds(402, 200, 220, 60);
        play.setFont(new Font("Verdana", Font.PLAIN, 24));
        play.setForeground(Color.white);
        play.setBackground(Color.decode("#9c9c9c"));

        title.setBounds(480, 80, 180, 60);
        title.setFont(new Font("Verdana", Font.BOLD, 30));
        title.setForeground(Color.white);

        quit.setBounds(402, 350, 220, 60);
        quit.setFont(new Font("Verdana", Font.PLAIN, 24));
        quit.setForeground(Color.white);
        quit.setBackground(Color.decode("#9c9c9c"));

        play.addActionListener(this);
        quit.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == play) {
            Play();
        }
        if (e.getSource() == quit){
            window.dispose();
        }
    }

    public void Play(){
        window.setVisible(false);
        Game game = new Game();
        game.CreateWindow();
        game.CreateButtons();
    }

    public static void main(String[] args) {
        Main menu = new Main();
        menu.CreateMainMenu();

    }

}
