import java.util.ArrayList;
import java.util.List;

class Findbuilding{
    public static  List<Integer> buildinglist(int[] heights){
        int maxheight = 0;
        List<Integer> res = new ArrayList<>();
        List<Integer> revres = new ArrayList<>();

        for(int i = heights.length-1;i>=0 ; i-- ){

            if (heights[i] > maxheight){
                res.add(heights[i]);
                maxheight = heights[i];

            }
        }

        for(int i= res.size()-1 ; i>=0;i--){
            revres.add(res.get(i));
        }
        return revres;
    }
}


class Solution{
    public static void main(String[] args){
        int[] intArray = new int[] {12,2,3,1};
        List<Integer> ans = new ArrayList<>();
        ans = Findbuilding.buildinglist(intArray);
        System.out.println(ans);

    }

}

