public class Facebook implements SocialShare {
    private String strFacebook;
    @Override
    public void setMessage(String message) {
        this.strFacebook = message;
    }

    @Override
    public void share() {
        System.out.println("Share " + this.strFacebook);
    }
}