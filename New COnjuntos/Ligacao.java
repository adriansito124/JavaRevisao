import java.util.ArrayList;

public class Ligacao {
    
    private ArrayList<Integer> junto;

    public ArrayList<Integer> juntar(List lista1, List lista2) {

        junto = new ArrayList<>();


        for(int i = 0; i < lista1.getList().size(); i++)
        {
            Integer elemento = lista1.getList().get(i);
            junto.add(elemento);    
        }

        for(int i = 0; i < lista2.getList().size(); i++)
        {
            Integer elemento = lista2.getList().get(i);
            if (!lista1.exist(elemento)) 
            {
                junto.add(elemento);    
            }
        }
        
        
        return junto;
    }

    public ArrayList<Integer> getList() {
        return junto;
    }

}
