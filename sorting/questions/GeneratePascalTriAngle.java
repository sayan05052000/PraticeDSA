package sorting.questions;

import java.util.ArrayList;
import java.util.List;

public class GeneratePascalTriAngle {

    public static List<List<Integer>> generate(int numRows) {
        return generate(numRows,0,new ArrayList<List<Integer>>());
    }
    public static List<List<Integer>> generate(int rowNum,int count,List<List<Integer>> arrayList) {
        if(rowNum == count){
            return arrayList;
        }
        List<Integer> arrayListToBeAdded = new ArrayList<>();
        if(arrayList.isEmpty()){
            arrayListToBeAdded.add(1);
            arrayList.add(arrayListToBeAdded);
        }else{
            arrayList.add(generateNextRow(arrayList.get(arrayList.size()-1)));
        }
        return generate(rowNum,count+1,arrayList);
    }

    public static List<Integer> generateNextRow(List<Integer> lastRow){
        List<Integer> arrayListToBeAdded = new ArrayList<>();
        arrayListToBeAdded.add(1);
        for(int i = 0;i<lastRow.size()-1;i++){
            arrayListToBeAdded.add(lastRow.get(i)+lastRow.get(i+1));
        }
        arrayListToBeAdded.add(1);
        return arrayListToBeAdded;
    }
}
