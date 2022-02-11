package Services;

import Services.Apps.Intelgram.Intelgram;
import Services.service.ImageToFriends;
import Services.service.ImageToFamily;

public class App {
    public static void main(String args[]){
        Intelgram intelgram = new Intelgram();
        String shareToWhom = "Family";
        if(shareToWhom.equals("Family")){
            ImageToFamily imageTofamily = new ImageToFamily();
            intelgram.imageShare(imageTofamily);
        }
        else{

            ImageToFriends imageToFriends = new ImageToFriends();
            intelgram.imageShare(imageToFriends);
        }
    }
}
