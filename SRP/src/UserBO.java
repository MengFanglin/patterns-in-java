public class UserBO implements IUserBO {

    private String userID;
    private String password;
    private String userName;


    @Override
    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String getUserID() {
        return userID;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String getUserName() {
        return userName;
    }
}