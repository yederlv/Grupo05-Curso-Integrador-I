/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TestDB;

import dao.LoginDAO;

/**
 *
 * @author Usuario
 */
public class LoginTest {
    public static void main(String[] args) {
        // Variables de prueba
        String username = "Evelyn";
        String password = "3v3l1n";

        // Crear una instancia del DAO de login
        LoginDAO loginDAO = new LoginDAO();

        // Probar la autenticación
        boolean isAuthenticated = loginDAO.authenticate(username, password);

        // Imprimir el resultado
        if (isAuthenticated) {
            System.out.println("Sesión iniciada.");
        } else {
            System.out.println("Credenciales incorrectas.");
        }
    }
    
}
