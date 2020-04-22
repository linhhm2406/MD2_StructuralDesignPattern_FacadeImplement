public class SocialMediaFacade {
    private Twitter twitter;
    private Facebook facebook;
    private LinkedIn linkedin;

    public SocialMediaFacade(Twitter twitter, Facebook facebook, LinkedIn linkedin){
        this.twitter = twitter;
        this.facebook = facebook;
        this.linkedin = linkedin;
    }

    public void share (String string){
        this.twitter.setMessage(string);
        this.facebook.setMessage(string);
        this.linkedin.setMessage(string);
        this.twitter.share();
        this.facebook.share();
        this.linkedin.share();
    }
}
