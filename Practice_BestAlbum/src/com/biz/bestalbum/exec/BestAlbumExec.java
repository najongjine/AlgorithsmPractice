package com.biz.bestalbum.exec;

import java.util.List;

import com.biz.bestalbum.service.SolutionService;
import com.biz.bestalbum.service.SolutionService.AlbumVO;

public class BestAlbumExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionService solution=new SolutionService();
		String[] genres= {"classic", "pop","rock", "classic","death metal", "classic", "pop","rock","rap"};
		int[] plays= {500, 600, 150, 800, 2500,999,500,45643,45663};
		
		List<AlbumVO> albumVOList=solution.solution(genres, plays);
		for(AlbumVO vo: albumVOList) {
			System.out.printf("genre: %s\tplays:%d\n",vo.genre,vo.play);
		}
	}

}
