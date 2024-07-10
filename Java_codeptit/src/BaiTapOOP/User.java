package BaiTapOOP;

public abstract class User extends Course implements java.io.Serializable {
    public String userName;
    public String passWord;
    public String firstName;
    public String midName;
    public String lastName;
    
    public User(){

    }

    public User(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
