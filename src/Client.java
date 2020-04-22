public class Client {
    public void share(String str) {
        SocialMediaFacade service = new SocialMediaFacade(new Twitter(), new Facebook(), new LinkedIn());
        service.share(str);
    }
}
