
class Main{
    public static void main(String[] args) {
    Data data = new Data();
    data.menu();

    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();

    switch (choice) {
        case 1:
             add();
            break;
        case 2:
            // Perform "encrypt number" case.
            break;
        case 3:
            // Perform "decrypt number" case.
            break;
        case 4:
            // Perform "quit" case.
            break;
        default:
            // The user input an unexpected choice.
    }
}
}