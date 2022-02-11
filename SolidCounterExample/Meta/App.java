package Meta;

import Meta.Apps.Intelgram;

public class App {
    public static void main(String args[]){
        Intelgram Iobj = new Intelgram();
        String shareToWhom = "Family";
        if(shareToWhom == "Family"){
            Iobj.imageToFamily();
        }
        else{
            Iobj.imageToFriends();
        }
    }
}
