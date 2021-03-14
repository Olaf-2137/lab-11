package sample;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;



public class Main
{
    public static void main(String[] args)
    {
        //okno i koordynaty
        JFrame window = new JFrame("Celsjusze na farenchaity");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(700, 300);
        window.setLocationRelativeTo(null);
        window.setLayout(null);
        JLabel cel = new JLabel("Celsjusze");
        cel.setBounds(220, 40, 100, 30);
        window.add(cel);
        JLabel wyn = new JLabel("Wynik");
        wyn.setBounds(70, 150, 200, 40);
        window.add(wyn);
        JTextField temp = new JTextField();
        temp.setBounds(340, 40, 160, 30);
        window.add(temp);
        JButton button = new JButton("Przeliczanie");
        button.setBounds(340, 80, 150, 40);
        window.add(button);
        button.addActionListener(new ActionListener()


            //void z blokiem obliczeń
                                 {
                                     public void actionPerformed(ActionEvent event)
                                     {
                                         String dane = temp.getText();
                                         Integer.parseInt(dane);
                                         double wynik = (Integer.parseInt(dane) * 1.8 + 32);
                                         wyn.setText(dane + " Celsjusza  =" + wynik + " Farenhaita ");

                                     }
                                 }
        );
        window.setVisible(true);
    }
}
