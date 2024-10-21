package com.campusdual.classroom;

public class FuelTank {
public FuelTank() {}
  private int actualFuel = 10;

  public FuelTank(int actualFuel) {
    this.actualFuel = actualFuel;
  }

  public void setActualFuel(int actualFuel) {
    if(actualFuel<0){
      System.out.println("The capacity cannot be a negative value");
    }else {
      this.actualFuel = actualFuel;

      System.out.println("The actualfuel is: "+this.actualFuel+"lt");
    }

  }

  public void showDetails() {
    System.out.println("La capacidad actual es de " + this.actualFuel + " litros.");
  }

  public int getActualFuel() {
    return this.actualFuel;
  }
}
