package com.campusdual.classroom;

public class Exercise13 {
    public static void main(String[] args) {
        FuelTank ft = new FuelTank();
        ft.setActualFuel(15);
        System.out.println("Actualización capacidad");
        ft.setActualFuel(-8);
        ft.showDetails();
    }
}