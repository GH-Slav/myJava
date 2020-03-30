package by.tms.calc.test.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
  public static final List<User> users = new ArrayList<>();

  private String login;
  private String pass;

  public User(String login, String pass) {
    this.login = login;
    this.pass = pass;
  }


  public User() {
  }

  public String getLogin() {
    return login;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public String getPass() {
    return pass;
  }

  public void setPass(String pass) {
    this.pass = pass;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    User user = (User) o;
    return Objects.equals(login, user.login) &&
        Objects.equals(pass, user.pass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(login, pass);
  }

  @Override
  public String toString() {
    return "User{" +
        "login='" + login + '\'' +
        ", pass='" + pass + '\'' +
        '}';
  }
}
