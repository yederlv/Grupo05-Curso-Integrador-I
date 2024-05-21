
package controller;

import dao.ClienteDAO;
import java.util.List;
import model.Cliente;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController() {
        this.clienteDAO = new ClienteDAO();
    }

public List<Cliente> buscarClientes(String criterio) {
        return clienteDAO.lista(criterio);
  }
}
