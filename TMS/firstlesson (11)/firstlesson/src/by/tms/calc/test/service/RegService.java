package by.tms.calc.test.service;

import by.tms.calc.test.entity.User;

public class RegService {
  public void createUser(User user) {
    User.users.add(user);
  }

  public User getUserById(int id) {
    return User.users.get(id);
  }
}
