package remoteControl;

import java.util.ArrayList;
import java.util.List;

public class TV_Remote implements Remote_Control{
	static int channel = 1; 
    static int volumeLevel = 1; 
    static boolean on = false;
    List<Integer> favoriteList=new ArrayList<Integer>();
    int[] channelList= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
    public  TV_Remote() {
		
	} 
	
	public void turnTVOn() {
		
		on=true;
	}

	@Override
	public void turnTVOff() {
		on=false;
		
	}

	
	public void setTVChannel(int newChannel) {
		if (on && newChannel >= 1 && newChannel <= 50) {
            channel = newChannel;
        }
		
	}

	
	public void setTvVolume(int newVolumeLevel) {
		 if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
	            volumeLevel = newVolumeLevel;
	        }
		
	}

	
	public void channelNext() {
		 if (on && channel < 50) {
	            channel++;
	        }
		
	}

	public void channelDown() {
		 if (on && channel > 1) {
	            channel--;
	        }
		
	}

	
	public void volumeUp() {
		if (on && volumeLevel < 7) {
            volumeLevel++;
        }
	}

	public void volumeDown() {
		if (on && volumeLevel > 1) {
            volumeLevel--;
        }
		
	}
	public void listOfChannel() {
		
		System.out.println(channelList);
	}
	
	
	public void favoriteList(int FL) {
		favoriteList.add(FL);
		
	}

	
	
	public void displayFavoriteList() {
		System.out.println(favoriteList);
	}

	

}
