public class Video {

    private String videoTitle;
    private boolean isCheckedOut;
    private int currentRating;

    public Video(String name) {
        this.videoTitle = name;
        this.isCheckedOut = false;
        this.currentRating = 0;
    }

    public String getName() {
        return videoTitle;
    }

    public void doCheckout() {
        isCheckedOut = true;
    }

    public void doReturn() {
        isCheckedOut = false;
    }

    public void receiveRating(int rating) {
        currentRating = rating;
    }

    public int getRating() {
        return currentRating;
    }

    public boolean getCheckout() {
        return isCheckedOut;
    }
}
