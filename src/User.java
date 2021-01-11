public class User {
    int password;
    String name;
    public User(){
        this(123456);
    }
    public User(int password){
        this.password=password;
    }

    public int getPassword() {
        return password;
    }
}
