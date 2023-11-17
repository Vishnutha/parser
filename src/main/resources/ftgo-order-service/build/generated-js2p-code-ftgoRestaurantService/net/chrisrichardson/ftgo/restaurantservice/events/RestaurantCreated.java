
package net.chrisrichardson.ftgo.restaurantservice.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.eventuate.tram.events.common.DomainEvent;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "address",
    "menu"
})
public class RestaurantCreated implements DomainEvent
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    private String name;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    private Address address;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menu")
    private Menu menu;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public RestaurantCreated withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    public RestaurantCreated withAddress(Address address) {
        this.address = address;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menu")
    public Menu getMenu() {
        return menu;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menu")
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public RestaurantCreated withMenu(Menu menu) {
        this.menu = menu;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RestaurantCreated.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("menu");
        sb.append('=');
        sb.append(((this.menu == null)?"<null>":this.menu));
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
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.menu == null)? 0 :this.menu.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestaurantCreated) == false) {
            return false;
        }
        RestaurantCreated rhs = ((RestaurantCreated) other);
        return ((((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name)))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.menu == rhs.menu)||((this.menu!= null)&&this.menu.equals(rhs.menu))));
    }

}
