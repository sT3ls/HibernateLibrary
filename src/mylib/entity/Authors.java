package mylib.entity;
// Generated 04.10.2012 18:41:28 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Authors generated by hbm2java
 */
public class Authors  implements java.io.Serializable {


     private Integer idAuthor;
     private String authorName;
     private Set linkses = new HashSet(0);

    public Authors() {
    }

	
    public Authors(String authorName) {
        this.authorName = authorName;
    }
    public Authors(String authorName, Set linkses) {
       this.authorName = authorName;
       this.linkses = linkses;
    }
   
    public Integer getIdAuthor() {
        return this.idAuthor;
    }
    
    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }
    public String getAuthorName() {
        return this.authorName;
    }
    
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public Set getLinkses() {
        return this.linkses;
    }
    
    public void setLinkses(Set linkses) {
        this.linkses = linkses;
    }




}


