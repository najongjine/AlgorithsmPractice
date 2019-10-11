package com.biz.bestalbum.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class SolutionService {
		public class AlbumVO{
        	public String genre;
        	public int play;
        }
		
	    public SolutionService() {
			super();
			// TODO Auto-generated constructor stub
		}

		public List<AlbumVO> solution(String[] genres, int[] plays) {
	        
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
	        for(;!albumVOList.isEmpty();) {
	        	String genre=albumVOList.get(0).genre;
	        	sortedAlbumVOList.add(albumVOList.get(0));
	        	albumVOList.remove(0);
	        	for(int j=0;j<albumVOList.size();j++) {
	        		if(albumVOList.get(j).genre.equalsIgnoreCase(genre)) {
	        			sortedAlbumVOList.add(albumVOList.get(j));
	        			albumVOList.remove(j);
	        		}
	        	}
	        }//end for
	        
	        return sortedAlbumVOList;
	    }
}

