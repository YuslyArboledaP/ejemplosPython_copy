package Controlador;

import Modelo.ModeloLogin;
import Vista.Login;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class ControladorLogin implements ActionListener{
    
    ModeloLogin modlog = new ModeloLogin();
    Login log = new Login();
    Principal princ =new Principal();
    ControladorPrincipal prin = new ControladorPrincipal();

    public ControladorLogin() {
        log.getBtnIniciar().addActionListener(this);
        log.getBtnMostrarClave().addActionListener(this);
    }
    public void iniciarVista(){
        log.setLocationRelativeTo(null);//Centrando la vista
        log.setTitle("Iniciar Sesión");// Titulo a la vista
        log.setVisible(true);//Visible la vista
    }
            

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(log.getBtnMostrarClave())){
            if(log.getJpContra().getEchoChar()=='\u2022'){
                log.getJpContra().setEchoChar((char)0);
                log.getBtnMostrarClave().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo-cruzado.png")));
            }else{
                log.getJpContra().setEchoChar('\u2022');
                log.getBtnMostrarClave().setIcon(new javax.swing.ImageIcon(
                        getClass().getResource("/img/ojo.png")));
            }
        }
        if(e.getSource()==(log.getBtnIniciar())){
            modlog.setUsu(log.getTxtUsuario().getText());
            String pass = new String(log.getJpContra().getPassword());
            modlog.setContra(pass);
            if(modlog.validar(modlog.getUsu(), modlog.getContra())){
                log.setVisible(false);
                prin.iniciar(0);
                
                
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecta");
                
            }
        }
  
    }
    
}
