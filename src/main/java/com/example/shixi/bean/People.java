package com.example.shixi.bean;


public class People {

  private long id;
  private String name;
  private String sex;
  private String position;
  private String birthday;
  private String addData;

  public People(long id, String name, String sex, String position, String birthday, String addData) {
    this.id = id;
    this.name = name;
    this.sex = sex;
    this.position = position;
    this.birthday = birthday;
    this.addData = addData;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }


  public String getPosition() {
    return position;
  }

  public void setPosition(String position) {
    this.position = position;
  }


  public String getBirthday() {
    return birthday;
  }

  public void setBirthday(String birthday) {
    this.birthday = birthday;
  }


  public String getAddData() {
    return addData;
  }

  public void setAddData(String addData) {
    this.addData = addData;
  }

  @Override
  public String toString() {
    return "People{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", sex='" + sex + '\'' +
            ", position='" + position + '\'' +
            ", birthday='" + birthday + '\'' +
            ", addData='" + addData + '\'' +
            '}';
  }
}
