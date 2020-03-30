package by.tms.test;

public interface ModerAction {
    private String getI(){
       return "hello";
    }
    default String getRole(){
     return getI();
    }
}
