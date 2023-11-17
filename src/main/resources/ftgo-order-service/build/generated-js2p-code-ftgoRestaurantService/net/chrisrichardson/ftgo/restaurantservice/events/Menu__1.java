
package net.chrisrichardson.ftgo.restaurantservice.events;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "menuItems"
})
public class Menu__1 {

    @JsonProperty("menuItems")
    private List<MenuItem> menuItems = new ArrayList<MenuItem>();

    @JsonProperty("menuItems")
    public List<MenuItem> getMenuItems() {
        return menuItems;
    }

    @JsonProperty("menuItems")
    public void setMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public Menu__1 withMenuItems(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Menu__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("menuItems");
        sb.append('=');
        sb.append(((this.menuItems == null)?"<null>":this.menuItems));
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
        result = ((result* 31)+((this.menuItems == null)? 0 :this.menuItems.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Menu__1) == false) {
            return false;
        }
        Menu__1 rhs = ((Menu__1) other);
        return ((this.menuItems == rhs.menuItems)||((this.menuItems!= null)&&this.menuItems.equals(rhs.menuItems)));
    }

}
