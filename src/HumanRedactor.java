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
                System.out.println(humans[i]);
            }
        }

    }
   // [null, 2, 3 null]
    public Human[] updateHuman(Human[] humans, Human human){
        for (int i = 0; i <humans.length ; i++) {
            if (humans[i]!=null && humans[i].getId()==human.getId()){
                humans[i]=human;
                break;
            }

        }
        return humans;
    }

    public Human[] deleteHuman(Human[] humans, Human human){
        for (int i = 0; i <humans.length ; i++) {
            if ((humans[i]!=null) && (humans[i].getId()== human.getId())){
                humans[i]=null;
                break;
            }
        }
        return humans;
    }
    public Human foundId (Human[] humans, int id){
        Human human = null;
        for (Human human1 : humans) {
            if(human1!=null &&human1.getId()==id){
                human=human1;
                break;
            }
        }
        return human;
    }
    // [null, 2, 7, 5 null, 3, null]
    public Human[] sortHumanId (Human[] humans){
        Human[] tempHumans = new Human[humans.length];
        int countIndex = 0;
        Human human;
        for (int i = 0; i <humans.length ; i++) {
            if (humans[i]!=null){
                tempHumans[countIndex] = humans[i];
                countIndex++;
            }
        }
        for (int j = 0; j <tempHumans.length ; j++) {
            int count = 0;
            for (int i = 1; i <tempHumans.length; i++) {
                if ((tempHumans[i]!=null)&&(tempHumans[i].getId() < tempHumans[i-1].getId())){
                        human = tempHumans[i];
                        tempHumans[i] = tempHumans[i-1];
                        tempHumans[i-1]=human;
                        count++;
                }
            }
            if(count == 0){
               break;
            }
        }
        return tempHumans;
    }
}
