package com.biz.methoddev;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public  List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> progressesList=new ArrayList<Integer>();
        List<Integer> speedsList=new ArrayList<Integer>();
        List<Integer> orderList=new ArrayList<Integer>();
        for(int i=0;i<progresses.length;i++) {
        	progressesList.add(progresses[i]);
        }
        for(int i=0;i<speeds.length;i++) {
        	speedsList.add(speeds[i]);
        }
        int sizeProgList=progressesList.size();
        int sizeSpeedList=speedsList.size();
        int days=1;
        for(; !progressesList.isEmpty(); ) {
        	for(int j=0;j<days;j++) {
        		progressesList.set(j, progressesList.get(j)+speedsList.get(j));
            	if(progressesList.get(j)>=100) {
            		orderList.add(j);
            		progressesList.remove(j);
            		speedsList.remove(j);
            	}
        	}
        	days++;
        }
        return orderList;
    }
}
