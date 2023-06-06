package PaginationHelper;

import java.util.List;

public class Kata<I> {
    private List<I> items;
    private int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    // TODO: complete this object/class
    public Kata(List<I> collection, int itemsPerPage) {
        this.items = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return this.items.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        return (int) Math.ceil((double) this.items.size() / this.itemsPerPage);
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        System.out.println("this.items.size();" + this.items.size());
        System.out.println("page count" + this.pageCount());
        System.out.println("this.itemsPerPage" + this.itemsPerPage);
        System.out.println("pageIndex" + pageIndex);
        System.out.println(this.pageCount());
        System.out.println("===========");
        if (pageIndex >= this.pageCount() || pageIndex < 0) return -1;
        if (pageIndex == 0 && this.pageCount() == 1) return this.items.size();
        if (pageIndex == this.pageCount() -1 ) {
            if (this.items.size() % this.itemsPerPage == 0) {
                return this.items.size() - (this.itemsPerPage*pageIndex);
            } else {
                return this.items.size() % this.itemsPerPage;
            }
        }
        else return this.itemsPerPage;
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (this.items.size() == 0) return -1;
        if (itemIndex > this.items.size() - 1 || itemIndex < 0) return -1;
        return (itemIndex / this.itemsPerPage);
    }
}

