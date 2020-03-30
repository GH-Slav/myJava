package by.tms.calc.test.service;

import by.tms.calc.test.action.UserAction;
import by.tms.calc.test.entity.User;

public class AuthService {
  public void auth(String login, String pass){
    for (User user : User.users) {
      if (user.getLogin().equals(login)){
        if (user.getPass().equals(pass)) {
          UserAction.currentUser = user;
        }
      }
    }
  }
}
