package remoteControl;

import java.util.Scanner;

public class Remote_main {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int channel=s.nextInt();
		Scanner s1=new Scanner(System.in);
		int Vol=s1.nextInt();
		TV_Remote TVR=new TV_Remote();
		TVR.turnTVOn();
		TVR.setTVChannel(channel);
		TVR.setTvVolume(Vol);
		TVR.channelDown();
		TVR.channelNext();
		TVR.volumeDown();
		TVR.volumeUp();
		TVR.listOfChannel();
		Scanner s2=new Scanner(System.in);
		int FL=s1.nextInt();
		TVR.favoriteList(FL);
		TVR.displayFavoriteList();
		

	}

}
