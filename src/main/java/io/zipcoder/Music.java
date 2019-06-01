package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;


    }

    public Integer selection(Integer startIndex, String selection) {
            if(playList[startIndex]==selection){
                return 0;
            }

            for (int x=startIndex; x<playList.length;x++){
                if(playList[x] == selection){
                    //store x as variable
                }
            }
            for (int y=startIndex; y>=0;y--){
                if(playList[y] == selection){
                    //store y as another variable;
                }
            }

            // if x>y == return y
            // if y > x == return x


      return 0;



    }
}
