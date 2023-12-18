public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        return 40;
    }
    // TODO: define the 'remainingMinutesInOven()' method
     public int remainingMinutesInOven(int time){
        int remTime;
        remTime = 40 - time;
        return remTime;
     }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int prepTime;
        prepTime = 2*layers;
        return prepTime;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers,int time){
        int totalTime;
        totalTime = preparationTimeInMinutes(layers)+time;
        return totalTime;
    }
}
