/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Erick
 */
public class Usuario {
 String username;
 String password;
public String getPassword(){
return this.password;
}
public Usuario(String user,String pw){
this.username = user;
this.password = pw;

}
}