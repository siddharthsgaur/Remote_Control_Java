package remoteControl;

public interface Remote_Control {

	public void turnTVOn();
    public void turnTVOff();
    public void setTVChannel(int newChannel);
    public void setTvVolume(int newVolumeLevel);
    public void channelNext();
    public void channelDown() ;
    public void volumeUp();
    public void volumeDown();
    public void listOfChannel();
    
	void favoriteList(int FL);
 
}

