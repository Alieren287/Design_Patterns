public interface SocialNetwork {
    ProfileIterator createFriendIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}
