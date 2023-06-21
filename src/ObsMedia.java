import java.util.ArrayList;
import java.util.List;

public class ObsMedia {
    private List<Observer> obs = new ArrayList<>();

    public void registerObservers(Observer observer){
        obs.add(observer);
    }

    public void removeObserver(Observer observer){
        obs.remove(observer);
    }

    public void notifiObservers(String message){
        for(Observer observer : obs){
            observer.onFriendRequestRecieved(message);
        }
    }

    public void notifyOnMessageRecieved(String username){
        for(Observer observer : obs){
            observer.onMessageRecieved(username);
        }
    }

    public void notifyOnPostCreated(String post){
        for(Observer observer : obs){
            observer.onPostCreated(post);
        }
    }

    public void notifyOnCommentAdded(String post,String comment){
        for(Observer observer : obs){
            observer.onCommentAdded(post,comment);
        }
    }

    public void notifyOnPostLiked(String post,String username){
        for(Observer observer : obs){
            observer.onPostLiked(post,username);
        }
    }

    public void notifyOnPostShared(String post,String username){
        for(Observer observer : obs){
            observer.onPostShared(post,username);
        }
    }
}
