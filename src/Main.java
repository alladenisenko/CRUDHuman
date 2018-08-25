/**
 * Created by Алла on 24.08.2018.
 */
public class Main {
    public static void main(String[] args){
        Human[] humans = new Human[10];
        HumanRouter humanRouter = new HumanRouter();
        //String[] arr = new String[10];
        Menu menu= new Menu();

        while (!humanRouter.theEndProgramm){
     menu.mainMenu();
     humans = humanRouter.router(humans);
  //arr = menu.route(arr);

    }
    }
}
