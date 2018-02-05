package com.example.alexgato.amasdesconnect.sampledata.Objects;

/**
 * Created by alexgato on 4/2/18.
 */

public class User {


    public User(String nombre, String apellidos, String email, String telefono, String password, String fechaDeNacimiento) {
        Nombre = nombre;
        Apellidos = apellidos;
        Email = email;
        Telefono = telefono;
        Password = password;
        FechaDeNacimiento = fechaDeNacimiento;
    }

    String Nombre;
    String Apellidos;
    String Email;
    String Telefono;
    String Password;
    String FechaDeNacimiento;



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getFechaDeNacimiento() {
        return FechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        FechaDeNacimiento = fechaDeNacimiento;
    }
}
