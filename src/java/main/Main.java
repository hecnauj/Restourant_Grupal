package main;
import interaccionUsuario.Inicio;
import javax.swing.*;

public class Main{
	JFrame frame = new JFrame("Inicio");

	public static void main(String[] aArgs) {
		Inicio vl = new Inicio();
		vl.inicio();
	}
}