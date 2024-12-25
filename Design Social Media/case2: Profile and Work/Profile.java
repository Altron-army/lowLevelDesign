public class Profile {
    private byte[] profilePicture;
    private byte[] coverPhoto;
    private String gender;
  
    private List<Work> workExperiences;
    private List<Education> educations;
    private List<Place> places;
    private List<Stat> stats;
  
    public boolean addWorkExperience(Work work);
    public boolean addEducation(Education education);
    public boolean addPlace(Place place);
  }
