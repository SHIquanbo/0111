public class Student extends User {
    int password=super.password;
    public Student(){
        super();
    }
    public int getPassword() {
        return password;
    }
}
