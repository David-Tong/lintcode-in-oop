import impl.MediaAdapter;
import impl.MusicPlayer;
import impl.VideoPlayer;

public class Main {

    public static void main(String[] args) {

        MediaAdapter musicPlayer = new MediaAdapter(new MusicPlayer());
        musicPlayer.play();
        MediaAdapter videoPlayer = new MediaAdapter(new VideoPlayer());
        videoPlayer.play();

    }

}
