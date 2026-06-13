public class Address implements Cloneable {

    private String address1;
    private String address2;
    private String city;
    private State state;
    private String zipCode;

    /**
        * Construct an Address object
        * @Param address1 first address line
        * @param address2 second address line
        * @param city city name
        * @param state state abbreviation
        * @param zipCode ZIP code
        */
    public Address(String address1, String address2,String city, State state,String zipCode) {

            this.address1 = address1;
            this.address2 = address2;
            this.city = city;
            this.state = state;
            this.zipCode = zipCode;
        }

        /**
        * Copy constructor.
        * @param other Address object to copy
        * @throws CloneNotSupportedException if cloning fails
        */
        
        public Address(Address other)
        
        throws CloneNotSupportedException {

        Address copy = other.clone();

        this.address1 = copy.address1;
        this.address2 = copy.address2;
        this.city = copy.city;
        this.state = copy.state;
        this.zipCode = copy.zipCode;
        }
        /**
         * returns the first address line
         * @return first address line
         */
        public String getAddress1() {
            return address1;
        }
        /**
         * sets the first address line
         * @param address1 new first address line
         */
        public void setAddress1(String address1) {
            this.address1 = address1;
        }
        /**
         * returns the second address line
         * @return second address line
         */
        public String getAddress2() {
            return address2;
        }
        /**
         * sets the second address line
         * @param address2 new second address line
         */

        public void setAddress2(String address2) {
            this.address2 = address2;
        }
        /**
         * returns the city
         * @return city name
         */
        public String getCity() {
            return city;
        }
        /**
         * sets the city
         * @param city new city name
         */
        public void setCity(String city) {
            this.city = city;
        }
        /**
         * returns the state abbreviation
         * @return state abbreviation
         */
        public State getState() {
            return state;
        }
        /**
         * sets the state abbreviation
         * @param state new state abbreviation
         */
        public void setState(State state) {
            this.state = state;
        }
        /**
         * returns the Zip code
         * @return ZIP code
         */
        public String getZipCode() {
            return zipCode;
        }
        /**
         * sets the Zipcode
         * @param zipCode new ZIP code
         */
        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }
        /**
         * creates and returns a copy of this address
         * @return cloned address object
         * @throws cloneNotSupportedException if cloning is not supported
         */
        @Override
        public Address clone()
        throws CloneNotSupportedException {

            return (Address) super.clone();
        }
        /**
         * returns a string representation of the address
         * @return formatted address information
         */
        @Override
        public String toString() {
            return address1 + "\n"+ address2 + "\n"+ city + ", "+ state + " "+ zipCode;
    }
}
