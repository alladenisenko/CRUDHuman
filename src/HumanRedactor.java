/**
 * Created by Алла on 25.08.2018.
 */
public class HumanRedactor {
    public Human[] addHuman (Human[] humans, Human human){
        for (int i = 0; i <humans.length ; i++) {
           if (humans[i]== null){
               humans[i]=human;
               break;
           }
        }
        return humans;
    }
    public void readHuman(Human[] humans){
        for (int i = 0; i <humans.length ; i++) {
            if (humans[i]!=null){
                System.out.println(humans[i].toString());
            }
        }

    }
    public Human[] updateHuman(Human[] humans, Human human){
        for (int i = 0; i <humans.length ; i++) {
            if (humans[i].getId()==human.getId()){
                humans[i]=human;
                break;
            }

        }
        return humans;
    }

    public Human[] deleteHuman(Human[] humans, int id){
        for (int i = 0; i <humans.length ; i++) {
            if (humans[i].getId()==id){
                humans[i]=null;
                break;
            }
        }
        return humans;
    }
    public Human foundId (Human[] humans, int id){
        Human human = null;
        for (Human human1 : humans) {
            if(human1.getId()==id){
                human=human1;
                break;
            }
        }
        return human;
    }
}
