package by.tms.DomashneeZadanie._4_Calculator.UsersServes.Serves;

import by.tms.DomashneeZadanie._4_Calculator.UsersServes.List.User;

public class Auth implements AuthIn {


    @Override
    public void авто(String l, String p) {
        for (User user : User.n) {
            if (user.getИМЯЛОГИНА().equals(l)) {
                if (user.getПАРОЛЬ().equals(p)) {
                    user = null;
                }
            }
        }
    }
}