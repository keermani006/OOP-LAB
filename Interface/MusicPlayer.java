interface MusicPlayer {
    void play();
    void stop();
}

class MP3Player implements MusicPlayer {
    public void play() {
        System.out.println("Playing MP3 music...");
    }

    public void stop() {
        System.out.println("MP3 music stopped.");
    }
}

class StreamingPlayer implements MusicPlayer {
    public void play() {
        System.out.println("Streaming music online...");
    }

    public void stop() {
        System.out.println("Streaming stopped.");
    }
}

public class InterfaceExample4 {
    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3Player();
        mp3.play();
        mp3.stop();

        MusicPlayer stream = new StreamingPlayer();
        stream.play();
        stream.stop();
    }
}
