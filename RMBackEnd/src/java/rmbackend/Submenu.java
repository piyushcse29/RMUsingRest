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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "submenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Submenu.findAll", query = "SELECT s FROM Submenu s"),
    @NamedQuery(name = "Submenu.findBySubmenuName", query = "SELECT s FROM Submenu s WHERE s.submenuName = :submenuName"),
    @NamedQuery(name = "Submenu.findBySubmenuId", query = "SELECT s FROM Submenu s WHERE s.submenuId = :submenuId"),
    @NamedQuery(name = "Submenu.findByMenuId", query = "SELECT s FROM Submenu s WHERE s.menuId = :menuId")})
public class Submenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "submenu_name")
    private String submenuName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "submenu_id")
    private Integer submenuId;
    @Column(name = "menu_id")
    private Integer menuId;

    public Submenu() {
    }

    public Submenu(Integer submenuId) {
        this.submenuId = submenuId;
    }

    public Submenu(Integer submenuId, String submenuName) {
        this.submenuId = submenuId;
        this.submenuName = submenuName;
    }

    public String getSubmenuName() {
        return submenuName;
    }

    public void setSubmenuName(String submenuName) {
        this.submenuName = submenuName;
    }

    public Integer getSubmenuId() {
        return submenuId;
    }

    public void setSubmenuId(Integer submenuId) {
        this.submenuId = submenuId;
    }

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (submenuId != null ? submenuId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Submenu)) {
            return false;
        }
        Submenu other = (Submenu) object;
        if ((this.submenuId == null && other.submenuId != null) || (this.submenuId != null && !this.submenuId.equals(other.submenuId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rmbackend.Submenu[ submenuId=" + submenuId + " ]";
    }
    
}
