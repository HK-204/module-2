import java.util.Scanner;
import java.util.Stack;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BrowserHistory browser = new BrowserHistory("home");
        int choice;

        do {
            System.out.println("1. New page");
            System.out.println("2. Back to previous page");
            System.out.println("3. Forward to new page");
            System.out.println("4. Current page");
            System.out.println("0. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("New URL: ");
                    String newURL = sc.next();
                    browser.visit(newURL);
                    break;
                case 2:
                    browser.back();
                    break;
                case 3:
                    browser.forward();
                    break;
                case 4:
                    browser.showCurrentPage();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);

        sc.close();
    }

    private Stack<String> backStack = new Stack<>();
    private Stack<String> forwardStack = new Stack<>();
    private String currentPage;

    public BrowserHistory(String currentPage) {
        this.currentPage = currentPage;
    }

    public void visit(String url) {
        backStack.push(currentPage);
        forwardStack.clear();
        currentPage = url;
        System.out.println("Visited URL: " + url);
    }

    public void back() {
        if (backStack.empty()) {
            System.out.println("No any page to go back");
            return;
        }
        forwardStack.push(currentPage);
        currentPage = backStack.pop();
        System.out.println("Backed to: " + currentPage);
    }

    public void forward() {
        if (forwardStack.empty()) {
            System.out.println("No any page to go forward");
            return;
        }
        backStack.push(currentPage);
        currentPage = forwardStack.pop();
        System.out.println("Forwarded to: " + currentPage);
    }

    public void showCurrentPage() {
        System.out.println("Current Page: " + currentPage);
    }
}
