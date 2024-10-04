import java.util.ArrayList;

class ListManager {
    
    private ArrayList<List> lists;

    public ListManager() {
        this.lists = new ArrayList<>();
    }
    
    public void addList(List newList) {
        lists.add(newList);
    }
    
    public List getList(int index) {
        if (index >= 0 && index < lists.size()) {
            return lists.get(index);
        }
        return null; 
    }
    
    public ArrayList<List> getAllLists() {
        return lists;
    }
}