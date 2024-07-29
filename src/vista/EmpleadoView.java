package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EmpleadoView extends JFrame {
    private JTextField cargoField = new JTextField(20);
    private JButton buscarButton = new JButton("Buscar");
    private JTextArea resultArea = new JTextArea(10, 30);

    public EmpleadoView() {
        setTitle("Consulta de Empleados");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        add(new JLabel("Cargo:"));
        add(cargoField);
        add(buscarButton);
        add(new JScrollPane(resultArea));
    }

    public String getCargo() {
        return cargoField.getText();
    }

    public void setResultado(String texto) {
        resultArea.setText(texto);
    }

    public void addBuscarListener(ActionListener listenForBuscarButton) {
        buscarButton.addActionListener(listenForBuscarButton);
    }
}

