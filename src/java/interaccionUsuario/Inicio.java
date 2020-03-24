package interaccionUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Inicio {
    private JTextField textField1;
    private JPanel panel1;
    private JPasswordField passwordField1;
    private JButton Salir;
    private JButton Aceptar;



    public void inicio() {
        JFrame vi=new JFrame("inicio");
        vi.setContentPane(new Inicio().panel1);
        vi.setLocationRelativeTo(null);
        vi.setFocusable(true);
        vi.pack();
        vi.setVisible(true);
    }

    public Inicio() {
        JFrame frame = new JFrame("inicio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        Aceptar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String administrador = "Administrador";
                String passad = "Administrador";
                String mesero = "Mesero";
                String pass = "Pass";
                if (textField1.getText().equals(administrador) && passwordField1.getText().equals(passad)) {
                    Ventana ventanaDatos = new Ventana();
                    frame.setVisible(false);
                    ventanaDatos.setVisible(true);
                } else if (textField1.getText().equals(mesero) && passwordField1.getText().equals(pass)) {
                    Ventana Mesero = new Ventana();
                    frame.setVisible(false);
                    Mesero.iniciar_Vista_Mesas();
                } else {
                    if (textField1.getText().equals("") && passwordField1.getText().equals("")) {
                        JOptionPane.showMessageDialog(null, "Campo vacio");
                    } else {
                        JOptionPane.showMessageDialog(null, "Usuario y/o contraseña incorrecta");
                    }
                }
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        passwordField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


}
