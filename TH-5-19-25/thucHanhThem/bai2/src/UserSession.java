public class UserSession {
    private static int onlineCount = 0;

    public UserSession() {
        onlineCount++;
    }

    public void logout() {
        onlineCount--;
    }

    public static int getOnlineCount() {
        return onlineCount;
    }
}
