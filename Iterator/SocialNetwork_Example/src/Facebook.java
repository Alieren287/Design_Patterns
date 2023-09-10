public class Facebook implements SocialNetwork {
    @Override
    public ProfileIterator createFriendIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return new FacebookIterator(this, profileId, "friends");
    }

    public Profile[] socialGraphRequest(String profileId, String type) {
        return new Profile[]{new Profile(), new Profile()};
    }
}
