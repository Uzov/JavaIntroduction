import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Notebook> setOfNotebooks = new HashSet<>();
        setOfNotebooks.add(new NotebookBuilder().setName("Notebook 1").setRAM(8).setOS("Windows10").
                setPrice(80000).setModel("HP").setColor("белый").setHDD(1024).createNotebook());
        setOfNotebooks.add(new NotebookBuilder().setName("Notebook 2").setRAM(16).setOS("Windows10").
                setPrice(85000).setModel("Asus").setColor("серый").setHDD(1024).createNotebook());
        setOfNotebooks.add(new NotebookBuilder().setName("Notebook 3").setRAM(32).setOS("linux").
                setPrice(85000).setModel("Lenovo").setColor("белый").setHDD(1024).createNotebook());
        setOfNotebooks.add(new NotebookBuilder().setName("Notebook 4").setRAM(64).setOS("linux").
                setPrice(90000).setModel("Lenovo").setColor("красный").setHDD(1024).createNotebook());
        //setOfNotebooks.add(new NotebookBuilder().createNotebook());

        Searching search = new Searching();
        //search.printSet(setOfNotebooks);
        search.startSearching(setOfNotebooks);
    }
}