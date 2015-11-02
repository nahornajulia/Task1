/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.task1;

/**
 *
 * @author julia
 */
public class Customer implements Comparable {

    private final String customName;
    private final int customId;
    
    public Customer(String customName, int customId){
        this.customId = customId;
        this.customName = customName;
    }

    public String getCustomName() {
        return customName;
    }
    public int getCustomId() {
        return customId;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.customId;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (this.customId != other.customId) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Object o) {
        Customer c = (Customer) o;

        if (c.customId < customId) {
            return 1;
        } else {
            if (c.customId > customId) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
