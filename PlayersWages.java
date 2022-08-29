import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayersWages {
    private JPanel Main;
    private JTextField txtWage;
    private JTextField txtTax;
    private JTextField txtNet;
    private JButton OKButton;
    private JTextField txtPName;

    public static void main(String[] args) {
        JFrame frame = new JFrame("PlayersWages");
        frame.setContentPane(new PlayersWages().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PlayersWages() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double wage = Double.parseDouble(txtWage.getText());
                double tax;
                double salary = wage * 52;
                double netSal;

                if (wage> 20000){
                    tax = salary * 45/100;
                }
                else if (wage > 5000){
                    tax = salary * 25/100;

                }else if(wage > 1000){
                    tax = salary * 5/100;
                }
                else{
                    tax = 0.00;
                }

                txtTax.setText(String.valueOf(tax));
                netSal = salary - tax;
                txtNet.setText(String.valueOf(netSal));




            }
        });
    }
}
