package Services.Apps.Intelgram;

import Services.Relations.Family;
import Services.Relations.Friends;
import Services.Relations.MutualConnections;
import Services.service.ImageService;

public class Intelgram implements  ImageService, Family , MutualConnections , Friends {


    public void imageShare(ImageService obj) {
        obj.imageShare();
    }


    @Override
    public void family() {

    }

    @Override
    public void mutualConnect() {

    }
    @Override
    public void friend(){

    }

    @Override
    public void imageShare() {

    }
}
