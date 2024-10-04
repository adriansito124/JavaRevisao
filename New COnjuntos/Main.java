public class Main
{
    public static void main(String[] args)
    {
        ListManager listona = new ListManager();
        Ligacao together = new Ligacao();
        List list1 = new List();
        List list2 = new List();
        
        list1.add(10);
        list1.add(20);
        list2.add(20);
        list2.add(40);

        listona.addList(list1);
        listona.addList(list2);

        together.juntar(list1, list2);
        
        // System.out.println(list1.getList());
        // System.out.println(list2.exist(20));

        System.out.println(together.getList()); 

        // System.out.println(listona.getList(1).getList());

    }
}
