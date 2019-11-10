package shejimoshi.iteratorPattern;

/**
 * @ClassName: BookShelfIterator
 * @author: csh
 * @date: 2019/11/2  14:41
 * @Description:       遍历book 的迭代器
 */

public class BookShelfIterator implements Iterator {

    BookShelf bookShelf;
    int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
        index=0;
    }
    public boolean hasNext() {
        if(index<this.bookShelf.getLength()){
            return true;
        }
        return false;
    }

    public Object next() {
        return bookShelf.findBookAt(index++);
    }
}
