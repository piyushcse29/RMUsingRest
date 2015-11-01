/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmbackend;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author piymitta
 */
@Entity
@Table(name = "orderdes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderdes.findAll", query = "SELECT o FROM Orderdes o"),
    @NamedQuery(name = "Orderdes.findByOrderId", query = "SELECT o FROM Orderdes o WHERE o.orderId = :orderId"),
    @NamedQuery(name = "Orderdes.findBySubmenuId", query = "SELECT o FROM Orderdes o WHERE o.submenuId = :submenuId"),
    @NamedQuery(name = "Orderdes.findByQuantity", query = "SELECT o FROM Orderdes o WHERE o.quantity = :quantity")})
public class Orderdes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "order_id")
    private Integer orderId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "submenu_id")
    private int submenuId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "quantity")
    private String quantity;
    @Lob
    @Size(max = 65535)
    @Column(name = "comments")
    private String comments;

    public Orderdes() {
    }

    public Orderdes(Integer orderId) {
        this.orderId = orderId;
    }

    public Orderdes(Integer orderId, int submenuId, String quantity) {
        this.orderId = orderId;
        this.submenuId = submenuId;
        this.quantity = quantity;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public int getSubmenuId() {
        return submenuId;
    }

    public void setSubmenuId(int submenuId) {
        this.submenuId = submenuId;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderId != null ? orderId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orderdes)) {
            return false;
        }
        Orderdes other = (Orderdes) object;
        if ((this.orderId == null && other.orderId != null) || (this.orderId != null && !this.orderId.equals(other.orderId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rmbackend.Orderdes[ orderId=" + orderId + " ]";
    }
    
}
