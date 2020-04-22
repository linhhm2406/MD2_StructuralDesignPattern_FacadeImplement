public class Twitter implements SocialShare {
    private String strTwitter;
    @Override
    public void setMessage(String message) {
        this.strTwitter = message;
    }

    @Override
    public void share() {
        System.out.println("Share " + this.strTwitter);
    }
}