package validadorCPF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interface extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	public JButton botao1;
	public JButton botao2;

	public Interface() {
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(420, 220);
		this.setTitle("Programa de validar CPF");
		botao1 = new JButton();
		botao2 = new JButton();
		criarBotoes();
	}

	public void criarBotoes() {
		this.add(botao1);
		botao1.setSize(120, 80);
		botao1.setLocation(50, 60);
		botao1.setText("Validar CPF");
		this.add(botao2);
		botao2.setSize(120, 80);
		botao2.setLocation(220, 60);
		botao2.setText("Sair");
		apertarBotao();

	}

	public static void main(String args[]) {
		new Interface();
	}

	public void apertarBotao() {
		botao1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				Validador validar = new Validador();
				String temp = null;
				temp = JOptionPane.showInputDialog("Insira o CPF:");
				boolean testador = false;
				try {
					testador = validar.validarCpf(temp);
				} catch (TamanhoSuperiorException e) {
					JOptionPane.showMessageDialog(null, e.getMessage());
					testador = false;
				}
				if (testador == true) {
					JOptionPane.showMessageDialog(null, "CPF válido");
				}
			}
		});
		botao2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	public void actionPerformed(ActionEvent e) {

	}
}
