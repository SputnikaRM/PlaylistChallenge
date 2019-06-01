package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;


    }

    public Integer selection(Integer startIndex, String selection) {
        int num = 0;
        int num2 = 0;
        int right = 0;


            for (int x = startIndex; x<playList.length;x++){

                    num++;
            }
                    //store x as variable

            for (int y=startIndex; y>=0;y--){

                    num2++;
                    //store y as another variable;

            }
            if(num > num2){
                return num2;
            } else return num;

            // if x>y == return y
            // if y > x == return x

// no need for an array list; 




    }
}
