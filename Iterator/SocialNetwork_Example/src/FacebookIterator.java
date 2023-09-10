public class FacebookIterator implements ProfileIterator {
    Facebook facebook;
    String profileId;
    String type;
    int currentPosition;
    Profile[] cache;

    public FacebookIterator(
            Facebook facebook,
            String profileId,
            String type
    ){
        this.facebook = facebook;
        this.profileId = profileId;
        this.type = type;
    }

    public void lazyInit() {
        if (cache == null) {
            cache = facebook.socialGraphRequest(profileId, type);
        }
    }

    public Profile getNext() {
        if (hasMore()) {
            Profile result = cache[currentPosition];
            currentPosition++;
            return result;
        }
        else {
            System.out.println("There is no element next");
            return null;
        }
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }

}
