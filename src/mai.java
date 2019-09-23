import java.util.Scanner;
public class mai {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
    System.out.print("Enter student' name: ");
    String input_name = scanner.nextLine();
    boolean isExit = false;
    for(int i = 0; i < students.length; i ++){
        if (students[i].equals(input_name)){
            System.out.println("Position of the student in the list " + input_name + " is: " + (i+1));
            isExit = true;
            break;
        }
    }
    if (!isExit){
        System.out.println("Not found " + input_name + " in the array.");
    }
    }
}
