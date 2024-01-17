import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame{
    final private Font mainFont = new Font("print", Font.BOLD,18);
    JTextField tfNombreProfe;
    JLabel lbBienvenido;

    public void initialize(){
        /*Form Panel */
        JLabel lbNombreProfe = new JLabel("Nombre Profe");
        lbNombreProfe.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5));/*no se que es GridLayout :() */
        formPanel.add(lbNombreProfe);
        formPanel.add(tfNombreProfe);

        /*Welcome Panel */
        /*PREGUNTA: Estos comentarios se usan para separar el codigo o queda mal? A mi me sirve */
        lbBienvenido = new JLabel();
        lbBienvenido.setFont(mainFont);

        JButton btnOk = new JButton("OK");
        btnOk.setFont(mainFont);
        btnOk.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO Auto-generated method stub
                String nombreProfe = lbNombreProfe.getText();
                lbBienvenido.setText("Hola, "+nombreProfe);

            }
            
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BorderLayout());
        buttonPanel.setBackground(new Color(128,128,255));
        buttonPanel.add(formPanel, BorderLayout.NORTH);
        buttonPanel.add(lbBienvenido, BorderLayout.CENTER);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128,128,255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbBienvenido, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);


        add(mainPanel);


        setTitle("Bienvenido");
        setSize(500,600);
        setMinimumSize(new Dimension(300,400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
/* no entiendo algo aqui pero me da verguenza preguntar :c) */
    public static void main(String[] args) {
        MainFrame myFrame = new MainFrame();
        myFrame.initialize();
    }    
}
