package shejimoshi.iteratorPattern;

/**
 * @ClassName: BookShelf
 * @author: csh
 * @date: 2019/11/2  14:39
 * @Description:
 */

public class BookShelf implements Aggregate {
    private Book[] books;
    int pointer=0;
    public BookShelf(int max_size){
        books=new Book[max_size];
    }
    public void appendBook(Book book){
        books[pointer]=book;
        pointer++;
    }
    public Book findBookAt(int index){
        return books[index];
    }
    public int getLength(){
        return pointer;
    }
    public Iterator iterator(){
        return new BookShelfIterator(this);
    }
}