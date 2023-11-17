
package net.chrisrichardson.ftgo.consumerservice.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.eventuate.tram.commands.common.Command;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "consumerId",
    "orderId",
    "orderTotal"
})
public class ValidateOrderByConsumer implements Command
{

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consumerId")
    private Long consumerId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("orderId")
    private Long orderId;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("orderTotal")
    private String orderTotal;

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consumerId")
    public Long getConsumerId() {
        return consumerId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("consumerId")
    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    public ValidateOrderByConsumer withConsumerId(Long consumerId) {
        this.consumerId = consumerId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("orderId")
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("orderId")
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public ValidateOrderByConsumer withOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("orderTotal")
    public String getOrderTotal() {
        return orderTotal;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("orderTotal")
    public void setOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
    }

    public ValidateOrderByConsumer withOrderTotal(String orderTotal) {
        this.orderTotal = orderTotal;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ValidateOrderByConsumer.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("consumerId");
        sb.append('=');
        sb.append(((this.consumerId == null)?"<null>":this.consumerId));
        sb.append(',');
        sb.append("orderId");
        sb.append('=');
        sb.append(((this.orderId == null)?"<null>":this.orderId));
        sb.append(',');
        sb.append("orderTotal");
        sb.append('=');
        sb.append(((this.orderTotal == null)?"<null>":this.orderTotal));
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
        result = ((result* 31)+((this.orderId == null)? 0 :this.orderId.hashCode()));
        result = ((result* 31)+((this.consumerId == null)? 0 :this.consumerId.hashCode()));
        result = ((result* 31)+((this.orderTotal == null)? 0 :this.orderTotal.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ValidateOrderByConsumer) == false) {
            return false;
        }
        ValidateOrderByConsumer rhs = ((ValidateOrderByConsumer) other);
        return ((((this.orderId == rhs.orderId)||((this.orderId!= null)&&this.orderId.equals(rhs.orderId)))&&((this.consumerId == rhs.consumerId)||((this.consumerId!= null)&&this.consumerId.equals(rhs.consumerId))))&&((this.orderTotal == rhs.orderTotal)||((this.orderTotal!= null)&&this.orderTotal.equals(rhs.orderTotal))));
    }

}
