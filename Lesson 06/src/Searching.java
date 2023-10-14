import java.util.*;
public class Searching {
    /**
     Создание "пустого" экземпляра объекта для записи в него критериев поиска через геттеры
     */
    Notebook searchFrame = new NotebookBuilder().createNotebook();

    /**
     * Конструктор (может ещё пригодится)
     */
    public Searching(){
        return;
    }
    private static final Scanner scanner = new Scanner(System.in);
    private int printMenu() {
        while (true) {
            try {
                String str = "Выберите номер операции:\n" +
                        "1. Добавить критерий\n" +
                        "2. Вывести результат поиска\n" +
                        "3. Завершить\n";
                System.out.println(str);
                int num = Integer.parseInt(scanner.next());
                if (num>=1 && num<=3) {
                    return num;
                }else System.out.println("Введите цифру от 1 до 3!");
            } catch (NumberFormatException ex) {
                //ex.printStackTrace();
                System.out.println("Введите цифровое значение!");
            }
        }
    }

    private void addCriterion() {
        Map<Integer, String> mapOfCriterions = new HashMap<Integer, String>();
        System.out.println("Выберите критерий поиска:");
        mapOfCriterions.put(1, "Название");
        mapOfCriterions.put(2, "Модель");
        mapOfCriterions.put(3, "ОС");
        mapOfCriterions.put(4, "RAM");
        mapOfCriterions.put(5, "HDD");
        mapOfCriterions.put(6, "Цвет");
        mapOfCriterions.put(7, "Цена");
        for(Map.Entry<Integer, String> item : mapOfCriterions.entrySet()) {
            System.out.printf("Введите критерий поиска: %s \n", item.getValue());
            if (item. getKey() == 1) {
                String key = scanner.next();
                if (!Objects.equals(key, "q")){
                    searchFrame.setName(key);
                }else searchFrame.setName("не задано");
            }
            if (item. getKey() == 2) {
                String key = scanner.next();
                if (!Objects.equals(key, "q")) {
                    searchFrame.setModel(key);
                }else searchFrame.setModel("не задано");
            }
            if (item. getKey() == 3) {
                String key = scanner.next();
                if (!Objects.equals(key, "q")) {
                    searchFrame.setOS(key);
                }else searchFrame.setOS("не задано");
            }
            if (item. getKey() == 4) {
                String key = scanner.next();
                if (!Objects.equals(key, "q")) {
                    searchFrame.setRAM(Integer.parseInt(key));
                }else searchFrame.setRAM(-1);
            }
            if (item. getKey() == 5) {
                String key = scanner.next();
                if (!Objects.equals(key, "q")) {
                    searchFrame.setHDD(Integer.parseInt(key));
                }else searchFrame.setHDD(-1);
            }
            if (item. getKey() == 6) {
                String key = scanner.next();
                if (!Objects.equals(key, "q")) {
                    searchFrame.setColor(key);
                }else searchFrame.setColor("не задано");
            }
            if (item. getKey() == 7) {
                String key = scanner.next();
                if (!Objects.equals(key, "q")){
                    searchFrame.setPrice(Integer.parseInt(key));
                }else searchFrame.setPrice(-1);
            }
        }
    }

    public void startSearching(HashSet<Notebook> set) {
        int menuItem = printMenu();
        switch (menuItem) {
            case (3):
                System.out.println("Завершение работы программы!");
                break;
            case (1):
                System.out.println("Ввод критерия");
                addCriterion();
            case (2):
                System.out.println("Печать результатов");
                printSet(set);
        }
    }

    /**
     * Выводит на экран содержимое HashSet
     * @param set
     */
    public void printSet(HashSet set) {
        Iterator itr = set.iterator(); //Сreates Iterator object.
        //Сheck element is present or not. If not loop will break.
        while (itr.hasNext()) {
            Notebook itm = (Notebook) itr.next();
            if (itm.equals(searchFrame)){
                System.out.println(String.format("Найдено: %s", itm));
            }
        }
    }

}