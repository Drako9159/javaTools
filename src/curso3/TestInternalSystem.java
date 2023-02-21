package curso3;

public class TestInternalSystem {
    public static void main(String[] args) {
        InternalSystem sistem = new InternalSystem();
        Manager manager1 = new Manager();
        Admin admin = new Admin();

        sistem.auth(manager1);
        sistem.auth(admin);
    }
}

