package utils;

public class NewUser {
    public static String userName, password,repeatPassword, securityAnswer;

    public NewUser() {
        this.userName = "abc30@gmail.com";
        this.password = "Abc@1234";
        this.repeatPassword="Abc@1234";
        this.securityAnswer="abc";
    }

    public NewUser(String userName,String password,String securityAnswer) {
        this.userName = userName;
        this.password = password;
        this.repeatPassword=password;
        this.securityAnswer=securityAnswer;
    }
}
