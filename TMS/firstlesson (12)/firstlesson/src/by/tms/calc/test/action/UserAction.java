package by.tms.calc.test.action;

import by.tms.calc.test.entity.User;
import by.tms.calc.test.service.AuthService;
import by.tms.calc.test.service.RegService;

import java.util.Scanner;

public class UserAction {
  public static User currentUser = null;
  private AuthService authService = new AuthService();
  private RegService regService = new RegService();
  private Scanner scanner = new Scanner(System.in);

  void reg(){
    System.out.println("Inter login");
    String s = scanner.nextLine();
    System.out.println("Inter pass");
    String s1 = scanner.nextLine();
    User user = new User(s, s1);
    regService.createUser(user);
  }

  void auth(){
    System.out.println("Inter login");
    String s = scanner.nextLine();
    System.out.println("Inter pass");
    String s1 = scanner.nextLine();
    authService.auth(s, s1);
  }
}
