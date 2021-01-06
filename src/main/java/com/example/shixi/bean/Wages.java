package com.example.shixi.bean;


public class Wages {

  private int id;
  private double baseWage;
  private double yearWage;
  private double floatWage;
  private double positionWage;
  private double bonus;
  private double tax;
  private double insure;

  @Override
  public String toString() {
    return "Wages{" +
            "id=" + id +
            ", baseWage=" + baseWage +
            ", yearWage=" + yearWage +
            ", floatWage=" + floatWage +
            ", positionWage=" + positionWage +
            ", bonus=" + bonus +
            ", tax=" + tax +
            ", insure=" + insure +
            '}';
  }

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
  }

  public double getInsure() {
    return insure;
  }

  public void setInsure(double insure) {
    this.insure = insure;
  }

  public Wages(int id, double baseWage, double yearWage, double floatWage, double positionWage, double bonus, double tax, double insure) {
    this.id = id;
    this.baseWage = baseWage;
    this.yearWage = yearWage;
    this.floatWage = floatWage;
    this.positionWage = positionWage;
    this.bonus = bonus;
    this.tax = tax;
    this.insure = insure;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public double getBaseWage() {
    return baseWage;
  }

  public void setBaseWage(double baseWage) {
    this.baseWage = baseWage;
  }


  public double getYearWage() {
    return yearWage;
  }

  public void setYearWage(double yearWage) {
    this.yearWage = yearWage;
  }


  public double getFloatWage() {
    return floatWage;
  }

  public void setFloatWage(double floatWage) {
    this.floatWage = floatWage;
  }


  public double getPositionWage() {
    return positionWage;
  }

  public void setPositionWage(double positionWage) {
    this.positionWage = positionWage;
  }


  public double getBonus() {
    return bonus;
  }

  public void setBonus(double bonus) {
    this.bonus = bonus;
  }

}
