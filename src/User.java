import java.util.ArrayList;
import java.util.List;

public class User implements Observer {
    private String username;
    private List<String> notifications = new ArrayList<>();

    public User(String username){
        this.username=username;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public List<String> getNotifications() {
        return notifications;
    }

    public void setNotifications(List<String> notifications) {
        this.notifications = notifications;
    }


    @Override
    public void onMessageRecieved(String message){
        String notification = "New message " + message;
        notifications.add(notification);
        System.out.println(username + " recieved a notification: " + message);
    }

    @Override
    public void onFriendRequestRecieved(String username){
        String notification = "New friend request from " + username;
        notifications.add(notification);
        System.out.println(this.username + "recieved a notification: " + notification );
    }

    @Override
    public void onPostCreated(String post){
        String notification = "New post: " + post;
        notifications.add(notification);
        System.out.println(username + "recieved a notification: " + notification);
    }

    @Override
    public void onCommentAdded(String post,String comment){
        String notification = "New comment on post '" + post + "': " + comment;
        notifications.add(notification);
        System.out.println(username + " received a notification: " + notification);
    }

    @Override
    public void onPostLiked(String post,String username){
        String notification =  username + " liked your post: " + post;
        notifications.add(notification);
        System.out.println(this.username + " received a notification: " + notification);
    }

    public void onPostShared(String post,String username){
        String notification = username + " shared your post: " + post;
        notifications.add(notification);
        System.out.println(this.username + " received a notification: " + notification);
    }

}
