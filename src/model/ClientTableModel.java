/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Cliente;

/**
 *
 * @author Alfredo
 */
class ClientTableModel extends AbstractTableModel {

    private final String[] columnNames = {"ID", "DNI", "Nombre", "Apellido", "Teléfono", "Dirección", "Email", "Opción"};
    private List<Cliente> clientes;
    
     public ClientTableModel() {
        this.clientes = new ArrayList<>();
    }
    
     public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
         return clientes.size(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;//To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
     public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
    Cliente cliente = clientes.get(rowIndex);
        switch (columnIndex) {
            case 0: return cliente.getId();
            case 1: return cliente.getCodDocumento();  // Asumimos que codDocumento es el DNI
            case 2: return cliente.getNombre();
            case 3: return cliente.getApellido();
            case 4: return cliente.getTelefono();
            case 5: return cliente.getDireccion();
            case 6: return cliente.getEmail();
            case 7: return "Ver";  // El botón "Ver"
            default: return null;
        }
    }
    
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return columnIndex == 7;  // Solo la columna "Opción" (botón "Ver") es editable
    }
    
}
