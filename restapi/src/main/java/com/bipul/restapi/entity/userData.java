package com.bipul.restapi.entity;

public class userData {
private int id;
private String FirstName;
private String LastName;
private String CityFrom;
private int Class1;

public userData() {
super();
// TODO Auto-generated constructor stub
}

public userData(int id, String firstName, String lastName, String cityFrom, int class1) {
super();
this.id = id;
FirstName = firstName;
LastName = lastName;
CityFrom = cityFrom;
Class1 = class1;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}
public String getFirstName() {
return FirstName;
}
public void setFirstName(String firstName) {
FirstName = firstName;
}
public String getLastName() {
return LastName;
}
public void setLastName(String lastName) {
LastName = lastName;
}
public String getCityFrom() {
return CityFrom;
}
public void setCityFrom(String cityFrom) {
CityFrom = cityFrom;
}
public Integer getClass1() {
return Class1;
}
public void setClass1(int class1) {
Class1 = class1;
}

@Override
public String toString() {
return "userData [id=" + id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", CityFrom=" + CityFrom
+ ", Class1=" + Class1 + "]";
}
}

