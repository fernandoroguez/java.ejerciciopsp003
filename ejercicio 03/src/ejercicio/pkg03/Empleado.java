/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
public class Empleado {
    String nombre;
    int num=0;
    int salario;
    int salario_max;
    GregorianCalendar fecha;
    
    Empleado(String nombre,int salario,int salario_max){
        this.nombre=nombre;
        this.salario=salario;
        this.salario_max=salario_max;
        fecha=new GregorianCalendar();

        Random random = new Random();
        fecha.set(random.nextInt(28) + 1,random.nextInt(12) + 1,random.nextInt(2024 - 1900) + 1900);
    }
    
    public Empleado(String nombre,int salario,int salario_max,int num){
        this.nombre=nombre;
        this.salario=salario;
        this.salario_max=salario_max;
        fecha=new GregorianCalendar();
        
        this.num=num;
       // this("",int num,0,0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario_max() {
        return salario_max;
    }

    public void setSalario_max(int salario_max) {
        this.salario_max = salario_max;
    }

    public GregorianCalendar getFecha_alta() {
        return fecha;
    }

    public void setFecha_alta(GregorianCalendar fecha_alta) {
        this.fecha = fecha_alta;
    }

    @Override
    public String toString() {
        return nombre + "," + num + "," + salario + "," + salario_max + "," + "" + (fecha.get(Calendar.DAY_OF_MONTH) + "/" + (fecha.get(Calendar.MONTH) + 1) + "/" + fecha.get(Calendar.YEAR));
    }
    
    
    
    
}
