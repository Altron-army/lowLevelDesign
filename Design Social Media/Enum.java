public enum ConnectionInvitationStatus{
    PENDING,
    ACCEPTED,
    REJECTED,
    CANCELED
  }
  
  public enum AccountStatus{
    ACTIVE,
    CLOSED,
    CANCELED,
    BLACKLISTED,
    DISABLED
  }
  
  public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
  }