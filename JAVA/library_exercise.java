
class library{
    String []books ;
    int no_of_books ;

    library(){
        this.books = new String[10];
        this.no_of_books =0;
    }

    void addbook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book +" has been added ! ");
    }

    void showavailablebook(){
        System.out.println("Available book are !");
        for(String book : this.books){
            if(book == null){
                continue;
            } 
            System.out.println("* "+ book);
        }
    }

    void issuebook(String book){
        for(int i =0 ;i<this.books.length; i++){
            if(this.books[i]==book){
                System.out.println(book +" book has issue " );
                this.books[i]=null;
                return;
            }
        }
        System.out.println(book +"book is not available !");
    }

    void returnbook(String book){
        addbook(book);
    }
}



public class library_exercise {
    public static void main(String[] args) {
        
        library nrup = new library();

        nrup.addbook("c++");
        nrup.addbook("java book");
        nrup.addbook("python");

        nrup.showavailablebook();

        nrup.issuebook("c++");
        nrup.issuebook("c language");

        nrup.showavailablebook();

        nrup.returnbook("c++");

        nrup.showavailablebook();
    }
    
}
