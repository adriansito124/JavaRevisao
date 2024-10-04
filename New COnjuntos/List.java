import java.util.ArrayList;

public class List<T> implements Set<T>{

    private ArrayList<T> listExist;
    private ArrayList<T> listUnity;
    private ArrayList<T> listIntersection;
    private ArrayList<T> listDifference;
    
    public List() {
        this.listExist =  new ArrayList<>();
        this.listUnity = new ArrayList<>();
        this.listIntersection = new ArrayList<>();
        this.listDifference = new ArrayList<>();
    }
    
    @Override
    public void add(T value) {
        
        listExist.add(value);
    }
    
    @Override
    public boolean exist(T value) {
        
        return listExist.contains(value);
    }
    
    @Override
    public ArrayList<T> unity(List<T> list1, List<T> list2) {
        
        for (int i = 0; i < list1.getList().size(); i++) {
            T element = list1.getList().get(i);
            listUnity.add(element);
        }
        
        for (int i = 0; i < list2.getList().size(); i++) {
            T element = list2.getList().get(i);
            
            if (!list1.exist(element)) {
                
                listUnity.add(element);
            }
        }
        
        return listUnity;
    }
    
    @Override
    public ArrayList<T> intersection(List<T> list1, List<T> list2) {
        
        for (int i = 0; i < list1.getList().size(); i++) {
            T element = list1.getList().get(i);
            
            if (list2.exist(element)) {
                
                listIntersection.add(element);
            }
        }
        
        return listIntersection;
    }
    
    @Override
    public ArrayList<T> difference(List<T> list1, List<T> list2) {

        for (int i = 0; i < list1.getList().size(); i++) {
            T element = list1.getList().get(i);
            
            if (!list2.exist(element)) {
                
                listDifference.add(element);
            }
        }
        
        return listDifference;
        
    }
    
    public ArrayList<T> getList() {
        return listExist;
    }
    
    public void setList(ArrayList<T> list) {
        this.listExist = list;
    }
    
    public ArrayList<T> getListUnity() {
        return listUnity;
    }
    
    public void setListUnity(ArrayList<T> listUnity) {
        this.listUnity = listUnity;
    }
    
    public ArrayList<T> getListIntersection() {
        return listIntersection;
    }
    
    public void setListIntersection(ArrayList<T> listIntersection) {
        this.listIntersection = listIntersection;
    }

    public ArrayList<T> getListDifference() {
        return listDifference;
    }
    
    public void setListDifference(ArrayList<T> listDifference) {
        this.listDifference = listDifference;
    }

   
}


