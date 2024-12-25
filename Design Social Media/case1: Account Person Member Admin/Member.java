public class Member extends Person {
    private Integer memberId;
    private Date dateOfMembership;
    private String name;
  
    private Profile profile;
    private HashSet<Integer> memberFollows;
    private HashSet<Integer> memberConnections;
    private HashSet<Integer> pageFollows;
    private HashSet<Integer> memberSuggestions;
    private HashSet<ConnectionInvitation> connectionInvitations;
    private HashSet<Integer> groupFollows;
  
    public boolean sendMessage(Message message);
    public boolean createPost(Post post);
    public boolean sendConnectionInvitation(ConnectionInvitation invitation);
    private Map<Integer, Integer> searchMemberSuggestions();
  }
  