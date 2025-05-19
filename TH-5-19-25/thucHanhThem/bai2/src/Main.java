public class Main {
    public static void main(String[] args) {
        UserSession u1 = new UserSession();
        UserSession u2 = new UserSession();
        UserSession u3 = new UserSession();
        UserSession u4 = new UserSession();
        u3.logout();

        System.out.println("Number of online account: " + UserSession.getOnlineCount());
    }
}