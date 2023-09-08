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

        }
    }

    public Profile getNext() {
        return cache[currentPosition+1];
    }

    @Override
    public boolean hasMore() {
        return false;
    }

}
