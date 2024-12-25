public class ConnectionInvitation {
    private Member memberInvited;
    private ConnectionInvitationStatus status;
    private Date dateCreated;
    private Date dateUpdated;
  
    public bool acceptConnection();
    public bool rejectConnection();
  }
  