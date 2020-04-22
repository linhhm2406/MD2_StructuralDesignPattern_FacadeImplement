public class LinkedIn implements SocialShare {
    private String strLinkedIn;
    @Override
    public void setMessage(String message) {
        this.strLinkedIn = message;
    }

    @Override
    public void share() {
        System.out.println("Share " + this.strLinkedIn);
    }
}