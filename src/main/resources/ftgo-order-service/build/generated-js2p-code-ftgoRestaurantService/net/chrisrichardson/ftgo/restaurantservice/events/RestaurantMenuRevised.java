
package net.chrisrichardson.ftgo.restaurantservice.events;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.eventuate.tram.events.common.DomainEvent;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "menu"
})
public class RestaurantMenuRevised implements DomainEvent
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menu")
    private Menu__1 menu;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menu")
    public Menu__1 getMenu() {
        return menu;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("menu")
    public void setMenu(Menu__1 menu) {
        this.menu = menu;
    }

    public RestaurantMenuRevised withMenu(Menu__1 menu) {
        this.menu = menu;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RestaurantMenuRevised.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.menu == null)? 0 :this.menu.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestaurantMenuRevised) == false) {
            return false;
        }
        RestaurantMenuRevised rhs = ((RestaurantMenuRevised) other);
        return ((this.menu == rhs.menu)||((this.menu!= null)&&this.menu.equals(rhs.menu)));
    }

}
