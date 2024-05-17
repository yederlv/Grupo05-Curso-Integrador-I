/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.ClienteDAO;
import model.Cliente;
import view.MainView;

import java.util.List;

/**
 *
 * @author Yeder LV
 */
public class MainController {
    private ClienteDAO clienteDAO;
    private MainView view;

    public MainController(ClienteDAO clienteDAO, MainView view) {
        this.clienteDAO = clienteDAO;
        this.view = view;
        initView();
    }

    private void initView() {
        // Inicializa la vista y agrega listeners
        view.getAddButton().addActionListener(e -> addCliente());
        view.getLoadButton().addActionListener(e -> loadClientes());
    }

    private void addCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre(view.getNombreField().getText());
        cliente.setDireccion(view.getDireccionField().getText());
        cliente.setTelefono(view.getTelefonoField().getText());
        clienteDAO.addCliente(cliente);
        loadClientes();
    }

    private void loadClientes() {
        List<Cliente> clientes = clienteDAO.getAllClientes();
        view.updateClienteTable(clientes);
    }

    // Otros métodos de control
}