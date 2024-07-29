package vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class EmpleadoTableView extends JFrame {
    private JTable empleadoTable;
    private DefaultTableModel tableModel;
    private JTextField searchField;
    private JButton searchButton;
    private JButton loadAllButton;
    private JButton clearButton;

    public EmpleadoTableView() {
        setTitle("Consulta de Empleados");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el modelo de la tabla
        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Cargo"});

        empleadoTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(empleadoTable);

        add(scrollPane, BorderLayout.CENTER);

        // Crear panel de búsqueda
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());

        searchField = new JTextField(10);
        searchButton = new JButton("Buscar");
        loadAllButton = new JButton("Cargar Todos");
        clearButton = new JButton("Limpiar Búsqueda");

        searchPanel.add(new JLabel("Consultar Cargo:"));
        searchPanel.add(searchField);
        searchPanel.add(searchButton);
        searchPanel.add(loadAllButton);
        searchPanel.add(clearButton);

        add(searchPanel, BorderLayout.NORTH);

        // Añadir action listeners a los botones
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadEmpleadoByCargo();
            }
        });

        loadAllButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadEmpleados();
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearTable();
            }
        });
    }

    private void loadEmpleados() {
        String url = "jdbc:mysql://localhost:3306/supermercado_db";
        String user = "root";
        String password = "root";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String query = "SELECT * FROM empleados";
            ResultSet resultSet = statement.executeQuery(query);

            // Limpiar el modelo de la tabla
            tableModel.setRowCount(0);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String cargo = resultSet.getString("cargo");

                // Añadir los datos a la tabla
                tableModel.addRow(new Object[]{id, nombre, cargo});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void loadEmpleadoByCargo() {
        String url = "jdbc:mysql://localhost:3306/supermercado_db";
        String user = "root";
        String password = "root";
        String cargo = searchField.getText();

        try (Connection connection = DriverManager.getConnection(url, user, password);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM empleados WHERE cargo = ?")) {

            preparedStatement.setString(1, cargo);
            ResultSet resultSet = preparedStatement.executeQuery();

            // Limpiar el modelo de la tabla
            tableModel.setRowCount(0);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String cargoResult = resultSet.getString("cargo");

                // Añadir los datos a la tabla
                tableModel.addRow(new Object[]{id, nombre, cargoResult});
            }

            if (tableModel.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Cargo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void clearTable() {
        tableModel.setRowCount(0);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            EmpleadoTableView view = new EmpleadoTableView();
            view.setVisible(true);
        });
    }
}
