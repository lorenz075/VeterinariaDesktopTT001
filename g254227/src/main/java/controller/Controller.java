/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.List;
import model.Animal;
import model.AnimalDAO;
import model.Cliente;
import model.ClienteDAO;
import model.Veterinario;
import model.VeterinarioDAO;

/**
 *
 * @author g.lorenzo
 */
public class Controller {
    
    public Controller() {
        
    }
    
    //Retrieve
    public static List getAllClientes() {
        return ClienteDAO.getInstance().retrieveAll();
    }
    
    public static List getAllAnimais() {
        return AnimalDAO.getInstance().retrieveAll();
    }
    
    public static List getAllVeterinarios() {
        return VeterinarioDAO.getInstance().retrieveAll();
    }
    
    //Create
    public static void addCliente(String nome, String endereco, String telefone, String cep, String email) {
        ClienteDAO.getInstance().create(nome, endereco, telefone, cep, email);
    }
    
    public static void addAnimal(String nome, int idade, String sexo, int idEspecie, int idCliente) {
        AnimalDAO.getInstance().create(nome, idade, sexo, idEspecie, idCliente);
    }
    
    public static void addVeterinario(String nome, String endereco, String email, String telefone) {
        VeterinarioDAO.getInstance().create(nome, endereco, email, telefone);
    }
    
    //Update
    public static void updateCliente(Cliente cliente){
        ClienteDAO.getInstance().update(cliente);
    }
    
    public static void updateAnimal(Animal animal){
        AnimalDAO.getInstance().update(animal);
    }
    
    public static void updateVeterinario(Veterinario veterinario){
        VeterinarioDAO.getInstance().update(veterinario);
    }
    
    //Delete
    public static void deleteCliente(Cliente cliente){
        ClienteDAO.getInstance().delete(cliente);
    }
    
    public static void deleteAnimal(Animal animal){
        AnimalDAO.getInstance().delete(animal);
    }
    
    public static void deleteVeterinario(Veterinario veterinario){
        VeterinarioDAO.getInstance().delete(veterinario);
    }
}
