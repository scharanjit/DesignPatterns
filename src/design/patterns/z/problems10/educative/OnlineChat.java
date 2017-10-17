package design.patterns.z.problems10.educative;

import java.util.Date;

public class OnlineChat {
}

/**
 * Assume we'll focus on the following workflows:
 Text conversations only
 Users
    Add a user
    Remove a user
    Update a user
 Add to a user's friends list
    Add friend request
    Approve friend request
    Reject friend request
    Remove from a user's friends list
 Create a group chat
    Invite friends to a group chat
    Post a message to a group chat
 Private 1-1 chat
    Invite a friend to a private chat
    Post a message to a private chat

 No need to worry about scaling initially
 */

class UserService{
    void addUSer(){

    }

    void removeUser(){

    }

    void addFriendRequest(){

    }
    void apporveFriendRequest(){

    }
    void rejectFriendRequest(){

    }
}


class User{

    long userId;
    String userName;
    public User(long userId,String username){
        this.userId=userId;
        this.userName=username;

    }
    void messageUser(long frndId, String message){}

    void meesageGroup(long groupId, String message ){}

    void sendFriendRequest(long friendId){}

    void receiveFriendRequest(long friendId){}

    void approveFriendRequest(long friendId){}

    void rejectFriendRequest(long friendId){}
}



class Chat{

    long chatId;
    public Chat(long chatId){
        this.chatId= chatId;
    }

    User user;
}


class PrivateChat{

}

class GroupChat{
    void addUser(User user){}
    void removeUser(User user){}
}

class Message{
    long messageId;
    String message;
    Date timeStamp;
    public Message(long messageId,String message,Date timeStamp){
        this.message=message;
        this.messageId=messageId;
        this.timeStamp=timeStamp;
    }
}

class AddRequest{
    long fromUserId;
    long toUserId;
    RequestStatus requestStatus;
    Date timeStamp;
    public AddRequest(long fromUserId,long toUserId, RequestStatus requestStatus, Date timeStamp) {

        this.fromUserId=fromUserId;
        this.toUserId= toUserId;
        this.requestStatus=requestStatus;
        this.timeStamp=timeStamp;

    }
}


enum RequestStatus{
    UNREAD,
    READ,
    ACCEPTED,
    REJECTED;
}