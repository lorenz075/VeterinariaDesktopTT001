package br.unicamp.veterinaria;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import model.AnimalDAO;
import model.Cliente;
import model.ClienteDAO;
import model.ConsultaDAO;
import model.EspecieDAO;
import model.ExameDAO;
import model.TratamentoDAO;
import model.VeterinarioDAO;
import controller.Controller;

/**
 *
 * @author Gabriel Lorenzo Usero Silva
 */
public class Main {

    public static void main(String[] args) throws ParseException {

        Controller.addCliente("Ana controller", "rua dos bobo", "1111111", "111111", "ana@email.com");
        
        
        ClienteDAO.getInstance().create("Ana", "rua dos bobo", "1111111", "111111", "ana@email.com");
        ClienteDAO.getInstance().create("Lorenzo", "rua dos nem tão bobos", "1111111", "111111", "lorenzo@email.com");

        AnimalDAO.getInstance().create("Hori", 22, "Macho", 1, 1);
        AnimalDAO.getInstance().create("Joao", 1, "Macho", 1, 1);
        AnimalDAO.getInstance().create("Shoyu", 6, "Fêmea", 1, 1);
        AnimalDAO.getInstance().create("Umami", 8, "Fêmea", 1, 2);
        

        VeterinarioDAO.getInstance().create("Kate natureza", "rua dos talvez bobos", "vladimir@natureza.com", "19978135445");

        EspecieDAO.getInstance().create("Lagartixa");
        EspecieDAO.getInstance().create("Camaleão");

        ExameDAO.getInstance().create("exame de pele", 1);
        ExameDAO.getInstance().create("exame de vista", 2);
        

        TratamentoDAO.getInstance().create(1, "Tratamento 01", Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), 0);
        TratamentoDAO.getInstance().create(2, "Tratamento 02", Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), 1);

        ClienteDAO clienteDAO = ClienteDAO.getInstance();
        AnimalDAO animalDAO = AnimalDAO.getInstance();

        Cliente clienteUm = clienteDAO.retrieveById(1);
        Cliente clienteDois = clienteDAO.retrieveById(2);


        
        clienteDois.addAnimais(animalDAO.retrieveByClientId(clienteDois.getId()));
        

        System.out.println(clienteUm);
        System.out.println(clienteDois);
        

        System.out.println(ClienteDAO.getInstance().retrieveAll());
        System.out.println(AnimalDAO.getInstance().retrieveAll());
        System.out.println(VeterinarioDAO.getInstance().retrieveAll());
        System.out.println(EspecieDAO.getInstance().retrieveAll());
        System.out.println(ExameDAO.getInstance().retrieveAll());
        System.out.println(TratamentoDAO.getInstance().retrieveAll());
        System.out.println(ConsultaDAO.getInstance().retrieveAll());
    }
}
