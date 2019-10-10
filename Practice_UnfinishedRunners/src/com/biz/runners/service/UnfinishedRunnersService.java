package com.biz.runners.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class UnfinishedRunnersService {
	
	public List<String> solution(String[] participant, String[] completion) {
	      List<String> mParticipants=new ArrayList<String>();
	      List<String> mCompletion=new ArrayList<String>();
	      for(int i=0;i<participant.length;i++) {
	    	  mParticipants.add( participant[i]);
	      }
	      for(int i=0;i<completion.length;i++) {
	    	  mCompletion.add( participant[i]);
	      }
	      int i=0,j=0;
	      for(i=0;i<mParticipants.size();i++) {
	    	  j=0;
	    	  for(j=0; j<mCompletion.size();j++) {
	    		  if(mParticipants.get(i).equalsIgnoreCase(mCompletion.get(j))) {
	    			  mParticipants.remove(i);
	    			  mCompletion.remove(j);
	    			  i=0;
	    		  }
	    	  }
	      }

	       return mParticipants;
	   }
}
