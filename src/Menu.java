/**
 * Created by Алла on 24.08.2018.
 */
import java.util.Scanner;

public class Menu {
    Redactor redactor = new Redactor();
    boolean theEndProgram = false;
    public void mainMenu () {
        System.out.println("MENU: \n" +
                "please enter command for action \n" +
                "c - create \n" +
                "r - read \n" +
                "u - update \n" +
                "d - delete \n" +
                "sort - for sort array \n" +
                "exit - for finish program ");
    }
    public String [] route (String[] arr){
        String comand = readConsoleValue();

        if (comand.equalsIgnoreCase("c")){
            arr = createElement(arr);
        }else if (comand.equalsIgnoreCase("r")){
           readElemnt(arr);
        }else if (comand.equalsIgnoreCase("u")){
            arr = updateElement(arr);
        }else if (comand.equalsIgnoreCase("d")){
            arr = deleteElement(arr);
        } else if (comand.equalsIgnoreCase("exit")){
        theEndProgram = checkExit();
        } else {
            System.out.println("Incorrect command try again : ");
        }

         return arr;
    }
    private boolean checkExit(){
        System.out.println("If you want exit enter 'y', return enter other value: ");
        if (readConsoleValue().equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }
    private String[] createElement (String[] arr){
        System.out.println("Please enter value for create element:");
        String value = readConsoleValue();
        arr = redactor.create (arr, value);

        return arr;
    }
    private String[] updateElement(String[] arr){
        String value;
        int index;

        System.out.println("Please enter new value for update element: ");
        value=readConsoleValue();
        System.out.println("Please enter index(only numbers): ");
        index = Integer.parseInt(readConsoleValue());
        arr = redactor.update (arr, index, value);
        return arr;
    }

    private  String[] deleteElement(String[] arr){
        int index;
        System.out.println("Please enter index for delete element (only numbers): ");
        index = Integer.parseInt(readConsoleValue());
        arr = redactor.delete (arr, index);
        return arr;
    }

    private void readElemnt(String[] arr){
        redactor.read (arr);
    }

    protected String readConsoleValue () {
        String value;
        Scanner scanner = new Scanner (System.in);
        value = scanner.nextLine();
        return value;

    }

}
