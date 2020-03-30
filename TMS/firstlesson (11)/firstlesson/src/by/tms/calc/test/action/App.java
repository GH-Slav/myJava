package by.tms.calc.test.action;

import java.util.Scanner;

public class App {
  private UserAction userAction = new UserAction();

  public void run() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
    if (UserAction.currentUser == null) {
      System.out.println("Hello Guest");
    } else {
      System.out.println("Hello " + UserAction.currentUser.getLogin());
    }
    switch (scanner.nextInt()) {
      case 1:
        userAction.reg();
        break;
      case 2:
        userAction.auth();
        break;
    }
  }
}
}
