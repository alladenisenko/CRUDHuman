/**
 * Created by Алла on 25.08.2018.
 */
public class HumanRouter {
    Menu menu = new Menu();
    HumanRedactor humanRedactor = new HumanRedactor();
boolean theEndProgramm=false;
    public Human[] router(Human[] humans){
        String command=menu.readConsoleValue();
        if (command.equalsIgnoreCase("c")){
            humans=addHumanRouter(humans);
        } else if (command.equalsIgnoreCase("r")){
            readHumanRouter(humans);
            } else if (command.equalsIgnoreCase("u")){
            humans=updateHumanRouter(humans);
        } else if (command.equalsIgnoreCase("d")){
                humans=deleteHumanRouter(humans);
        } else if (command.equalsIgnoreCase("exit")){
            theEndProgramm=true;
        } else{
            System.out.println("Incorrect");
        }

        return humans;
    }

    private Human[] addHumanRouter (Human[] humans){
        Human tempHuman = new Human();
        System.out.println("pleaseer enter the data of new human");
        System.out.println("enter name");
        tempHuman.setName(menu.readConsoleValue());
        System.out.println("enter age");
        tempHuman.setAge(Integer.parseInt(menu.readConsoleValue()));
        System.out.println("enter growth");
        tempHuman.setGrowth(Double.parseDouble(menu.readConsoleValue()));
        return humanRedactor.addHuman(humans,tempHuman);
    }

    private void readHumanRouter (Human[] humans){
        humanRedactor.readHuman(humans);
    }

    private Human[] updateHumanRouter (Human[] humans){
        Human human;
        System.out.println("enter data for update Human");
        System.out.println("enter id for update Human");
        human=humanRedactor.foundId(humans,Integer.parseInt(menu.readConsoleValue()));
        System.out.println("enter new name");
        human.setName(menu.readConsoleValue());
        System.out.println("enter new age");
        human.setAge(Integer.parseInt(menu.readConsoleValue()));
        System.out.println("enter new grows");
        human.setGrowth(Double.parseDouble(menu.readConsoleValue()));
        return humanRedactor.updateHuman(humans,human);
    }
    private Human[] deleteHumanRouter (Human[] humans){
        System.out.println("enter id for delete Human");
        return humanRedactor.deleteHuman(humans,Integer.parseInt(menu.readConsoleValue()));
    }

}
