package remoteControl;

public interface Remote_Control {

	public void turnOn();
    public void turnOff();
    public void setChannel(int newChannel);
    public void setVolume(int newVolumeLevel);
    public void channelUp();
    public void channelDown() ;
    public void volumeUp();
    public void volumeDown();
    public void channelList();
    
	void favoriteList(int FL);
 
}

