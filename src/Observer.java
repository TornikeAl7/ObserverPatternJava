public interface Observer {
    void onMessageRecieved(String message);
    void onFriendRequestRecieved(String username);

    void onPostCreated(String post);

    void onCommentAdded(String post,String comment);

    void onPostLiked(String post,String username);
    void onPostShared(String post, String username);
}
