package com.biz.bestalbum;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BestAlbumService {
	class Solution {
	    public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        
	        class AlbumVO{
	        	String genre;
	        	int play;
	        }
	        List<AlbumVO> albumVOList=new ArrayList<AlbumVO>();
	        List<AlbumVO> sortedAlbumVOList=new ArrayList<AlbumVO>();
	        for(int i=0;i<genres.length;i++) {
	        	AlbumVO albumVO=new AlbumVO();
	        	albumVO.genre=genres[i];
	        	albumVO.play=plays[i];
	        	albumVOList.add(albumVO);
	        }
	        Collections.sort(albumVOList, new Comparator<AlbumVO>() {

				@Override
				public int compare(AlbumVO o1, AlbumVO o2) {
					// TODO Auto-generated method stub
					return o2.play-o1.play;
				}
			});
	        for(int i=0;i<albumVOList.size();i++) {
	        	String genre=albumVOList.get(i).genre;
	        	sortedAlbumVOList.add(albumVOList.get(i));
	        	albumVOList.remove(i);
	        	for(int j=0;j<albumVOList.size();j++) {
	        		if(i==j) continue;
	        		if(albumVOList.get(i).genre.equalsIgnoreCase(albumVOList.get(j).genre)) {
	        			if(albumVOList.get(i).play<albumVOList.get(j).play) {
	        				AlbumVO _vo=albumVOList.get(i);
	        				albumVOList.re
	        			}
	        		}
	        	}
	        	
	        }
	        
	        
	        return answer;
	    }
	}
}
