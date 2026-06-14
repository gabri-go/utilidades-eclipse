package Ejemplos;

import java.util.Objects;

public class Persona
{
    private String nombre;
    private int edad;
    private String email;

    public Persona(String nombre, int edad, String email) {
        super();
        this.nombre = nombre;
        this.edad = edad;
        this.email = email;
    }

    public Persona() {
        super();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + ", email=" + email + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(edad, email, nombre);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        return edad == other.edad && Objects.equals(email, other.email) && Objects.equals(nombre, other.nombre);
    }

}
