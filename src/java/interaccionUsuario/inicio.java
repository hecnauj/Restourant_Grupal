package interaccionUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inicio {
    private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton Salir;
    private JButton Aceptar;

    public static void main(String[] args) {
        JFrame frame = new JFrame("inicio");
        frame.setContentPane(new inicio().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    JFrame frame = new JFrame("inicio");
    public inicio() {
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
                }else if(textField1.getText().equals(mesero) && passwordField1.getText().equals(pass)){
                    Ventana Mesero = new Ventana();
                    frame.setVisible(false);
                    Mesero.setVisible(true);
                }else{
                    if (textField1.getText().equals("") && passwordField1.getText().equals("") ){
                        JOptionPane.showMessageDialog(null, "Campo vacio");
                    } else{
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
