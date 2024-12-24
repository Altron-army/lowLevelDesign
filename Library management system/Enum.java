 enum BookFormat { HARDCOVER, PAPERBACK, AUDIO_BOOK, EBOOK, NEWSPAPER, MAGAZINE, JOURNAL } 
 enum BookStatus { AVAILABLE, RESERVED, LOANED, LOST } 
 enum ReservationStatus{ WAITING, PENDING, CANCELED, NONE } 
 enum AccountStatus{ ACTIVE, CLOSED, CANCELED, BLACKLISTED, NONE }

 class Address { 
    private String streetAddress;
     private String city;
      private String state;
       private String zipCode;
        private String country;
     } 
      class Person { 
        private String name;
         private Address address;
          private String email;
           private String phone; 
        } 
        
         class Constants { 
            public static final int MAX_BOOKS_ISSUED_TO_A_USER = 5; 
            public static final int MAX_LENDING_DAYS = 10;
     }