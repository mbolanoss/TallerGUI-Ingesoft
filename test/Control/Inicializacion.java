/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDAO;
import Entidad.Usuario;
import static Frontera.FramePrincipal.sistema;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author user
 */
public class Inicializacion {

    public Inicializacion() {
    }
    
    @Test
    public void initData(){
        UsuarioDAO dao = new UsuarioDAO();
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        //Se crean los usuarios
        Usuario a = new Usuario();
        Usuario b = new Usuario();
        Usuario c = new Usuario();
        
        //Se llena la informacion de los usuarios
        a.setNombre("juan");
        a.setPassword("1234");
        b.setNombre("pedro");
        b.setPassword("123");
        c.setNombre("maria");
        c.setPassword("12345");
        
        //Se agregan al ArrayList
        usuarios.add(a);
        usuarios.add(b);
        usuarios.add(c);
        
        //sistema.setUsuarios(usuarios);
        
        //for(Usuario u : sistema.getUsuarios()){
        for(Usuario u : usuarios){
            System.out.println(u.getNombre());
            System.out.println(u.getPassword());
            System.out.println("--------------");
            dao.crear(u);
        }
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
}
