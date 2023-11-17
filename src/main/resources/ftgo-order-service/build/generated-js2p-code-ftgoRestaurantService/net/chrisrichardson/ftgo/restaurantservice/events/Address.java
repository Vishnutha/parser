
package net.chrisrichardson.ftgo.restaurantservice.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "street1",
    "street2",
    "city",
    "state",
    "zip"
})
public class Address {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street1")
    private String street1;
    @JsonProperty("street2")
    private String street2;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    private String city;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    private String state;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zip")
    private String zip;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street1")
    public String getStreet1() {
        return street1;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("street1")
    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public Address withStreet1(String street1) {
        this.street1 = street1;
        return this;
    }

    @JsonProperty("street2")
    public String getStreet2() {
        return street2;
    }

    @JsonProperty("street2")
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public Address withStreet2(String street2) {
        this.street2 = street2;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    public Address withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zip")
    public String getZip() {
        return zip;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public Address withZip(String zip) {
        this.zip = zip;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("street1");
        sb.append('=');
        sb.append(((this.street1 == null)?"<null>":this.street1));
        sb.append(',');
        sb.append("street2");
        sb.append('=');
        sb.append(((this.street2 == null)?"<null>":this.street2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("zip");
        sb.append('=');
        sb.append(((this.zip == null)?"<null>":this.zip));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.zip == null)? 0 :this.zip.hashCode()));
        result = ((result* 31)+((this.street1 == null)? 0 :this.street1 .hashCode()));
        result = ((result* 31)+((this.street2 == null)? 0 :this.street2 .hashCode()));
        result = ((result* 31)+((this.state == null)? 0 :this.state.hashCode()));
        result = ((result* 31)+((this.city == null)? 0 :this.city.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Address) == false) {
            return false;
        }
        Address rhs = ((Address) other);
        return ((((((this.zip == rhs.zip)||((this.zip!= null)&&this.zip.equals(rhs.zip)))&&((this.street1 == rhs.street1)||((this.street1 != null)&&this.street1 .equals(rhs.street1))))&&((this.street2 == rhs.street2)||((this.street2 != null)&&this.street2 .equals(rhs.street2))))&&((this.state == rhs.state)||((this.state!= null)&&this.state.equals(rhs.state))))&&((this.city == rhs.city)||((this.city!= null)&&this.city.equals(rhs.city))));
    }

}
