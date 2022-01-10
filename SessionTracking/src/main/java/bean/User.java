package bean;

public class User {
    private String email;
    private String password;
    private String message = "Error validating";

    public User(String email, String password) {
        super();
        this.email = email;
        this.password = password;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validate() {
        if (password.length() < 8) {
            message = "Password chieu dai lon hon 8";
            return false;
        }
        if (password.matches("\\w*\\s+\\w*")) {
            message = "Password ko chua dau cach";
            return false;
        }
        if (email == null) {
            message = "No email set";
            return false;
        }
        if (!email.matches("\\w+@\\w+\\.\\w+")) {
            message = "Invalid email";
            return false;
        }
        return true;
    }
}
