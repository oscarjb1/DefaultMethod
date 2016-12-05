package com.osb.defaultmethod;

import java.util.List;

/**
 * @author Oscar Blancarte
 */
public interface IOrder {
    
    public List<IOrderItem> getOrderItem();
    
    public default double getTotal(){
        double total = 0;
        for (IOrderItem item : getOrderItem()) {
            total += item.getTotal();
        }
        return total;
    }
    
    public default void addOrderItem(IOrderItem orderItem){
        getOrderItem().add(orderItem);
    }
}
