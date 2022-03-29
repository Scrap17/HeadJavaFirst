import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells ;
        //int[] locationCells;
        //int numOfHits = 0;
        //not required now
        
        public void setLocationCells(ArrayList<String> loc){
            locationCells =loc;
        }
      
        public String checkYourself(String userInput){
            //int guess= Integer.parseInt(stringGuess);
            //not required anymore
            String result="miss";
            //for(int cell : locationCells){
              //  if(guess==cell){
                //    result="hit";
                  //  numOfHits++;
                    //break;
                //}
            //}
            //if(numOfHits ==locationCells.length){
              //  result="kill";
            //}
            //System.out.println(result);
            //return result;
            int index = locationCells.indexOf(userInput);
            if(index>=0){
                locationCells.remove(index);
                if(locationCells.isEmpty()){
                    result="kill";
                }else{
                    result="hit";
                }
            }
            return result;
        }          
}
