package mylib.entity;
// Generated 04.10.2012 18:41:28 by Hibernate Tools 3.2.1.GA



/**
 * Links generated by hbm2java
 */
public class Links  implements java.io.Serializable {


     private Integer id;
     private Books books;
     private Authors authors;

    public Links() {
    }

    public Links(Books books, Authors authors) {
       this.books = books;
       this.authors = authors;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Books getBooks() {
        return this.books;
    }
    
    public void setBooks(Books books) {
        this.books = books;
    }
    public Authors getAuthors() {
        return this.authors;
    }
    
    public void setAuthors(Authors authors) {
        this.authors = authors;
    }




}


