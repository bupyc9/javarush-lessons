public class Help {
    void helpon (int what) {
        switch (what) {
            case '1':
                System.out.println("Оператот if:\n");
                System.out.println("if(условия) оператор;");
                System.out.println("else оператор;");
                break;
            case '2':
                System.out.println("Оператот switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа");
                System.out.println("  последовательность операторов");
                System.out.println("  break;");
                System.out.println(" //...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Оператор for:\n");
                System.out.print("for(инициализация; условие; итерация)");
                System.out.println(" оператот;");
                break;
            case '4':
                System.out.println("Оператот while:\n");
                System.out.println("while(условие) оператор;");
                break;
            case '5':
                System.out.println("Оператот do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие);");
                break;
            case '6':
                System.out.println("Оператот break:\n");
                System.out.println("break; или break метка;");
                break;
            case '7':
                System.out.println("Оператот continue:\n");
                System.out.println("continue; или continue метка;");
                break;
        }
        System.out.println();
    }

    void showMenu() {
        System.out.println("Справка:");
        System.out.println(" 1. if");
        System.out.println(" 2. switch");
        System.out.println(" 3. for");
        System.out.println(" 4. while");
        System.out.println(" 5. do-while");
        System.out.println(" 6. break");
        System.out.println(" 7. continue");
    }

    boolean isValid(int ch) {
        return !(ch < '1' | ch > '7' & ch != 'q');
    }
}